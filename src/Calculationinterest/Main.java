package Calculationinterest;

public class Main {
    public static void main(String[] args) {
        Bank b = new Bank(1000, 10);

        b.enter();

        double monthlyinterest = b.calculateInterest();
        System.out.println("monthly interest:" + monthlyinterest);
    }
}
