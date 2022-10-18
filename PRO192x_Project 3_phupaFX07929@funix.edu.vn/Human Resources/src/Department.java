import java.util.ArrayList;

public class Department {
    private int depId;
    private String depName;
    private int depNumEmployee;
    private ArrayList<Staff> depEmpList;

    public Department(int depId, String depName) {
        this.depNumEmployee = 1;
        this.depId = depId;
        this.depName = depName;
        this.depEmpList = new ArrayList<Staff>(0);
    }

    public void printDeptInfo() {

        String formatter = " %-20s| %-20s| %-20s|%n";
        System.out.printf(formatter,this.depId, this.depName, this.depNumEmployee);
//         " " + this.depId + " | Name: " + this.depName + " |  Num of Emp: " + this.depNumEmployee;
    }

    public String getDepName() {
        return depName;
    }

    public int getDepNumEmployee() { return depNumEmployee;}

    public void addDepNumEmployee() {
        this.depNumEmployee +=1;
    }

    public ArrayList<Staff> getDepEmp() { return this.depEmpList;}

    public void addDepEmp(Staff staff) {this.depEmpList.add(staff);}

}
