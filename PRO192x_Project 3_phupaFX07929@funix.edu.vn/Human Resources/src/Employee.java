
public class Employee extends Staff {
    private int numOvertimeHour;

    public Employee(int empID, String empName, int empAge, double empWageWeight, int startDate, String department, int numDayOff, int numOvertimeHour) {
        super(empID, empName, empAge, empWageWeight, startDate, department, numDayOff);
        this.numOvertimeHour = numOvertimeHour;
    }

    public int getNumOvertimeHour() {
        return numOvertimeHour;
    }

    public void setNumOvertimeHour(int numOvertimeHour) {
        this.numOvertimeHour = numOvertimeHour;
    }

    public double calculateSalary() {
        return this.getEmpWageWeight()*3000000.0 + this.numOvertimeHour*200000.0;
    }

    public void displayInformation() {


//        System.out.print("ID: " + this.getEmpID());
//        System.out.print(" | ");
//        System.out.print("Name: " + this.getEmpName());
//        System.out.print(" | ");
//        System.out.print("Department: " + this.getDepartment());
//        System.out.print(" | ");
//        System.out.print("Age: " + this.getEmpAge());
//        System.out.print(" | ");
//        System.out.print("Weight Wage: " + this.getEmpWageWeight());
//        System.out.print(" | ");
//        System.out.print("Number of days-off: " + this.getNumDayOff());
//        System.out.print(" | ");
//        System.out.print("Number of overtime hours: " + this.numOvertimeHour);
//        System.out.print(" | ");
//        System.out.print("Wage: " + this.calculateSalary());
//        System.out.println();

        int id = this.getEmpID(); //1
        String name = this.getEmpName();//2
        String department = this.getDepartment();//3
        int age = this.getEmpAge();//4
        double weightWage = this.getEmpWageWeight();//5
        int numOfDayOff = this.getNumDayOff();//6
        int numOfOverHour = this.numOvertimeHour;//7
        double wage = this.calculateSalary();//8
        String formatter = " %-5s| %-20s| %-20s| %-10s| %-15s| %-25s| %-40s| %-15.2f|%n";
        System.out.printf(formatter, id, name, department, age,weightWage,numOfDayOff, numOfOverHour, wage);

    }

//    void checkDep() {
//        int check = -1;
//        for(int i=0; i< HumanResources.depList.size();i++) {
//            if (HumanResources.depList.get(i).getDepName().equalsIgnoreCase(this.department)) {
//                check = i;
//                HumanResources.depList.get(i).addDepNumEmployee();
//                HumanResources.depList.get(i).addDepEmp(this);
//            }
//        }
//
//        if (check == -1) {
//            Department newDep = new Department(HumanResources.depList.size(),this.department);
//            newDep.addDepEmp(this);
//            HumanResources.depList.add(newDep);
//
//        }
//
//    }

}
