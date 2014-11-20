package schedule.service;


import jmx.service.Hello;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class DailyEmailJob extends QuartzJobBean {
	private ScheduleService scheduleService;
	public void setScheduleService(ScheduleService scheduleService) {
		this.scheduleService = scheduleService;
	}
	
	private Hello hello;
	public void setHello(Hello hello) {
		this.hello = hello;
	}
	
	public DailyEmailJob() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void executeInternal(JobExecutionContext arg0)
			throws JobExecutionException {
		// TODO Auto-generated method stub
		scheduleService.sendDailyEmails();
		hello.getCacheSize();
	}
	
	
	
}
