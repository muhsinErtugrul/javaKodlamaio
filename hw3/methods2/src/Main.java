public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        String yeniMesaj = şehirVer();
        System.out.println(yeniMesaj);
        int sayı = topla(5,7);
        System.out.println(sayı);
        System.out.println(topla2(1,2,3,4,31,45,13,7));

    }

    public static void ekle() {
        System.out.println("Eklendi.");
    }

    public static void sil() {
        System.out.println("Silindi");
    }

    public static void güncelle() {
        System.out.println("Güncellendi");
    }

    public static int topla(int sayı1, int sayı2) {
        return sayı1+sayı2;
    }

    public static int topla2(int... sayılar) {
        int sum = 0;
        for(int sayı: sayılar) {
            sum+= sayı;
        }
        return sum;
    }

    public static String şehirVer() {
        return "Balıkesir";
    }
}