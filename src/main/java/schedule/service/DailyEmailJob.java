package schedule.service;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class DailyEmailJob extends QuartzJobBean {
	private ScheduleService scheduleService;
	public void setScheduleService(ScheduleService scheduleService) {
		this.scheduleService = scheduleService;
	}
	public DailyEmailJob() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void executeInternal(JobExecutionContext arg0)
			throws JobExecutionException {
		// TODO Auto-generated method stub
		scheduleService.sendDailyEmails();
	}
	
	
	
}
