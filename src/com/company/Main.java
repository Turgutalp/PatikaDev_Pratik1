package com.company;
import java.util.Scanner;


import static java.util.concurrent.TimeUnit.*;
/*
	Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin
	 sınav puanlarını kullanıcıdan alan ve ortalamalarını
	 hesaplayıp ekrana bastırılan programı yazın.

      Ödev

     Aynı program içerisinde koşullu ifadeler kullanılarak,
     eğer kullanıcının ortalaması 60'dan büyük ise ekrana
     "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

	 */

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        String graduate = null;

        System.out.println("PatikaDev Java101 Pratik_1");




        System.out.println("Matematik Sinav Puanini Giriniz: ");
        int math = sc.nextInt();
        System.out.println("Fizik Sinav Puanini Giriniz: ");
        int phy = sc.nextInt();
        System.out.println("Kimya Sinav Puanini Giriniz: ");
        int che = sc.nextInt();
        System.out.println("Turkce Sinav Puanini Giriniz: ");
        int tr = sc.nextInt();
        System.out.println("Tarih Sinav Puanini Giriniz: ");
        int hst = sc.nextInt();
        System.out.println("Muzik Sinav Puanini Giriniz: ");
        int msc = sc.nextInt();

        sc.close();

        System.out.println("Lutfen Bekleyin...");
        SECONDS.sleep(2);

       int  average = (math + phy + che + tr + hst + msc) / 6;

        switch (average/10){
            case 10:
                graduate = "Sinifi Gecti...";
            break;
            case 9:
                graduate = "Sinifi Gecti...";
            break;
            case 8:
                graduate = "Sinifi Gecti...";
                break;
            case 7:
                graduate = "Sinifi Gecti...";
                break;
            default: graduate = "Sinifta Kaldi...";

        }

        System.out.println(graduate);








    }
}
