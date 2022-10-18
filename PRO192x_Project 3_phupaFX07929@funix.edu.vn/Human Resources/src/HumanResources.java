import java.util.ArrayList;
import java.util.Scanner;

public class HumanResources {

    static ArrayList<Staff> empList = new ArrayList<Staff>();
    static ArrayList<Department> depList = new ArrayList<Department>(0);

    public static void main(String[] args) {
        System.out.println("Welcome to HUMAN RESOURCES!");
        System.out.println();

        // Add employee

        Employee emp1 = new Employee(1, "Phan Van A", 23, 1.4, 20210731, "Supply", 12, 5);
        Employee emp2 = new Employee(2, "Le Thi B", 30, 1.7, 20200102, "Finance", 13, 5);
        Employee emp3 = new Employee(4, "Cao Hoang E", 25, 1.3, 20210630, "Finance", 12, 6);
        Manager man1 = new Manager(3, "Nguyen Minh C", 34, 1, 20150303, "Finance", 14, "Business Leader");

        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(man1);


        question();
        Scanner input = new Scanner(System.in);
        int numChoice = input.nextInt();
        while (numChoice != 9) {
            if (numChoice == 1) {
                addNewEmp();
            }
            if (numChoice == 2) {
                printAllEmployee();
            }
            if (numChoice == 3) {
                printAllDep();
            }
            if (numChoice == 4) {
                printEmpAsDep();
            }
            if (numChoice == 5) {
                findEmp();
            }
            if (numChoice == 6) {
                calWage();
            }
            if (numChoice == 7) {
                displayWage();
            }

            question();
            numChoice = input.nextInt();
        }
    }

    static void question() {
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("Please input the number for the action you would like to take:");
        System.out.println("1. Add a new staff");
        System.out.println("2. List all employees in the company");
        System.out.println("3. List all departments in the company");
        System.out.println("4. List all employees by department in the company");
        System.out.println("5. Find employees in the company");
        System.out.println("6. Calculate salary of employee in the company");
        System.out.println("7. Display all wage");
        System.out.println("9. Exit");
        System.out.println("-------------------------------------");
    }

    static void addNewEmp() {
        Scanner input = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Do you want add a new employee or a new manager? (1-Employee, 2-Manager): ");
        int flagManager = input.nextInt();

        System.out.print("Employee ID: ");
        int empID = input.nextInt();

        System.out.print("Employee Name: ");
        String empName = input.next();

        System.out.print("Employee Age: ");
        int empAge = input.nextInt();

        System.out.print("Wage Weight: ");
        double empWageWeight = input.nextDouble();

        System.out.print("Start Date: ");
        int startDate = input.nextInt();

        System.out.print("Department: ");
        String department = input.next();

        System.out.print("Number of day-off: ");
        int numDayOff = input.nextInt();

        if (flagManager == 1) {
            System.out.print("Number of Overtime hour: ");
            int numOvertimeHour = input.nextInt();

            Staff e = new Employee(empID, empName, empAge, empWageWeight, startDate, department, numDayOff, numOvertimeHour);
            empList.add(e);
            System.out.println();
            System.out.println("You have added a new Employee as below:");
            printHeaderTable();
            e.displayInformation();
            printEndBorderTable();

        } else if (flagManager == 2) {
            System.out.print("Title : ");
            String empTitle = input.next();

            Staff e = new Manager(empID, empName, empAge, empWageWeight, startDate, department, numDayOff, empTitle);
            empList.add(e);
            System.out.println();
            System.out.println("You have added a new Manager as below:");
            printHeaderTable();
            e.displayInformation();
            printEndBorderTable();
        }


    }

    static void printAllEmployee() {
        System.out.println("Your company has " + empList.size() + " employees");

        printHeaderTable();
        for (int i = 0; i < empList.size(); i++) {
//            System.out.print(i + " | ");
            empList.get(i).displayInformation();
        }
        printEndBorderTable();
    }

