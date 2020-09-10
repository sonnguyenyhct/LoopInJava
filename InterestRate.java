import java.util.Scanner;

public class InterestRate {
    public static void main(String[] args) {
        double money;
        int month = 1;
        double interest_Rate;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so tien cho vay");
        money = scanner.nextDouble();
        System.out.println("Nhap vao so thang cho vay");
        month = scanner.nextInt();
        System.out.println("Nhap vao lai suat");
        interest_Rate = scanner.nextDouble();
        for (int count = 1; count <= month; count++){
            money += interest_Rate*money;
        }
        System.out.println("Tong so tien nhan duoc la : " + money);

    }
}
