package pl.edu.pw.mini.zpoif.task5.people.special;

import pl.edu.pw.mini.zpoif.task5.people.MafiaWorker;
import pl.edu.pw.mini.zpoif.task5.solution.ImportantWorker;
import pl.edu.pw.mini.zpoif.task5.solution.InitMe;
import pl.edu.pw.mini.zpoif.task5.solution.PrimaryMafiaWorker;

public class GodFather extends MafiaWorker {

	protected Wallet wallet;

	@ImportantWorker(quantity = 1)

	@PrimaryMafiaWorker(pririty = 1)

	@InitMe
	protected class Wallet {

		private int value;
		public Wallet(int value) {
			this.value = value;
		} 

	}
	
	public GodFather() {
		super();
	}

	public GodFather(String name, String surname) {
		super(name, surname);
	}

	public GodFather(String name) {
		super(name);
	}

}
