import java.util.Date;

public class TaskBean {
	
	private String series;
	private String task;
	private Date startDate;
	private Date endDate;

	public void setSeries(String series) {
		this.series = series;
	}

	public String getSeries() {
		return series;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public String getTask() {
		return task;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getEndDate() {
		return endDate;
	}
}