import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList arrayList = new ArrayList();
        Integer a = scanner.nextInt();
        int i = 0;
        while (i < a) {
            Integer b = scanner.nextInt();
            i++;
            if (b % 4 == 0) {
                arrayList.add(b);
            }
        }
        Collections.sort(arrayList);
        System.out.println(arrayList.get(arrayList.size()-1));
    }
}