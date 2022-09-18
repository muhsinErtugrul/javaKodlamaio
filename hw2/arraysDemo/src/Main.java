public class Main {
    public static void main(String[] args) {
        String öğrenci1 = "Mehmet";
        String öğrenci2 = "Serdar";
        String öğrenci3 = "Yücel";
        String öğrenci4 = "Ertu";

        System.out.println(öğrenci1);
        System.out.println(öğrenci2);
        System.out.println(öğrenci3);
        System.out.println(öğrenci4);
        System.out.println("--------------------------");
        String [] öğrenciler = new String[4];
        öğrenciler[0] = "Mehmet";
        öğrenciler[1] = "Serdar";
        öğrenciler[2] = "Yücel";
        öğrenciler[3] = "Ertu";

        for(int i = 0; i < öğrenciler.length; i++) {
            System.out.println(öğrenciler[i]);
        }
        System.out.println("--------------------------");

        for(String öğrenci : öğrenciler) {
            System.out.println(öğrenci);
        }
        System.out.println("--------------------------");

    }
}