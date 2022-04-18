package pl.pw.edu.mini.zpoif.task1.mafia;

import pl.pw.edu.mini.zpoif.task1.mafia.worker.MafiaWorker;

public class Management extends MafiaOrganization {

    private static boolean godfather;


    public Management (boolean godfather){
        Management.godfather = hasGodfather();
    }

    @Override
    public void work(){

        MafiaWorker.TheGodfather theGodfather = new MafiaWorker.TheGodfather();
        if( Math.random() <= 0.4 ) {
            theGodfather.bless();
        }
    }




    public boolean hasGodfather(){
        if( Math.random() >= 0.5 ) {
            return true;
        } else {
            return false;
        }
    }

}
