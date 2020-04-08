import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = 1;
        while (a != 0) {
            Integer target = scanner.nextInt();
            if (target == 0) {
                break;
            }
            if (target % 2 == 0){
                System.out.println("even");
            } else if (target % 2 == 1){
                System.out.println("odd");
            }
        }
    }
}