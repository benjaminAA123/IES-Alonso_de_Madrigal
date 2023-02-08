package com.iesam.AlonsoDeMadrigal.domain.models;

public class Pupil extends People {


    private String mother;
    private String father;
    private String email;


    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
