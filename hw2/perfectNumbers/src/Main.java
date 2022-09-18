public class Main {
    public static void main(String[] args) {
        int sayı = 6;
        int total = 0;

        for(int i = 1; i<sayı; i++) {
            if(sayı % i == 0) {
                total += i;
            }
        }

        if(sayı == total) {
            System.out.println("Mükemmel sayı.");
        } else {
            System.out.println("Mükemmel sayı değil.");
        }
    }
}