package day31_Constructors.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    public String PO, BA, SM;
    public ArrayList<Tester>testerList=new ArrayList<>();
    public ArrayList<Developer> devopsList=new ArrayList<Developer>();
    public int dayOfSprint;

    public ScrumTeam(String PO, String BA, String SM, int dayOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.dayOfSprint = dayOfSprint;
    }

    public void addTester(Tester tester){
        testerList.add(tester);
    }

    public void addTesters(Tester[]testers){testerList.addAll(Arrays.asList(testers));
    }

    public void addDeveloper(Developer developer){
        devopsList.add(developer);
    }

    public void addDevelopers(Developer[]developers){
        devopsList.addAll(Arrays.asList(developers));
    }

    public void removeTester(int employeeID){
        testerList.removeIf(p->p.employeeID==employeeID);
    }

    public void removeDeveloper(int employeeID){
        devopsList.removeIf(p->p.employeeID==employeeID);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", total number of testers=" + testerList.size() +
                ", total number of developers=" + devopsList.size() +
                ", dayOfSprint=" + dayOfSprint +
                '}';
    }
}
