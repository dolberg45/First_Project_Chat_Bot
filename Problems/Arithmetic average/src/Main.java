import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer a = scanner.nextInt();
        Integer b = scanner.nextInt();
        ArrayList arrayList = new ArrayList();
        float sum = 0;
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                arrayList.add(i);
                sum += i;
            }
        }
        System.out.println(sum/arrayList.size());
    }
}