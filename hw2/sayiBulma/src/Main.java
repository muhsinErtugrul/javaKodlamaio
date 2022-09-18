public class Main {
    public static void main(String[] args) {
        int[] number = {1,3,5,7,9};
        int aranan = 2;
        boolean varMi = false;

        for(int sayı : number) {
            if(sayı == aranan) {
                varMi = true;
                break;
           }
        }

        if(varMi) {
            System.out.println("Sayı var.");
        }else {
            System.out.println("Sayı yok.");
        }

    }
}