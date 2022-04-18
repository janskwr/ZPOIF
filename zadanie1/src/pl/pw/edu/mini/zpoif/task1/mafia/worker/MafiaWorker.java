package pl.pw.edu.mini.zpoif.task1.mafia.worker;

import pl.pw.edu.mini.zpoif.task1.mafia.MafiaOrganization;
import pl.pw.edu.mini.zpoif.task1.mafia.SalesDepartment;
import pl.pw.edu.mini.zpoif.task1.mafia.SpecialOperationsDepartment;

import java.util.Objects;

public abstract class MafiaWorker {


    public static class LegalTrader extends MafiaWorker {

        private static int transactionSummary = 0;

        public void makeDeal(){
            System.out.println("nielegalna transakcja dokonana");
            transactionSummary += MafiaOrganization.VALUE_OF_SINGLE_LEGAL_TRANSACTION * 2;
        }

    }


    public static class Controller extends MafiaWorker {

        public void check(){
            System.out.println("Kontroluje!");
            if(Objects.equals(SalesDepartment.color, "green")){
                System.out.println("Nie trzeba kontrolować!");
            }
        }
    }

    public static class Recruiter extends MafiaWorker {

        public void recruit(){
            if( Math.random() >= 0.5 ) {
                System.out.println("Zrekrutowałem!");
            } else {
                System.out.println("Porażka! :(");
            }
        }

    }


    public static class DirtyJobGuy extends MafiaWorker {

        public void doJob(){
            System.out.println("Wykonuje mokra robote!");
        }

    }


    public static class TheGodfather extends MafiaWorker {

        public void bless(){
            System.out.println("Popieram!");
        }
    }

    public static class IllegalTrader extends MafiaWorker {

        private static int transactionSummary = 0;

        public void makeDeal(){
            System.out.println("nielegalna transakcja dokonana");
            transactionSummary += SpecialOperationsDepartment.illegalTransactionValue;
        }

    }

}
