package pl.pw.edu.mini.zpoif.task2.emergencyroom;

import pl.pw.edu.mini.zpoif.task2.emergencyroom.patients.UninsuredPatient;

import java.util.List;

public class PatientHolder {

    public static List<UninsuredPatient> patients;
    public static int counter;


    public static List<UninsuredPatient> generator (){
        patients = PatientGenerator.generate(10);
        return patients;
    }

    public static List<UninsuredPatient> getPatients(){
        return patients;
    }


    public static void isCovidPositive(UninsuredPatient uninsuredPatient){
        if (Math.random() <= 0.1) {
            System.out.println("Tak");
        } else {
            System.out.println("Nie");
        }
    }


    public static void generalDiagnose(UninsuredPatient uninsuredPatient){

        counter += 1;
        if (counter > 10){

            System.out.println("Brak limitu punktów");

        } else {
            if (Math.random() <= 0.5){
                System.out.println("Zdrowy");
            } else {
                System.out.println("Chory");
            }
        }



    }


}
