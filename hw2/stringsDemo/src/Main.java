public class Main {
    public static void main(String[] args) {
        String cümle = "Bugün hava çok güzel.";
        System.out.println(cümle);

        /*System.out.println("Uzunluk: " + cümle.length());
        System.out.println("5. eleman: " + cümle.charAt(4));
        System.out.println(cümle.concat(" Yaşasın."));
        System.out.println(cümle.startsWith("A"));
        System.out.println(cümle.endsWith("sın."));

        char[] karakterler = new char[5];
        cümle.getChars(0,5,karakterler,0);
        System.out.println(karakterler);
        System.out.println(cümle.indexOf('a'));
        System.out.println(cümle.lastIndexOf('e'));*/

        String mesaj = cümle.replace(' ','-');
        System.out.println(mesaj);
        System.out.println(cümle.substring(2,5));

        for(String kelime : cümle.split(" ")) {
            System.out.println(kelime);
        }

        System.out.println(cümle.toLowerCase());
        System.out.println(cümle.toUpperCase());

    }
}