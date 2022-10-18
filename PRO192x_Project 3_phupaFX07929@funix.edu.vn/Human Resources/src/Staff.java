public abstract class Staff implements ICalculator {

    // Fields
    private int empID;
    private String empName;
    private int empAge;
    private double empWageWeight;
    private int startDate;
    private String department;
    private int numDayOff;

    public Staff(int empID, String empName, int empAge, double empWageWeight, int startDate, String department, int numDayOff) {
        this.empID = empID;
        this.empName = empName;
        this.empAge = empAge;
        this.empWageWeight = empWageWeight;
        this.startDate = startDate;
        this.department = department;
        this.numDayOff = numDayOff;
        checkDep();
    }

    public int getEmpID() {
        return this.empID;
    }

    public String getEmpName() {
        return this.empName;
    }

    public double getEmpWageWeight() {
        return this.empWageWeight;
    }

    public int getStartDate() {
        return this.startDate;
    }

    public int getEmpAge() {
        return empAge;
    }

    public int getNumDayOff() {
        return numDayOff;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpWageWeight(double empWageWeight) {
        this.empWageWeight = empWageWeight;
    }

    public void setNumDayOff(int numDayOff) {
        this.numDayOff = numDayOff;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    //Methods
    abstract void displayInformation() ;
//    abstract void checkDep();

    void checkDep() {
        int check = -1;
        for(int i=0; i< HumanResources.depList.size();i++) {
            if (HumanResources.depList.get(i).getDepName().equalsIgnoreCase(this.department)) {
                check = i;
                HumanResources.depList.get(i).addDepNumEmployee();
                HumanResources.depList.get(i).addDepEmp(this);
            }
        }

        if (check == -1) {
            Department newDep = new Department(HumanResources.depList.size(),this.department);
            newDep.addDepEmp(this);
            HumanResources.depList.add(newDep);

        }

    }
}
