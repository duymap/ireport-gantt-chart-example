import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class DataBeanFactory {
	public ArrayList<TaskBean> getBeanList() {
		ArrayList<TaskBean> ganttChartDataList = new ArrayList<TaskBean>();

		Calendar calendar = Calendar.getInstance();

		for(int i=1;i<8;i++) {
			calendar.set(Calendar.HOUR_OF_DAY, i*1);
			Date startDate = calendar.getTime();
			calendar.set(Calendar.HOUR_OF_DAY, i*3);
			Date endDate = calendar.getTime();
			String series = (i % 2 == 0) ? "High Priority" : "Normal";
			ganttChartDataList.add(create(series, "Task" + i, startDate, endDate));
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