package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;
Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.*/
        Scanner scan = new Scanner(System.in);
        double price, nPrice;
        System.out.print("Mesafeyi km cinsinden giriniz: ");
        int distance = scan.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        int age = scan.nextInt();
        System.out.print("Yolculuk tipini giriniz(1=> tek yön, 2=> çift yön) : ");
        int type = scan.nextInt();
        if (distance > 0) {
            if (age > 0) {
                if (type == 1 || type == 2) {
                    nPrice = distance * 0.10;
                    System.out.println("Normal fiyat: " + nPrice + " Tl ");

                }
            }
        } else {
            System.out.println("Hatalı bilgi girdiniz!");
        }
        if (age < 12) {
            if (type == 2) {
                price = distance * 0.03;
                System.out.println("İndirimli fiyat: " + price);
            } else {
                price = distance * 0.05;
                System.out.println("İndirimli fiyat: " + price);
            }
        } else if (age >= 12 && age <= 24) {
            if (type == 2) {
                price = distance * 0.07;
                System.out.println("İndirimli fiyat: " + price);
            } else {
                price = distance * 0.09;
                System.out.println("İndirimli fiyat: " + price);
            }
        } else if (age > 65) {
            if (type == 2) {
                price = distance * 0.05;
                System.out.println("İndirimli fiyat: " + price);
            } else {
                price = distance * 0.07;
                System.out.println("İndirimli fiyat: " + price);
            }

        }


    }
}

