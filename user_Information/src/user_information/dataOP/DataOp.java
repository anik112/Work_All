package user_INFORMATION.dataOP;


import java.util.InputMismatchException;
import java.util.Scanner;

public class DataOp {


    private ObjectClass objectClass=new ObjectClass();
    private String setString1;
    private String setString2;
    private String setString3;
    private int code;

    public void addAllData(){

        Scanner scanner=new Scanner(System.in);

        try {

            System.out.println("Basic Information: ");
            System.out.print("ID number: ");
            objectClass.getBasicINFO().setIdNumber(scanner.nextLong());
            System.out.print("User Name: ");
            objectClass.getBasicINFO().setName(scanner.next());
            System.out.print("User Date of Birth: ");
            objectClass.getBasicINFO().setDateOfBirth(scanner.next());
            System.out.println("\nContact Information: ");
            System.out.print("User Mobile Number: ");
            objectClass.getContactINFO().setMobileNumber(scanner.next());
            System.out.print("User Email: ");
            objectClass.getContactINFO().setEmail(scanner.next());
            System.out.println("\nPermanent Address: ");
            System.out.print("Address Description: ");
            setString1=scanner.next();
            System.out.print("City: ");
            setString2=scanner.next();
            System.out.print("Zip Code: ");
            code=scanner.nextInt();
           // scanner.next();
            objectClass.getPermanent().setPermanentAddress(setString1,setString2,code);
            System.out.println("\nPresent Address: ");
            System.out.print("Address Description: ");
            setString1=scanner.next();
            System.out.print("City: ");
            setString2=scanner.next();
            System.out.print("Zip Code: ");
            code=scanner.nextInt();
           // scanner.next();
            objectClass.getPresent().setPresentAddress(setString1,setString2,code);
            System.out.println("\nEducation Information: ");
            System.out.print("Exam Name: ");
            objectClass.getEducationINFO().setExamName(scanner.next());
            System.out.print("Exam Year: ");
            objectClass.getEducationINFO().setExamYear(scanner.next());
            System.out.print("Group: ");
            objectClass.getEducationINFO().setGroup(scanner.next());
            System.out.print("GPA: ");
            double setGpa=scanner.nextDouble();
            System.out.print("Grad: ");
            String setGrad=scanner.next();
            // scanner.next();
            objectClass.getEducationINFO().setResult(setGpa,setGrad);
            System.out.println("\nJob History: ");
            System.out.print("Start Date: ");
            objectClass.getJobHistory().setStartdate(scanner.next());
            System.out.print("End Date: ");
            objectClass.getJobHistory().setEnddate(scanner.next());
            System.out.print("Position: ");
            objectClass.getJobHistory().setPosition(scanner.next());
            System.out.print("Salary: ");
            objectClass.getJobHistory().setSalary(scanner.nextLong());
            // scanner.next();
            System.out.print("Department: ");
            objectClass.getJobHistory().setDepartment(scanner.next());
            System.out.println("\nCompany: ");
            System.out.print("Company Name: ");
            setString1=scanner.next();
            System.out.print("Company Number: ");
            setString2=scanner.next();
            System.out.print("Company Email: ");
            setString3=scanner.next();
            objectClass.getJobHistory().setCompany(setString1,setString2,setString3);
            System.out.println("\nCriminal Record: ");
            System.out.print("Status: ");
            objectClass.getCriminalRecards().setStatus(scanner.next());
            System.out.println("\nSports And Activates: ");
            System.out.print("Club Name: ");
            objectClass.getSportsActivates().setClubName(scanner.next());
            System.out.print("Club Number: ");
            setString1=scanner.next();
            System.out.print("Club Email: ");
            setString2=scanner.next();
            objectClass.getSportsActivates().setClubContactINFO(setString1,setString2);
            System.out.print("Club Address: ");
            setString1=scanner.next();
            System.out.print("City: ");
            setString2=scanner.next();
            System.out.print("Zip Code: ");
            code=scanner.nextInt();
            // scanner.next();
            objectClass.getSportsActivates().setClubAddress(setString1,setString2,code);
            System.out.print("Award: ");
            objectClass.getSportsActivates().setAward(scanner.next());
            System.out.print("Description: ");
            objectClass.getSportsActivates().setDescription(scanner.next());
            System.out.println("\nProfessional Training: ");
            System.out.print("Training Name: ");
            objectClass.getProfessionalTraining().setTrainingName(scanner.next());
            System.out.print("Organization Name: ");
            objectClass.getProfessionalTraining().setOrganizationName(scanner.next());
            System.out.print("Organization Number: ");
            setString1=scanner.next();
            System.out.print("Organization Email: ");
            setString2=scanner.next();
            objectClass.getProfessionalTraining().setOrganizationNumberAndEmail(setString1,setString2);
            System.out.print("Organization Address: ");
            setString1=scanner.next();
            System.out.print("City: ");
            setString2=scanner.next();
            System.out.print("Zip Code: ");
            code=scanner.nextInt();
            // scanner.next();
            objectClass.getProfessionalTraining().setOrganizationAddress(setString1,setString2,code);
            System.out.print("Duration: ");
            objectClass.getProfessionalTraining().setDuration(scanner.next());
            System.out.println("\nIT knowledge: ");
            System.out.print("Name: ");
            objectClass.getItKnowledge().setTiName(scanner.next());
            System.out.print("Skill: ");
            objectClass.getItKnowledge().setLaveSkill(scanner.next());
            System.out.println("\nReferences: ");
            System.out.print("Name: ");
            objectClass.getReferences().setRefName(scanner.next());
            System.out.print("Number: ");
            setString1=scanner.next();
            System.out.print("Email: ");
            setString2=scanner.next();
            objectClass.getReferences().setContactINFO(setString1,setString2);

            System.out.println("\n-----------------------------------------------------------------------------------");

        }catch(Exception e){
            System.err.println("Given Data is not correct...");
        }

    }


