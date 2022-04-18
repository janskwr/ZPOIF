package pl.edu.pw.mini.zpoif.task5.solution;

import pl.edu.pw.mini.zpoif.task5.machine.MafiaException;
import pl.edu.pw.mini.zpoif.task5.machine.MafiaMachine;
import pl.edu.pw.mini.zpoif.task5.people.MafiaWorker;
import pl.edu.pw.mini.zpoif.task5.people.special.ButtonMan;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Set;

public class Demonstrator extends MafiaMachine {
    @ImportantWorker
    protected Annotation[] createImportantMafiaWorkers() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class klasa = Class.forName("pl.edu.pw.mini.zpoif.fifth.task5.people");
        Field[] fields = klasa.getDeclaredFields();
        Annotation[] annotations = new Annotation[0];
        for (Field f : fields) {
            annotations = f.getAnnotations();
        }
        return annotations;
    }

    @PrimaryMafiaWorker
    protected MafiaWorker createPrimaryMafiaWorker() throws MafiaException, ClassNotFoundException {
        Class klasa = Class.forName("pl.edu.pw.mini.zpoif.fifth.task5.people");
        Class[] classes = klasa.getDeclaredClasses();
        for (Class c : classes) {
            Annotation[] annotations = c.getAnnotations();
            if(annotations.length > 1){
                MafiaException MafiaException = null;
                throw MafiaException;
            }
        }
        return null;
    }

    @Override
    protected MafiaWorker createPrioritizedPrimaryMafiaWorker() throws ClassNotFoundException {
        Class klasa = Class.forName("pl.edu.pw.mini.zpoif.fifth.task5.people");
        Class[] classes = klasa.getDeclaredClasses();
        for (Class c : classes) {
            int prirityMAX = classes.;
            if (c.pririty > prirityMAX) {
                prirityMAX = c.pririty;
            }
            Annotation[] annotations = c.getAnnotations();
            if (annotations.length > 1){

            }
        }
        return null;
    }

    @Override
    protected void encryptFields(Set<MafiaWorker> workers) {

    }

    @Override
    protected ButtonMan getKiller(String name, String surname) throws MafiaException {

        return null;
    }

    @Override
    protected void init(MafiaWorker mafiaWorker) {

    }

    @Override
    protected void goButtonMan(Set<MafiaWorker> buttonMan) {

    }
}
