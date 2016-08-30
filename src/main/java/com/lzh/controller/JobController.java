package com.lzh.controller;

import com.lzh.domain.JobInfo;
import com.lzh.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by lizhihao on 2016/8/24.
 */
@RestController
public class JobController {

    @Autowired
    JobService jobService;

    @RequestMapping("/getJobInfo")
    public List<JobInfo> getJobInfo(){
        return jobService.getJobInfo();
    }
}
