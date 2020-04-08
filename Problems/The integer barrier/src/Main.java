import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (sum < 1000) {
            Integer tar = scanner.nextInt();
            if (tar == 0) {
                System.out.println(sum);
                break;
            } else {
                sum = sum + tar;
            }
        }
        if (sum >= 1000) {
            System.out.println(sum - 1000);
        }
    }
}