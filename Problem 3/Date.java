import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Date {
    private int month;
    private int year;

    public Date(int month, int year) {
        this.month = month;
        this.year = year;
    }

    public boolean isLeapYear() {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0); // fix
    }

    Integer[] thirtyArray = new Integer[]{4, 6, 9, 11};
    Integer[] thirtyOneArray = new Integer[]{1, 3, 5, 7, 8, 10, 12};

    List<Integer> thirtyList = new ArrayList<>(Arrays.asList(thirtyArray));
    List<Integer> thirtyOneList = new ArrayList<>(Arrays.asList(thirtyOneArray));

    public int numberDays() {
        if (thirtyList.contains(month)) {
            return 30; // return number not String
        }
        else if (thirtyOneList.contains(month)) {
            return 31;
        }
        else {
            if (month == 2 && isLeapYear()) { // call the leap year method
            //if (month == 2 && isLeapYear() == true) { // call the leap year method
                return 29;
            }
            else {
                return 28;
            }
        }
    }

    public String season(int day) {
        //spring
        if (month == 3 && day >= 22 && day <= 31) {
            return "Spring";
        }
        else if (month == 4 || month == 5) {
            return "Spring";
        }
        else if (month == 6 && day > 0 && day <= 21) {
            return "Spring";
        }
        //summer
        else if (month == 6 && day >= 22 && day <= 30) {
            return "Summer";
        }
        else if (month == 7 || month == 8) {
            return "Summer";
        }
        else if (month == 9 && day > 0 && day <= 21) {
            return "Summer";
        }
        //fall
        else if (month == 9 && day >= 22 && day <= 30) {
            return "Fall";
        }
        else if (month == 10 || month == 11) {
            return "Fall";
        }
        else if (month == 12 && day > 0 && day <= 21) {
            return "Fall";
        }
        //winter
        else if (month == 12 && day >= 22 && day <= 31) {
            return "Winter";
        }
        else if (month == 1 || month == 2) {
            return "Winter";
        }
        else {
            return "Winter";
        }
    }
    public static void main(String[] args) {
        Date date = new Date(2, 1800);

        System.out.println(date.isLeapYear());
        System.out.println("Days: " + date.numberDays());
        System.out.println(date.season(22));


    }
}
