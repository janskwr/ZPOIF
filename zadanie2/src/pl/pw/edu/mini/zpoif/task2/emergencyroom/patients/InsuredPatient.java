package pl.pw.edu.mini.zpoif.task2.emergencyroom.patients;

import java.util.List;

public abstract class InsuredPatient extends UninsuredPatient {

    protected int id;

    public InsuredPatient(int id, int age, List<String> problems) {
        super(age, problems);
        this.id = id;
    }
}
