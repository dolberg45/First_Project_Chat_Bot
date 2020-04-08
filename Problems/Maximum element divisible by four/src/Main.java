import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer a = scanner.nextInt();
        ArrayList prom = new ArrayList();
        for (int i = 0; i < a; i ++) {
            Integer b = scanner.nextInt();
            if (b % 4 == 0) {
                prom.add(b);
            }
        }
        Collections.sort(prom);
        System.out.println(prom.get(prom.size() - 1));
    }
}