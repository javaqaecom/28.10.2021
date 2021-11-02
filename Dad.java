public class Dad extends Person{
    // fname , lname , id , phoneNumber
    //DATA
    public String work;
    public String car;


    //func
    public Dad(String fname, String lname, int id, String phoneNumber, String work, String car) {
        super(fname, lname, id, phoneNumber);
        this.work = work;
        this.car = car;
    }

    public String drive(){
        return  "driving";
    }


    @Override
    public void WhatAreYouDoing() {
        System.out.println("Working");
    }

    @Override
    public String toString() {
        return "Dad{" +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                "work='" + work + '\'' +
                ", car='" + car + '\'' +
                ", id=" + id +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
