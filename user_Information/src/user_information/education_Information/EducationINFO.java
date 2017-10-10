package user_INFORMATION.education_Information;

public class EducationINFO {

    private ExamName examName;
    private ExamYear examYear;
    private Group group;
    private Result result;

    public EducationINFO() {
        examName=new ExamName();
        examYear=new ExamYear();
        group=new Group();
        result=new Result();
    }

    public String getExamName() {
        return examName.getExamName();
    }

    public void setExamName(String giveName) {
        this.examName.setExamName(giveName);
    }

    public String getExamYear() {
        return examYear.getExamYear();
    }

    public void setExamYear(String giveYear) {
        this.examYear.setExamYear(giveYear);
    }

    public String  getGroup() {
        return group.getGroup();
    }

    public void setGroup(String giveGroup) {
        this.group.setGroup(giveGroup);
    }

    public double getGPA() {
        return result.getGpa().getGpa();
    }

    public String getGrad(){
        return result.getGrad().getGrad();
    }

    public void setResult(double gpa, String grad) {
        this.result.setGpa(gpa);
        this.result.setGrad(grad);
    }
}
