import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer a = scanner.nextInt();
        if ((a / 1000 == a % 10) && (a / 100 % 10  == a % 100 / 10)) {
            System.out.println(1);
        } else {
            System.out.println(37);
        }
    }
}