package user_INFORMATION.job_History;

import user_INFORMATION.basic_Information.Date;

public class StartDate {

    private Date startDate;

    public StartDate() {
        startDate=new Date();
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(String giveStartDate) {
        this.startDate.setFullDate(giveStartDate);
    }
}
