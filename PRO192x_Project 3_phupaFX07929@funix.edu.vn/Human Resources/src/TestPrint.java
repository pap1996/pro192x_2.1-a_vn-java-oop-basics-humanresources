public class TestPrint {

    public static void main(String[] args) {
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

        String id = "ID"; //1
        String name = "Name";//2
        String department = "Department";//3
        String age = "Age";//4
        String weightWage = "Weight Wage";//5
        String numOfDayOff = "Number of days-off";//6
        String numOfOverHour = "Number of overtime hours / Title";//7
        String wage = "Wage";//8


        String formatter = " %-5s| %-25s| %-25s| %-10s| %-15s| %-25s| %-50s| %-10s|%n";

        System.out.println("__________________________________________________________________________________________" +
                "____________________________________________________________________________________________");
        System.out.printf(formatter, id, name, department, age,weightWage,numOfDayOff, numOfOverHour, wage);
        System.out.println("__________________________________________________________________________________________" +
                "____________________________________________________________________________________________");


        Employee emp1 = new Employee(1, "Phan Van A", 23, 1.4, 20210731, "Supply", 12, 5);
        Employee emp2 = new Employee(2, "Le Thi B", 30, 1.7, 20200102, "Finance", 13, 5);
        Employee emp3 = new Employee(4, "Cao Hoang E", 25, 1.3, 20210630, "Finance", 12, 6);

        emp1.displayInformation();
        emp2.displayInformation();
        emp3.displayInformation();
    }
}
