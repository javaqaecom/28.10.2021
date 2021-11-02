public class Person {
    //DATA

   /* public - for all classes
    private  - only for this class
    defult  - for all classes in the sme package
    protected  - for this class and all the extends from it
    */

    public String fname;
    public String lname;
    public int id;
    public String phoneNumber;
    protected int height;

    //fun


    public Person(String fname, String lname, int id, String phoneNumber) {
        this.fname = fname;
        this.lname = lname;
        this.id = id;
        this.phoneNumber = phoneNumber;

    }

    public void WhatAreYouDoing(){

    }

    @Override
    public String toString() {
        return "Person{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", id=" + id +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
