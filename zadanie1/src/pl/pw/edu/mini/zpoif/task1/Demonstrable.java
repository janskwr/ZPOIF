package pl.pw.edu.mini.zpoif.task1;

import pl.pw.edu.mini.zpoif.task1.mafia.Management;
import pl.pw.edu.mini.zpoif.task1.mafia.RecruitmentDepartment;
import pl.pw.edu.mini.zpoif.task1.mafia.SalesDepartment;
import pl.pw.edu.mini.zpoif.task1.mafia.SpecialOperationsDepartment;

public interface Demonstrable {
	void demonstrate();

	public static void main(String[] args) {
		SalesDepartment salesDepartment = new SalesDepartment();
		salesDepartment.work();
		SpecialOperationsDepartment specialOperationsDepartment = new SpecialOperationsDepartment();
		specialOperationsDepartment.work();
		RecruitmentDepartment recruitmentDepartment = new RecruitmentDepartment();
		recruitmentDepartment.work();
		Management management = new Management();
	}
}
