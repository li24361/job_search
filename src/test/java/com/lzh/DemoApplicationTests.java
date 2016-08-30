package com.lzh;

import com.lzh.domain.JobInfo;
import com.lzh.service.JobService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private JobService jobService;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testJobSearch() throws Exception {
		List<JobInfo> jobInfo = jobService.getJobInfo();
		for (JobInfo info : jobInfo) {
			System.out.println(info);
		}

	}
}
