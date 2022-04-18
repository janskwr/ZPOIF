package pl.edu.pw.mini.zpoif.task5.people.special;

import pl.edu.pw.mini.zpoif.task5.people.MafiaWorker;
import pl.edu.pw.mini.zpoif.task5.solution.PrimaryMafiaWorker;

public class Spy extends MafiaWorker {

	@PrimaryMafiaWorker(pririty = 3)

	public Spy() {
		super();
	}

	public Spy(String name, String surname) {
		super(name, surname);
	}

	public Spy(String name) {
		super(name);
	}

}
