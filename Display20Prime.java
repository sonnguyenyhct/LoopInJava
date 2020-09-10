import java.util.Scanner;

public class Display20Prime {
    public static void main(String[] args) {
        boolean check = true;
        for (int i = 3; i < 100; i++){
            for (int j = 2; j < i; j++){
                if (i%j == 0){
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.print(i + ",");
            }
            check = true;
        }
    }
}
