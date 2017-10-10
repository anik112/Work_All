package user_INFORMATION.it_Knowlwdge;

import user_INFORMATION.basic_Information.Name;

public class ItKnowledge {

    private Name tiName;
    private LaveSkill laveSkill;

    public ItKnowledge() {
        tiName=new Name();
        laveSkill=new LaveSkill();
    }

    public void setTiName(String tiName) {
        this.tiName.setName(tiName);
    }

    public void setLaveSkill(String laveSkill) {
        this.laveSkill.setLavalSkill(laveSkill);
    }

    public String getTiName() {
        return tiName.getName();
    }

    public String getLaveSkill() {
        return laveSkill.getLavalSkill();
    }
}
