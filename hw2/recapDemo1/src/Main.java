public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int sayı1 = 12;
        int sayı2 = 131;
        int sayı3 = 14;

        int greatest = sayı1;

        if (greatest < sayı2) {
            greatest = sayı2;
        }
        if (greatest < sayı3) {
            greatest = sayı3;
        }

        System.out.println("En büyük sayı: " + greatest);
    }
}