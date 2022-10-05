public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        //value
        int sayı1 = 1;
        int sayı2 = 3;
        sayı2 = sayı1;
        sayı1 = 30;
        System.out.println(sayı2);

        int [] sayılar1 = new int[] {1,2,3};
        int [] sayılar2 = new int[] {4,5,6};
        sayılar2 = sayılar1;
        sayılar1[0] = 10;
        System.out.println(sayılar2[0]);
    }
}