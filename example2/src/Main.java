import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập phân số thứ nhất:");
        Fraction fraction1 = new Fraction();
        fraction1.InputPhanSo();

        System.out.println("Nhập phân số thứ hai:");
        Fraction fraction2 = new Fraction();
        fraction2.InputPhanSo();

        System.out.println("Phân số thứ nhất:");
        fraction1.DisplayPhanSo();
        fraction1.RutGonPhanSo();
        fraction1.NghichDaoPhanSo();

        System.out.println("Phân số thứ hai:");
        fraction2.DisplayPhanSo();
        fraction2.RutGonPhanSo();
        fraction2.NghichDaoPhanSo();

        Fraction sum = fraction1.add(fraction2);
        Fraction difference = fraction1.subtract(fraction2);
        Fraction product = fraction1.multiply(fraction2);
        Fraction quotient = fraction1.divide(fraction2);

        System.out.println("Tổng hai phân số: ");
        sum.DisplayPhanSo();

        System.out.println("Hiệu hai phân số: ");
        difference.DisplayPhanSo();

        System.out.println("Tích hai phân số: ");
        product.DisplayPhanSo();

        if (quotient != null) {
            System.out.println("Thương hai phân số: ");
            quotient.DisplayPhanSo();
        }
    }
}



