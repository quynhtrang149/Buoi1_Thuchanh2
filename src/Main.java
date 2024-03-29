import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        float chieuRong;
        float chieuDai;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu rong");
        chieuRong = scanner.nextFloat();

        System.out.println("Nhap chieu dai");
        chieuDai = scanner.nextFloat();

        System.out.println("Dien tich = " + chieuDai*chieuRong);
        }
    }
