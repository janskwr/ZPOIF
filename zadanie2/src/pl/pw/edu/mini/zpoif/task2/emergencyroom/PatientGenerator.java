package pl.pw.edu.mini.zpoif.task2.emergencyroom;

import pl.pw.edu.mini.zpoif.task2.emergencyroom.patients.AnnoyingPatient;
import pl.pw.edu.mini.zpoif.task2.emergencyroom.patients.CooperatingPatient;
import pl.pw.edu.mini.zpoif.task2.emergencyroom.patients.UnderagePatient;
import pl.pw.edu.mini.zpoif.task2.emergencyroom.patients.UninsuredPatient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PatientGenerator {

    @FunctionalInterface
    interface UninsuredPatientGenerator {
        UninsuredPatient create();
    }

    @FunctionalInterface
    interface AnnoyingPatientGenerator {
        AnnoyingPatient create();
    }

    @FunctionalInterface
    interface CooperatingPatientGenerator {
        CooperatingPatient create();
    }

    @FunctionalInterface
    interface UnderagePatientGenerator {
        UnderagePatient create();
    }



    public static String generateInsuranceId (){
        Random random = new Random();
        StringBuilder insuranceid = new StringBuilder("1044");
        for (int i = 0; i < 4; i++){
            insuranceid.append(random.nextInt(10));
        }
        return insuranceid.toString();
    }

    public static String generateDemandingLevel(){
        Random random = new Random();
        if ( Math.random() <= 0.9) {
            if (Math.random() <= 0.5) {
                return ("SMALL");
            } else {
                return ("AVERAGE");
            }
        } else {
            return ("BIG");
        }

    }


    public static int generateLimitedAge (int limit){
        Random random = new Random();
        return (random.nextInt(limit));
    }


    public static List<String> generateProblem(boolean tick){
        Random random = new Random();
        List<String> problems = Arrays.asList("pogryzienie przez kleszcza", "gorączka", "śpiączka", "rana kłuta");
        List<String> randomproblems = Arrays.asList();
        int randomizer = random.nextInt(4) + 1;
        if (randomizer == 1) {
            randomproblems.add("pogryzienie przez kleszcza");
        } else if (randomizer == 2){
            randomproblems.add("gorączka");
        } else if (randomizer == 3) {
            randomproblems.add("śpiączka");
        } else {
            randomproblems.add("rana kłuta");
        }
        if (tick) {
            randomproblems.add("pogryzienie przez kleszcza");
        }
        return randomproblems;
    }



    public static List<UninsuredPatient> generate(int n){


        List<UninsuredPatient> patients = new ArrayList<>();

        AnnoyingPatientGenerator annoyingPatientGenerator = () -> new AnnoyingPatient(Integer.parseInt(generateInsuranceId()),
        generateLimitedAge(100),
        generateProblem(true),
        generateDemandingLevel());


        CooperatingPatientGenerator cooperatingPatientGenerator = () -> new CooperatingPatient(Integer.parseInt(generateInsuranceId()),
                generateLimitedAge(100),
                generateProblem(true));



        UnderagePatientGenerator underagePatientGenerator = () -> new UnderagePatient(Integer.parseInt(generateInsuranceId()),
                generateLimitedAge(100),
                generateProblem(true));


        for (int i = 0; i < n; i++){
            patients.add(AnnoyingPatient.create());
            patients.add(CooperatingPatient.create());
            patients.add(UnderagePatient.create());
        }

        return patients;

    }






}
