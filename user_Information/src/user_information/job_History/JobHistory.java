package user_INFORMATION.job_History;

import user_INFORMATION.basic_Information.Date;

public class JobHistory {

    private StartDate startdate;
    private EndDate enddate;
    private Position position;
    private Department department;
    private Salary salary;
    private Company company;


    public JobHistory() {
        startdate=new StartDate();
        enddate=new EndDate();
        position=new Position();
        department=new Department();
        salary=new Salary();
        company=new Company();
    }

    public String getStartdate() {
        return startdate.getStartDate().getFullDate();
    }

    public void setStartdate(String startdate) {
        this.startdate.setStartDate(startdate);
    }

    public String getEnddate() {
        return enddate.getEndDate().getFullDate();
    }

    public void setEnddate(String enddate) {
        this.enddate.setEndDate(enddate);
    }

    public String getPosition() {
        return position.getPosition();
    }

    public void setPosition(String position) {
        this.position.setPosition(position);
    }

    public String getDepartment() {
        return department.getDepartment();
    }

    public void setDepartment(String department) {
        this.department.setDepartment(department);
    }

    public long getSalary() {
        return salary.getSalary();
    }

    public void setSalary(long salary) {
        this.salary.setSalary(salary);
    }

    public String getCompanyName() {
        return company.getCompanyName().getName();
    }

    public String getCompanyNumber(){
        return company.getCompanyContactInfo().getMobileNumber();
    }

    public String getCompanyEmail(){
        return company.getCompanyContactInfo().getEmail();
    }

    public void setCompany(String companyName, String mobileNumber, String email) {
        this.company.setCompanyName(companyName);
        this.company.setCompanyContactInfo(mobileNumber,email);
    }
}
