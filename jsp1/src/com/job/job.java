package com.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component("taskJob")
public class job  {
	
	@Scheduled(cron = "0 * * * * ?")
	public void method() {

	}

	@Scheduled(fixedDelay =1000)
	public void method2() {

	}

}
