package pl.edu.pw.mini.zpoif.task4a.solution;

import pl.edu.pw.mini.zpoif.task4a.MyLovelySittingRoom;
import pl.edu.pw.mini.zpoif.task4a.SittingRoom;

public abstract class Solution {

	public void demonstrate() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {
		SittingRoom room = new MyLovelySittingRoom();
		task1();
		task2();
		task3(room);
		task4(room);
		task5(room);
		task6(room);
		task7(room);
		task8(room);
		task9(room);
	}

	protected abstract MyLovelySittingRoom task1() throws ClassNotFoundException, IllegalAccessException, InstantiationException;
	protected abstract void task2() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException;
	protected abstract void task3(Object object) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException;
	protected abstract SittingRoom task4(Object object) throws ClassNotFoundException, InstantiationException, IllegalAccessException;
	protected abstract void task5(Object object) throws ClassNotFoundException;
	protected abstract void task6(Object object);
	protected abstract MyLovelySittingRoom task7(Object object);
	protected abstract void task8(Object object);
	protected abstract void task9(Object object) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchFieldException;
	
}
