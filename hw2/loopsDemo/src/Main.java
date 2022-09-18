public class Main {
    public static void main(String[] args) {

        for (int i = 2; i < 11; i+=2) {
            System.out.println(i);
        }
        System.out.println("Döngü bitti.");

        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        System.out.println("Döngü bitti.");

        int k = 1;

        while (k < 10) {
            System.out.println(k);
            k++;
        }

        System.out.println("While döngüsü bitti.");

        do {
            System.out.println(k);
            k += 1.5;
        }while(k<10);


        }
    }
}