    static void printAllDep() {
        System.out.println("Your company has " + depList.size() + " departments");
        String formatter = " %-20s| %-20s| %-20s|%n";
        System.out.println("__________________________________________________________________");
        System.out.printf(formatter, "Department ID", "Name", "Num of Emp");
        System.out.println("__________________________________________________________________");
        for (int i = 0; i < depList.size(); i++) {
//            System.out.print(i + " | ");
            depList.get(i).printDeptInfo();
        }
        System.out.println("__________________________________________________________________");
    }

    static void printEmpAsDep() {
        for (Department i : depList
        ) {
            System.out.println(i.getDepName() + " has " + i.getDepNumEmployee() + " employees, including:");
            printHeaderTable();
            for (Staff j : i.getDepEmp()) {
                j.displayInformation();
            }
            printEndBorderTable();
            System.out.println();
        }

    }

    static void findEmp() {
        System.out.print("Please input the name or ID (1-ID, 2-Name): ");
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        int check = input.nextInt();
        int status = -1;
        if (check == 1) {
            System.out.print("Employee ID: ");
            int id = input.nextInt();

            printHeaderTable();
            for (Staff i : empList) {
                if (i.getEmpID() == id) {
                    i.displayInformation();
                    status = 0;
                }
            }
            printEndBorderTable();

        } else if (check == 2) {
            System.out.print("Employee Name: ");
            String name = input.next();

            printHeaderTable();
            for (Staff i : empList) {
                if (i.getEmpName().equalsIgnoreCase(name)) {
                    i.displayInformation();
                    status = 0;
                }
            }
            printEndBorderTable();
        }

        if (status == -1) {
            System.out.print("Not found! ");
        }
    }

    static void calWage() {
        System.out.print("Please input the name or ID (1-ID, 2-Name): ");
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        int check = input.nextInt();
        int status = -1;
        if (check == 1) {
            System.out.print("Employee ID: ");
            int id = input.nextInt();
            for (Staff i : empList) {
                if (i.getEmpID() == id) {
                    System.out.println("Wage of employee " + i.getEmpName() + ": " + String.format("%.2f",i.calculateSalary()));
                    status = 0;
                }
            }
        } else if (check == 2) {
            System.out.print("Employee Name: ");
            String name = input.next();
            for (Staff i : empList) {
                if (i.getEmpName().equalsIgnoreCase(name)) {
                    System.out.println("Wage of employee " + i.getEmpName() + ": " + i.calculateSalary());
                    status = 0;
                }
            }
        }

        if (status == -1) {
            System.out.print("Not found! ");
        }
    }

    static void displayWage() {
        System.out.print("Please the order of table (1-increasing wage, 2-decreasing wage): ");
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        int check = input.nextInt();
        empList.sort(new WageComparator(check));

        printHeaderTable();
        for (Staff s : empList) {
            s.displayInformation();
        }
        printEndBorderTable();
    }


    static void printHeaderTable() {
        String id = "ID"; //1
        String name = "Name";//2
        String department = "Department";//3
        String age = "Age";//4
        String weightWage = "Weight Wage";//5
        String numOfDayOff = "Number of days-off";//6
        String numOfOverHour = "Number of overtime hours / Title";//7
        String wage = "Wage";//8


        String formatter = " %-5s| %-20s| %-20s| %-10s| %-15s| %-25s| %-40s| %-15s|%n";

        System.out.println("__________________________________________________________________________________________" +
                "_____________________________________________________________________________");
        System.out.printf(formatter, id, name, department, age,weightWage,numOfDayOff, numOfOverHour, wage);
        System.out.println("__________________________________________________________________________________________" +
                "_____________________________________________________________________________");
    }


    static void printEndBorderTable() {
        System.out.println("__________________________________________________________________________________________" +
                "_____________________________________________________________________________");
    }


}
