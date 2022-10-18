public class Manager extends Staff {
    private String empTitle;

    public Manager(int empID, String empName, int empAge, double empWageWeight, int startDate, String department, int numDayOff, String empTitle) {
        super(empID, empName, empAge, empWageWeight, startDate, department, numDayOff);
        this.empTitle = empTitle;
    }

    public String getEmpTitle() {
        return empTitle;
    }

    public void setEmpTitle(String empTitle) {
        this.empTitle = empTitle;
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
//        System.out.print("Title: " + this.empTitle);
//        System.out.print(" | ");
//        System.out.print("Wage: " + this.calculateSalary());
//        System.out.println();

        int id = this.getEmpID(); //1
        String name = this.getEmpName();//2
        String department = this.getDepartment();//3
        int age = this.getEmpAge();//4
        double weightWage = this.getEmpWageWeight();//5
        int numOfDayOff = this.getNumDayOff();//6
        String title = this.getEmpTitle();//7
        double wage = this.calculateSalary();//8
        String formatter = " %-5s| %-20s| %-20s| %-10s| %-15s| %-25s| %-40s| %-15.2f|%n";
        System.out.printf(formatter, id, name, department, age,weightWage,numOfDayOff, title, wage);
    }

    @Override
    public double calculateSalary() {
        if (this.empTitle.equalsIgnoreCase("Business Leader")) {
            return this.getEmpWageWeight()*5000000.0 + 8000000.0;
        } else if (this.empTitle.equalsIgnoreCase("Project Leader")) {
            return this.getEmpWageWeight()*5000000.0 + 5000000.0;
        } else if (this.empTitle.equalsIgnoreCase("Technical Leader")) {
            return this.getEmpWageWeight()*5000000.0 + 6000000.0;
        } else {
            return 0.0;
        }


    }

//    void checkDep() {
//        int check = -1;
//        for(int i=0; i< HumanResources.depList.size();i++) {
//            if (HumanResources.depList.get(i).getDepName().equalsIgnoreCase(this.department)) {
//                check = i;
//                HumanResources.depList.get(i).addDepNumEmployee();
//            }
//        }
//
//        if (check == -1) {
//            Department newDep = new Department(HumanResources.depList.size(),this.department);
//            HumanResources.depList.add(newDep);
//        }
//
//    }
}
