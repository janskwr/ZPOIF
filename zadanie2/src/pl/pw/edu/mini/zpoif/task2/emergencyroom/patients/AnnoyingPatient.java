package pl.pw.edu.mini.zpoif.task2.emergencyroom.patients;

import java.util.List;

public class AnnoyingPatient extends InsuredPatient {

    protected String entitlement;

    public AnnoyingPatient(int id, int age, List<String> problems, String entitlement) {
        super(id, age, problems);
        this.entitlement = entitlement;
    }


}
