package user_INFORMATION.profasonalTranning;

import user_INFORMATION.basic_Information.Name;

public class ProfessionalTraining {

    private Name trainingName;
    private Organization organization;
    private Duration duration;


    public ProfessionalTraining() {
        trainingName=new Name();
        organization=new Organization();
        duration=new Duration();
    }


    public void setTrainingName(String trainingName) {
        this.trainingName.setName(trainingName);
    }

    public void setOrganizationName(String organizationName) {
        this.organization.setOrgName(organizationName);
    }

    public void setOrganizationNumberAndEmail(String organizationNumber,String organizationEmail) {
        this.organization.setOrgContactINFO(organizationNumber,organizationEmail);
    }

    public void setOrganizationAddress(String orgAddress, String city, int zipCode) {
        this.organization.setOrgAddress(orgAddress,city,zipCode);
    }

    public void setDuration(String duration){
        this.duration.setDuration(duration);
    }



    public String getTrainingName(){
        return trainingName.getName();
    }

    public String getOrgName(){
        return organization.getOrgName().getName();
    }

    public String getOrgMobileNumber(){
        return organization.getOrgContactINFO().getMobileNumber();
    }

    public String getOrgEmail(){
        return organization.getOrgContactINFO().getEmail();
    }

    public String getOrgAddress(){
        return organization.getOrgAddress().getAddressDescription();
    }

    public String getOrgCity(){
        return organization.getOrgAddress().getCity();
    }

    public int getOrgZipCode(){
        return organization.getOrgAddress().getZipCode();
    }

    public String getDuration(){
        return duration.getDuration();
    }
}
