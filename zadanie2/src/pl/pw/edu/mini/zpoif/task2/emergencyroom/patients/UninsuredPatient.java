package pl.pw.edu.mini.zpoif.task2.emergencyroom.patients;

import java.util.List;

public abstract class UninsuredPatient {

    protected int age;
    protected List<String> problems;

    public UninsuredPatient(int age, List<String> problems) {
        this.age = age;
        this.problems = problems;
    }




}
