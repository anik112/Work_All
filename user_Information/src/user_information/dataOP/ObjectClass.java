package user_INFORMATION.dataOP;

import user_INFORMATION.address_Information.Permanent;
import user_INFORMATION.address_Information.Present;
import user_INFORMATION.basic_Information.BasicINFO;
import user_INFORMATION.contact_Information.ContactINFO;
import user_INFORMATION.criminal_Recards.CriminalRecards;
import user_INFORMATION.education_Information.EducationINFO;
import user_INFORMATION.it_Knowlwdge.ItKnowledge;
import user_INFORMATION.job_History.JobHistory;
import user_INFORMATION.profasonalTranning.ProfessionalTraining;
import user_INFORMATION.references.References;
import user_INFORMATION.sports_Actirivates.SportsActivates;

public class ObjectClass {

    private BasicINFO basicINFO;
    private ContactINFO contactINFO;
    private Permanent permanent;
    private Present present;
    private EducationINFO educationINFO;
    private JobHistory jobHistory;
    private CriminalRecards criminalRecards;
    private SportsActivates sportsActivates;
    private ProfessionalTraining professionalTraining;
    private ItKnowledge itKnowledge;
    private References references;


    public ObjectClass() {
        basicINFO=new BasicINFO();
        contactINFO=new ContactINFO();
        permanent=new Permanent();
        present=new Present();
        educationINFO=new EducationINFO();
        jobHistory=new JobHistory();
        criminalRecards=new CriminalRecards();
        sportsActivates=new SportsActivates();
        professionalTraining=new ProfessionalTraining();
        itKnowledge=new ItKnowledge();
        references=new References();
    }

    public BasicINFO getBasicINFO() {
        return basicINFO;
    }

    public ContactINFO getContactINFO() {
        return contactINFO;
    }

    public Permanent getPermanent() {
        return permanent;
    }

    public Present getPresent() {
        return present;
    }

    public EducationINFO getEducationINFO() {
        return educationINFO;
    }

    public JobHistory getJobHistory() {
        return jobHistory;
    }

    public CriminalRecards getCriminalRecards() {
        return criminalRecards;
    }

    public SportsActivates getSportsActivates() {
        return sportsActivates;
    }

    public ProfessionalTraining getProfessionalTraining() {
        return professionalTraining;
    }

    public ItKnowledge getItKnowledge() {
        return itKnowledge;
    }

    public References getReferences() {
        return references;
    }

}
