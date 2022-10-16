package day06;

public class VarıableDeclaratıon02 {
    public static void main(String[] args) {

        int yas=5;

        int agirlik;
        //Aşağıdaki satırın tamamı bir java statement'ıdır.
        //Eşittir operatörünün sağında bulunan yas+7 ise bir expression'dır.
        yas=yas+7;

        System.out.println("Yaş = "+yas);

         /* -----Veri Tipleri----
            1. İlkel Tipler - Pirimitive Types
            2. Referans Tipler - Reference Types
         */



        //Tamsayı veri Tipleri
//        int sayiMax=2_147_483_647;
//        int sayiMin=-2_147_483_648;
        //Wrapper class
        long sayiMax=Integer.MAX_VALUE;
        long sayiMin=Integer.MIN_VALUE;

        System.out.println(sayiMax);
        System.out.println(sayiMin);

        //byte, short, long

        sayiMax=Byte.MAX_VALUE;
        sayiMin=Byte.MIN_VALUE;

        System.out.println(sayiMax);
        System.out.println(sayiMin);


        sayiMax=Short.MAX_VALUE;
        sayiMin=Short.MIN_VALUE;

        System.out.println(sayiMax);
        System.out.println(sayiMin);



        sayiMax=Long.MAX_VALUE;
        sayiMin=Long.MIN_VALUE;


        System.out.println(sayiMax);
        System.out.println(sayiMin);
    }
}
