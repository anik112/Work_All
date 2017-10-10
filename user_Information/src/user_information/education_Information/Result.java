package user_INFORMATION.education_Information;

public class Result {

    private Gpa gpa;
    private Grad grad;

    public Result() {
        gpa=new Gpa();
        grad=new Grad();
    }

    public Gpa getGpa() {
        return gpa;
    }

    public void setGpa(double giveGpa) {
        this.gpa.setGpa(giveGpa);
    }

    public Grad getGrad() {
        return grad;
    }

    public void setGrad(String giveGrad) {
        this.grad.setGrad(giveGrad);
    }
}
