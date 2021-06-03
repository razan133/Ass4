/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author hp
 */
public class Student {

    private int id;
    private String name;
    private String SID;
    private String major;
    private double educationalGrade;
    

    public Student() {
    }

    public Student(int id, String name, String SID, double educationalGrade) {
        this.id = id;
        this.name = name;
        this.SID = SID;
        this.educationalGrade = educationalGrade;
    }

    public Student(String name, double educationalGrade) {
        this.name = name;
        this.educationalGrade = educationalGrade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSID() {
        return SID;
    }

    public void setSID(String SID) {
        this.SID = SID;
    }

    public double geteducationalGrade() {
        return educationalGrade;
    }

    public void seteducationalGrade(double educationalGrade) {
        this.educationalGrade = educationalGrade;
    }

//    @Override
//    public String toString() {
//        return System.out.println( id, name, SID, educationalGrade);
//    }

    /**
     * @return the major
     */
    public String getMajor() {
        return major;
    }

    /**
     * @param major the major to set
     */
    public void setMajor(String major) {
        this.major = major;
    }
}
