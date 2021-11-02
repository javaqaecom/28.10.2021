public class Kid extends  Person{
    //fname lname phoneNumber id
    //DATA
    public String play;
    public int clas;

    //func


    public Kid(String fname, String lname, int id, String phoneNumber, String play, int clas) {
        super(fname, lname, id, phoneNumber);
        this.play = play;
        this.clas = clas;
    }

    @Override
    public void WhatAreYouDoing() {
        System.out.println("playing "+this.play);
    }

    @Override
    public String toString() {
        return "Kid{" +
                "play='" + play + '\'' +
                ", clas=" + clas +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", id=" + id +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
