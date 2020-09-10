import java.util.Scanner;

public class DisplayPrime {
    public static void main(String[] args) {
        int numbers;
        int count = 0;
        int n = 3;
        boolean check = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so luong so nguyen to");
        numbers = scanner.nextInt();
        while (count < numbers){
            for (int i = 2; i < n; i++){
                if (n%i == 0){
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.print(n + ",");
                count++;
            }
            check = true;
            n++;
        }
    }
}
