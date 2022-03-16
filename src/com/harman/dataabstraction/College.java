package com.harman.dataabstraction;

public interface College {
    void setAcadamicfee();
}
 class CSE_fee implements College{
    public void setAcadamicfee() {
        System.out.println("INR: 60000");

    }
}
  class Mech_fee implements College{

    public void setAcadamicfee() {
        System.out.println("INR: 100000");

    }
}
class CollegeAdministractor{
    public static void main(String[] args) {
        College cseob = new CSE_fee();
        System.out.println("Cse department fees");
        cseob.setAcadamicfee();
        College mecobj = new Mech_fee();
        System.out.println("Mech depart fees: ");
        mecobj.setAcadamicfee();
    }
}