package schedule.service;

import java.util.TimerTask;

public class DailyEmailTask extends TimerTask {
	
	public DailyEmailTask() {
		// TODO Auto-generated constructor stub
	}
	
	private ScheduleService scheduleService;
	
	public void setScheduleService(ScheduleService scheduleService) {
		this.scheduleService = scheduleService;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		scheduleService.sendDailyEmails();
	}
	
}
