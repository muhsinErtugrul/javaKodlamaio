public class Main {
    public static void main(String[] args) {
        double [] myList = {1,2,3.1,4.5};
        double sum = 0;
        double greatest = 0;

        for(double sayı : myList) {
            if(greatest < sayı) {
                greatest = sayı;
            }
            sum += sayı;
            System.out.println(sayı);

        }

        System.out.println("Toplam : " + sum);
        System.out.println("En büyük: " + greatest);
    }
}