import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer money = scanner.nextInt();
        Integer revenue = scanner.nextInt();
        Integer target = scanner.nextInt();
        double rev = 0.0;
        if (revenue % 100 == 0){
            rev = revenue / 100 + 1;
        } else {
            rev = (revenue % 100) + 1;
        }


        int count = 1;
        while (money != target) {
            count++;
            money *= ((100 + revenue) / 100);
        }
    }
}