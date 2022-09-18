public class Main {
    public static void main(String[] args) {
        int sayı = 1931;
        boolean isPrime = true;
        if(sayı == 1) {
            System.out.println("Asal sayı değil.");
        }
        if(sayı < 1) {
            System.out.println("Geçersiz sayı.");
        }

        for(int i = 2; i<sayı; i++) {
            if(sayı % i == 0) {
                isPrime = false;
            }
        }
        if(isPrime) {
            System.out.println("Asal sayı.");
        }else {
            System.out.println("Asal sayı değil.");
        }
    }
}