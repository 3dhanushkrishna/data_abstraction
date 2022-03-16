package com.harman.dataabstraction;

abstract class Atm {
    abstract void checkATM_balance();
}

class bank extends Atm{
    void checkATM_balance(){
        System.out.println("INR: 3456676");

    }

    public static void main(String[] args) {
        Atm myatm=new bank();
        myatm.checkATM_balance();
    }
}
