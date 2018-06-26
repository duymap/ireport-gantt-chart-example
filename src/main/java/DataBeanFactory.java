import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class DataBeanFactory {
	public ArrayList<TaskBean> getBeanList() {
		ArrayList<TaskBean> ganttChartDataList = new ArrayList<TaskBean>();

		Calendar calendar = Calendar.getInstance();

		String series = "";
		for(int i=1;i<9;i++) {
			
			if ( i <= 3) {
				series = "P1 task";
			} else if (i <= 6) {
				series = "P2 task";
			} else {
				series = "P3 task";
			}
			calendar.add(Calendar.DAY_OF_MONTH, i);
			Date startDate = calendar.getTime();
			calendar.add(Calendar.DAY_OF_MONTH, i+1);
			Date endDate = calendar.getTime();
			ganttChartDataList.add(create(series, "Task-"+ i, startDate, endDate));
		}

		return ganttChartDataList;
	}

	private TaskBean create(String series, String task, Date startDate, Date endDate) {
		TaskBean bean = new TaskBean();
		bean.setSeries(series);
		bean.setTask(task);
		bean.setStartDate(startDate);
		bean.setEndDate(endDate);
		return bean;
	}
}