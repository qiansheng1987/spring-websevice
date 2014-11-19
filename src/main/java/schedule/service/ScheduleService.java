package schedule.service;

import java.util.ArrayList;

public class ScheduleService {
	
	public void sendDailyEmails() {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add(0, "zhangsan");
		list.add(1, "lisi");
		list.add(2, "wagnwu");
		for (String str : list) {
			sendEmail(str);
		}
	}
	
	/**
	 * 
	* @Title: sendEmail 
	* @Description: TODO
	* @param @param str     
	* @return void     
	* @throws
	 */
	public void sendEmail(String str) {
		
		System.out.println(str);
	}
}





















