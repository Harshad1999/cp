import java.util.*;

public class Leapyr {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Year:");
        int year = sc.nextInt();
        sc.close();

        if (year%4==0) {
            System.out.println(year + " is A Leap yr");
            
        }
        else{
            System.out.println(year+" is not a Leap yr");
        }

        
    }
}
