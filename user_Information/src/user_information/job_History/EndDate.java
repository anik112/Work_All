package user_INFORMATION.job_History;

import user_INFORMATION.basic_Information.Date;

public class EndDate {

    private Date endDate;

    public EndDate() {
        endDate=new Date();
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(String giveEndDate) {
        this.endDate.setFullDate(giveEndDate);
    }
}
