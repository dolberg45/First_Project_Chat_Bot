import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer one  = scanner.nextInt();
        Integer two = scanner.nextInt();
        Integer three  = scanner.nextInt();
        System.out.println((two <= one && three >= one) || (two >= one && three <= one));
    }
}