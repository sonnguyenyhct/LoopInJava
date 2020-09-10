import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        int soA,soB;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so a");
        soA = scanner.nextInt();
        System.out.println("Nhap vao so b");
        soB = scanner.nextInt();
        if (soA == 0 && soB == 0){
            System.out.println("Khong co UCLN");
        }else if (soA == 0 || soB == 0){
            System.out.println("UCLN la : " + Math.abs(soA + soB));
        }else {
            if (soA <= soB){
                for (int count = soA; count > 0; count--){
                    if (soA%count == 0 && soB%count == 0){
                        System.out.println("UCLN la " + count);
                        break;
                    }
                }
            }else {
                for (int count = soB; count > 0; count--){
                    if (soA%count == 0 && soB%count == 0){
                        System.out.println("UCLN la " + count);
                        break;
                    }
                }
            }
        }

    }
}
