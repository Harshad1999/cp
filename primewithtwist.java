import java.util.*;

public class primewithtwist {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any no.: " );

        int n = sc.nextInt();

        primewithtwist ob=new primewithtwist();

        ob.check(n);

       

    }

    void check(int n){

        if (n<0) {
            System.out.println(" Enter +ve positive number");
            
        } else {
            
            prime(n);
        }

    }

    void prime(int n){
        int c = 0;
        for (int i = 2; i < n; i++) {
            
            
            if(i%n==0){

                ++c;

            }

            

            
        }
        if (c>=1) {

            System.out.println("Entered number is not a prime number");

        } else {

            System.out.println("Entered number is a prime number");                
            
        }


    }

}
