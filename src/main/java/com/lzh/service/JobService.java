package com.lzh.service;

import com.google.common.base.Splitter;
import com.lzh.domain.JobInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by lizhihao on 2016/8/24.
 */
@Service
public class JobService {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<JobInfo> getJobInfo() {
        String sql = "SELECT id, company_id, company, position_id, position, position_advantage,salary, education,  position_url, address FROM job_info";
        return jdbcTemplate.query(sql, new RowMapper<JobInfo>() {
            @Override
            public JobInfo mapRow(ResultSet rs, int i) throws SQLException {
                JobInfo jobInfo = new JobInfo();
                jobInfo.setId(rs.getInt(1));
                jobInfo.setCompanyId(rs.getInt(2));
                jobInfo.setCompany(rs.getString(3));
                jobInfo.setPositionId(rs.getInt(4));
                jobInfo.setPosition(rs.getString(5));
                jobInfo.setPositionAdvantage(rs.getString(6));
                jobInfo.setSalary(rs.getString(7));
                jobInfo.setEducation(rs.getString(8));
                jobInfo.setPositionUrl(rs.getString(9));
                List<String> adds = Splitter.on("-").omitEmptyStrings().splitToList(rs.getString(10));
                if(!CollectionUtils.isEmpty(adds)){
                    jobInfo.setAddress(adds.get(adds.size()-1));
                }
                return jobInfo;
            }
        });
    }
}
