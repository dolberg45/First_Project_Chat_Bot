import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        Integer m = scanner.nextInt();
        int j = 0;
        while (m > 0) {
            if (m > 1) {
                for (int i = 1; i < m; i++) {
                    j = i * i;
                    if (m >= j) {
                        System.out.println(j);
                    }
                }
            } else {
                System.out.println(1);
            }

            m = -1;
        }
    }
}