package pl.pw.edu.mini.zpoif.task1.mafia;

import pl.pw.edu.mini.zpoif.task1.mafia.worker.MafiaWorker;

public class RecruitmentDepartment extends MafiaOrganization {

    private static String color = "white";
    private final static int dailylimit = 5;

    public RecruitmentDepartment(String color){
        RecruitmentDepartment.color = color;
    }

    @Override
    public void work() {

        MafiaWorker.Recruiter recruiter1 = new MafiaWorker.Recruiter();
        recruiter1.recruit();
        MafiaWorker.Recruiter recruiter2 = new MafiaWorker.Recruiter();
        recruiter2.recruit();
        MafiaWorker.Recruiter recruiter3 = new MafiaWorker.Recruiter();
        recruiter3.recruit();
        MafiaWorker.Recruiter recruiter4 = new MafiaWorker.Recruiter();
        recruiter4.recruit();
        MafiaWorker.Recruiter recruiter5 = new MafiaWorker.Recruiter();
        recruiter5.recruit();
    }

    public void internalControl(){
        MafiaWorker.Controller controller = new MafiaWorker.Controller();
        controller.check();
    }

}
