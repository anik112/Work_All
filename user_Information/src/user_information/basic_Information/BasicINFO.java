package user_INFORMATION.basic_Information;

public class BasicINFO {

    private IdNumber idNumber;
    private Name name;
    private Date date;


    public BasicINFO() {
        idNumber=new IdNumber();
        name=new Name();
        date=new Date();
    }

    public long getIdNumber() {
        return idNumber.getIdNumber();
    }

    public void setIdNumber(long giveId) {
        this.idNumber.setIdNumber(giveId);
    }

    public String getName() {
        return name.getName();
    }

    public void setName(String giveName) {
        this.name.setName(giveName);
    }

    public String getDateOfBirth() {
        return date.getFullDate();
    }

    public void setDateOfBirth(String dateOFbirth) {
        this.date.setFullDate(dateOFbirth);
    }
}
