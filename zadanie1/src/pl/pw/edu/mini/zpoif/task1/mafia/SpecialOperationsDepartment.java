package pl.pw.edu.mini.zpoif.task1.mafia;

import pl.pw.edu.mini.zpoif.task1.mafia.worker.MafiaWorker;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class SpecialOperationsDepartment extends MafiaOrganization{

    private static String color = "red";
    public static int illegalTransactionValue;

    public SpecialOperationsDepartment(String color, int illegalTransactionValue){
        SpecialOperationsDepartment.color = color;
        SpecialOperationsDepartment.illegalTransactionValue = randomIllegalTransactionValue();
    }

    @Override
    public void work(){
        List<MafiaWorker.DirtyJobGuy> list = new ArrayList<>();
        MafiaWorker.DirtyJobGuy dirtyJobGuy1 = new MafiaWorker.DirtyJobGuy();
        MafiaWorker.DirtyJobGuy dirtyJobGuy2 = new MafiaWorker.DirtyJobGuy();
        MafiaWorker.DirtyJobGuy dirtyJobGuy3 = new MafiaWorker.DirtyJobGuy();
        list.add(dirtyJobGuy1);
        list.add(dirtyJobGuy2);
        list.add(dirtyJobGuy3);
        int randomizer = ThreadLocalRandom.current().nextInt(1, 3 + 1);
        list.get(randomizer).doJob();


    }


    public void internalColor(){
        System.out.println("Kontrola nie jest możliwa.");
    }




    private static int randomIllegalTransactionValue(){
        return ThreadLocalRandom.current().nextInt(10, 20 + 1);
    }


}
