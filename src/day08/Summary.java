package day08;

public class Summary {
    public static void main(String[] args) {
        System.out.println();//ekrandan çıktı alabilmek için
        System.out.println("merhaba");//run menüsünden ctrl-şift-f10 da çalıştırır

        //.....7 6 5 4 3 2 1 0
        //.....0 0 0 0 0 1 0 1
        int sayi = 5;//dışarıdan veri aldık
        char c = 'A';

        //Notasyonlar :
        /*
        sınıf isimleri pascal notasyonudur birnden fazla kelime ise her kelimenin baş harfi büyük

        değişken ve method isimleri camel natosyonu örn: kolininRengi  alanHesapla()
        Math.pow(2,3)

        sabit değerler içersinde (final) snak natosyonu ile yazılmalı örnk: PI_SAYISI
         */

        Double KutununAğırlığı = 3.2;
        float f = 3.0f;

        String metin = "ahmet";
        String isim = " dursun";
        String isim1 =metin+"  "+isim;
        System.out.println(isim1);

        boolean result = true;

        System.out.println(result);

        String str = ""+23*18;
        System.out.println(str);

    }
}
