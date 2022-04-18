package pl.edu.pw.mini.zpoif.task5.machine;

import java.lang.annotation.Annotation;
import java.util.Set;

import pl.edu.pw.mini.zpoif.task5.people.MafiaWorker;
import pl.edu.pw.mini.zpoif.task5.people.special.ButtonMan;

public abstract class MafiaMachine {

	protected abstract Annotation[] createImportantMafiaWorkers() throws ClassNotFoundException, InstantiationException, IllegalAccessException;
	protected abstract MafiaWorker createPrimaryMafiaWorker() throws MafiaException, ClassNotFoundException;
	protected abstract MafiaWorker createPrioritizedPrimaryMafiaWorker() throws ClassNotFoundException;
	protected abstract void encryptFields(Set<MafiaWorker> workers);
	protected abstract ButtonMan getKiller(String name, String surname) throws MafiaException;
	protected abstract void init(MafiaWorker mafiaWorker);
	protected abstract void goButtonMan(Set<MafiaWorker> buttonMan);
}
