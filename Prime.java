import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int prime;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao 1 so nguyen duong");
        prime = scanner.nextInt();
        if (checkPrime(prime)){
            System.out.println(prime + "la so nguyen to");
        }else {
            System.out.println(prime + "khong la so nguyen to");
        }

    }
    public static boolean checkPrime(int prime){
        if (prime == 1 || prime == 2){
            return false;
        }
        for (int count = 2; count < Math.sqrt(prime); count++){
            if (prime%count == 0){
                return false;
            }
        }
        return true;
    }
}
