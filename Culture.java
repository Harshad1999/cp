import java.util.*;

public class Culture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        getDistance(input);

    }

    public static void getDistance(int a) {

        int x = 0;
        int s = 10;
        int y = 0;
        char ch = 'r';

        while (a > 0) {
            switch (ch) {
                case 'r':
                    x += s;
                    ch = 'u';
                    s += 10;
                    break;

                case 'u':
                    y += s;
                    ch = 'l';
                    s += 10;
                    break;

                case 'l':
                    x -= s;
                    ch = 'd';
                    s += 10;
                    break;

                case 'd':
                    y -= s;
                    ch = 'R';
                    s += 10;
                    break;

                case 'R':
                    x += s;
                    s += 10;
                    break;

                default:
                    break;
            }
            a--;

        }
        System.out.println(x + " , " + y);

    }

}
