import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer a = scanner.nextInt();
        int end = 0;

        if (a == 1) {
            System.out.print(a);
        } else {
            System.out.print(a + " ");
            while (end == 0) {
                if (a % 2 == 0) {
                    a = a / 2;
                    if (a == 1) {
                        end = 1;
                    }
                    System.out.print(a + " ");
                } else {
                    a = (a * 3) + 1;
                    System.out.print(a + " ");
                }
            }
        }
    }
}