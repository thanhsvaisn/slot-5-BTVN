import java.util.Scanner;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
        numerator = 3;
        denominator = 3;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            System.out.println("Mẫu số phải khác 0");
        }
    }

    public int getNumerator() {
        return numerator;
    }

    // Setter for numerator
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    // Getter for denominator
    public int getDenominator() {
        return denominator;
    }

    // Setter for denominator
    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            System.out.println("Mẫu số phải khác 0");
        }
    }

    public void InputPhanSo() {
        Scanner scanner = new Scanner(System.in);
        numerator = scanner.nextInt();
        int tempDenominator = scanner.nextInt();
        if (tempDenominator != 0) {
            denominator = tempDenominator;
        } else {
            System.out.println("Mẫu số phải khác 0");
        }
    }

    public void DisplayPhanSo() {
        if (denominator != 0) {
            System.out.println(numerator + "/" + denominator);
        } else {
            System.out.println("Mẫu số khác 0");
        }
    }

    public void RutGonPhanSo() {
        int a = numerator;
        int b = denominator;
        int temp = a % b;
        while (temp != 0) {
            a = b;
            b = temp;
            temp = a % b;
        }
        int gcd = b;
        numerator /= gcd;
        denominator /= gcd;
        System.out.println("Phân số sau khi rút gọn: " + numerator + "/" + denominator);
    }

    public void NghichDaoPhanSo() {
        if (numerator != 0) {
            int temp = denominator;
            denominator = numerator;
            numerator = temp;
            System.out.println("Phân số đã nghịch đảo: " + numerator + "/" + denominator);
        } else {
            System.out.println("Không thể nghịch đảo với tử số bằng 0");
        }
    }

    public Fraction add(Fraction other) {
        int num = this.numerator * other.denominator + other.numerator * this.denominator;
        int denom = this.denominator * other.denominator;
        return new Fraction(num, denom);
    }

    public Fraction subtract(Fraction other) {
        int num = this.numerator * other.denominator - other.numerator * this.denominator;
        int denom = this.denominator * other.denominator;
        return new Fraction(num, denom);
    }

    public Fraction multiply(Fraction other) {
        int num = this.numerator * other.numerator;
        int denom = this.denominator * other.denominator;
        return new Fraction(num, denom);
    }

    public Fraction divide(Fraction other) {
        if (other.numerator != 0) {
            int num = this.numerator * other.denominator;
            int denom = this.denominator * other.numerator;
            return new Fraction(num, denom);
        } else {
            System.out.println("Không thể chia cho phân số có tử số bằng 0");
            return null;
        }
    }
}