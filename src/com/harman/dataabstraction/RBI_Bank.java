package com.harman.dataabstraction;

abstract class RBI_Bank {
    abstract void setInterestRate();
}
class SBI_Bank extends RBI_Bank {

    void setInterestRate() {
        System.out.println("5%");
    }
}
class ICICI_Bank extends RBI_Bank{
        void setInterestRate(){
            System.out.println("4%");

        }
}

class ABC_Bank{
    public static void main(String[] args) {
        RBI_Bank sbi_obj = new SBI_Bank();
        RBI_Bank icici_obj = new ICICI_Bank();
        System.out.println("sbi interest rate");
        sbi_obj.setInterestRate();
        System.out.println("icici interest rate");
        icici_obj.setInterestRate();
    }
}