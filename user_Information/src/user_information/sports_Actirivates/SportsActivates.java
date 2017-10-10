package user_INFORMATION.sports_Actirivates;

public class SportsActivates {

    private Club club;
    private Award award;
    private Description description;


    public SportsActivates() {
        club=new Club();
        award=new Award();
        description=new Description();
    }

    public String getClubName() {
        return club.getClubName();
    }

    public String getClubMobileNumber(){
        return club.getClubContactINFO().getMobileNumber();
    }

    public String getClubEmail(){
        return club.getClubContactINFO().getEmail();
    }

    public String getClubAddressDes(){
        return club.getClubAddress().getAddressDescription();
    }

    public String getClubCity(){
        return club.getClubAddress().getCity();
    }

    public int getClubZipCode(){
        return club.getClubAddress().getZipCode();
    }

    public String getAward() {
        return award.getAward();
    }

    public String getDescription() {
        return description.getDescription();
    }




    public void setClubName(String clubName) {
        this.club.setClubName(clubName);
    }

    public void setClubContactINFO(String clubMobileNumber, String clubEmail) {
        this.club.setClubContactINFO(clubMobileNumber,clubEmail);
    }

    public void setClubAddress(String clubAddress, String city, int zipCode){
        this.club.setClubAddress(clubAddress,city,zipCode);
    }

    public void setAward(String award) {
        this.award.setAward(award);
    }

    public void setDescription(String description) {
        this.description.setDescription(description);
    }
}
