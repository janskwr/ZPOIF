package pl.edu.pw.mini.zpoif.task5.people.special;

import pl.edu.pw.mini.zpoif.task5.people.MafiaWorker;
import pl.edu.pw.mini.zpoif.task5.solution.EncryptIt;
import pl.edu.pw.mini.zpoif.task5.solution.ImportantWorker;
import pl.edu.pw.mini.zpoif.task5.solution.PrimaryMafiaWorker;

public class Accountant extends MafiaWorker {

	@ImportantWorker(quantity = 3)

	@PrimaryMafiaWorker

	@EncryptIt

	public Accountant() {
		super();
	}

	public Accountant(String name, String surname) {
		super(name, surname);
	}

	public Accountant(String name) {
		super(name);
	}

}
