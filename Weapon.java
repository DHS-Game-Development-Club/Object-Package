package objects;
//@author edwardsdw
public class Weapon {
    private String name, desc;
    private int atk;
        //Art has not been implemeted at all.
    //Constructors:
    public Weapon()  {
        name = "nullNAME";
        desc = "nullDESC";
        atk = 0;
    }
    public Weapon(String iName, String iDesc, int iATK)  {
        name = "nullNAME";
        desc = "nullDESC";
        atk = 0;
        sName(iName);
        sDesc(iDesc);
        sATK(iATK);
    }
    //Accessors:
    public String rName()  {
        return name;
    }
    public String rDesc()  {
        return desc;
    }
    public int rATK()  {
        return atk;
    }
    public void sName(String iName)  {
        if (!iName.equals("") && !iName.equals("nullNAME") && !iName.equals("nullDESC"))
            name = iName;
    }
    public void sDesc(String iDesc)  {
        if (!iDesc.equals("") && !iDesc.equals("nullNAME") && !iDesc.equals("nullDESC"))
            desc = iDesc;
    }
    public void sATK(int iATK)  {
        if (iATK >= 0)
            atk = iATK;
    }
    //Mutators:
    public boolean equals(Weapon iWeapon)  {
        if (name.equals(iWeapon.rName()) && desc.equals(iWeapon.rDesc()) && atk == iWeapon.rATK())
            return true;
        else
            return false;
    }
    public void setBlank()  {
        name = "nullNAME";
        desc = "nullDESC";
        atk = 0;
    }
    //Overloaders:
        //I'm thinking that we won't need a toString method for anything other than testing, so there won't be one.
}
