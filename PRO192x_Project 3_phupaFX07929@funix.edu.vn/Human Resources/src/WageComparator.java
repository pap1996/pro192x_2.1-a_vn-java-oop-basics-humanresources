import java.util.Comparator;

public class WageComparator implements Comparator<Staff> {

    int check;

    public WageComparator(int check) {
        this.check = check;
    }

    public int compare(Staff s1, Staff s2) {
        if (s1.calculateSalary() == s2.calculateSalary()) {
            return 0;
        } else if ((s1.calculateSalary() > s2.calculateSalary() && this.check == 1) || (s1.calculateSalary() < s2.calculateSalary() && this.check == 2)) {
            return 1;
        } else {
            return -1;
        }
    }
}