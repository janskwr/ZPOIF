package pl.pw.edu.mini.zpoif.task1.mafia;

import pl.pw.edu.mini.zpoif.task1.mafia.worker.MafiaWorker;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class SalesDepartment extends MafiaOrganization{

    private final List<String> colors = Arrays.asList("blue", "green");

    private int money = SalesDepartment.randomMoney();
    public static String color = SalesDepartment.randomColor();



    @Override
    public void work(){

        if( Math.random() >= 0.9 ) {

            MafiaWorker.LegalTrader legalTrader = new MafiaWorker.LegalTrader();
            legalTrader.makeDeal();
        } else {
            System.out.println("Dealu nie będzie!");
        }

    }


    public void internalControl(){
        MafiaWorker.Controller controller = new MafiaWorker.Controller();
        controller.check();
    }




    private static String randomColor(){
        final List<String> colors = Arrays.asList("blue", "green");
        Random random = new Random();
        return colors.get(random.nextInt(colors.size()));
    }

    private static int randomMoney(){
        return ThreadLocalRandom.current().nextInt(100000, 550000 + 1);
    }


}
