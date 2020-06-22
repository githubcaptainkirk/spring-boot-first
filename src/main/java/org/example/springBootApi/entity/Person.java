package org.example.springBootApi.entity;

import java.util.List;

public class Person {

    private String vorname;
    private String name;
    List<String> skill;

    public Person(String vorname, String name, List<String> skills) {
        this.vorname = vorname;
        this.name = name;
        this.skill = skills;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSkills() {
        return skill;
    }

    public void setSkills(List<String> skills) {
        this.skill = skills;
    }
}
