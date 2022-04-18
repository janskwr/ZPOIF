package pl.pw.edu.mini.zpoif.task2.emergencyroom;

import pl.pw.edu.mini.zpoif.task2.emergencyroom.patients.UninsuredPatient;

import java.util.List;

public class Diagnoser extends UninsuredPatient {


    public Diagnoser(int age, List<String> problems) {
        super(age, problems);
    }
}
