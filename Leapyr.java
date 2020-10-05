import java.util.*;

public class Leapyr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Year:");
        int year = sc.nextInt();
        sc.close();
        Boolean isleapyr = false;

        if (year % 4 == 0) {

            if (year % 100 == 0) {

                if (year % 400 == 0) {
                    isleapyr = true;

                } else {
                    isleapyr = false;
                }

            } else {
                isleapyr = true;

            }

        } else {
            isleapyr = false;

        }

        if (isleapyr == true)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");
    }

}