    public void showAllInformation(){

        System.out.println("-----------------------------  All Information ----------------------------------");

        System.out.println("Basic Information: ");
        System.out.println("\tID number: "+objectClass.getBasicINFO().getIdNumber());
        System.out.println("\tUser Name: "+objectClass.getBasicINFO().getName());
        System.out.println("\tUser Date of Birth: "+objectClass.getBasicINFO().getDateOfBirth());
        System.out.println("Contact Information: ");
        System.out.println("\tUser Mobile Number: "+objectClass.getContactINFO().getMobileNumber());
        System.out.println("\tUser Email: "+objectClass.getContactINFO().getEmail());
        System.out.println("Permanent Address: ");
        System.out.println("\tAddress Description: "+objectClass.getPermanent().addressDescription());
        System.out.println("\tCity: "+objectClass.getPermanent().getCity());
        System.out.println("\tZip Code: "+objectClass.getPermanent().getZipCode());
        System.out.println("Present Address: ");
        System.out.println("\tAddress Description: "+objectClass.getPresent().addressDescription());
        System.out.println("\tCity: "+objectClass.getPresent().getCity());
        System.out.println("\tZip Code: "+objectClass.getPresent().getZipCode());
        System.out.println("Education Information: ");
        System.out.println("\tExam Name: "+objectClass.getEducationINFO().getExamName());
        System.out.println("\tExam Year: "+objectClass.getEducationINFO().getExamYear());
        System.out.println("\tGroup: "+objectClass.getEducationINFO().getGroup());
        System.out.println("\tGPA: "+objectClass.getEducationINFO().getGPA());
        System.out.println("\tGrad: "+objectClass.getEducationINFO().getGrad());
        System.out.println("Job History: ");
        System.out.println("\tStart Date: "+objectClass.getJobHistory().getStartdate());
        System.out.println("\tEnd Date: "+objectClass.getJobHistory().getEnddate());
        System.out.println("\tPosition: "+objectClass.getJobHistory().getPosition());
        System.out.println("\tSalary: "+objectClass.getJobHistory().getSalary());
        System.out.println("\tDepartment: "+objectClass.getJobHistory().getDepartment());
        System.out.println("Company: ");
        System.out.println("\tCompany Name: "+objectClass.getJobHistory().getCompanyName());
        System.out.println("\tCompany Number: "+objectClass.getJobHistory().getCompanyNumber());
        System.out.println("\tCompany Email: "+objectClass.getJobHistory().getCompanyEmail());
        System.out.println("Criminal Record: ");
        System.out.println("\tStatus: "+objectClass.getCriminalRecards().getStatus());
        System.out.println("Sports And Activates: ");
        System.out.println("\tClub Name: "+objectClass.getSportsActivates().getClubName());
        System.out.println("\tClub Number: "+objectClass.getSportsActivates().getClubMobileNumber());
        System.out.println("\tClub Email: "+objectClass.getSportsActivates().getClubEmail());
        System.out.println("\tClub Address: "+objectClass.getSportsActivates().getClubAddressDes());
        System.out.println("\tCity: "+objectClass.getSportsActivates().getClubCity());
        System.out.println("\tZip Code: "+objectClass.getSportsActivates().getClubZipCode());
        System.out.println("\tAward: "+objectClass.getSportsActivates().getAward());
        System.out.println("\tDescription: "+objectClass.getSportsActivates().getDescription());
        System.out.println("Professional Training: ");
        System.out.println("\tTraining Name: "+objectClass.getProfessionalTraining().getTrainingName());
        System.out.println("\tOrganization Name: "+objectClass.getProfessionalTraining().getOrgName());
        System.out.println("\tOrganization Number: "+objectClass.getProfessionalTraining().getOrgMobileNumber());
        System.out.println("\tOrganization Email: "+objectClass.getProfessionalTraining().getOrgEmail());
        System.out.println("\tOrganization Address: "+objectClass.getProfessionalTraining().getOrgAddress());
        System.out.println("\tCity: "+objectClass.getProfessionalTraining().getOrgCity());
        System.out.println("\tZip Code: "+objectClass.getProfessionalTraining().getOrgZipCode());
        System.out.println("\tDuration: "+objectClass.getProfessionalTraining().getDuration());
        System.out.println("IT knowledge: ");
        System.out.println("\tName: "+objectClass.getItKnowledge().getTiName());
        System.out.println("\tSkill: "+objectClass.getItKnowledge().getLaveSkill());
        System.out.println("References: ");
        System.out.println("\tName: "+objectClass.getReferences().getRefName());
        System.out.println("\tNumber: "+objectClass.getReferences().getMobileNumber());
        System.out.println("\tEmail: "+objectClass.getReferences().getEmail());

    }


}
