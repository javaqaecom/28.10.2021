public class Mom extends Person{
    // fname lname id phone number height
    //DATA
    public String Shopping ;
    public String work;

    //func


    public Mom(String fname, String lname, int id, String phoneNumber, String shopping, String work) {
        super(fname, lname, id, phoneNumber);
        Shopping = shopping;
        this.work = work;
    }

    @Override
    public void WhatAreYouDoing() {
        System.out.println("Shopping after a long day in work ");

    }

    @Override
    public String toString() {
        return "Mom{" +
                "Shopping='" + Shopping + '\'' +
                ", work='" + work + '\'' +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", id=" + id +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
