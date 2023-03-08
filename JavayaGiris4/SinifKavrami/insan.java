package JavayaGiris4.SinifKavrami;

import java.util.Scanner;

public class insan {

    int boy;
    int yas;
    float kilo;
    String cinsiyet;

    public float yemek(int besin,float kilo){
        System.out.println("Metoda giriş yapıldı.Yediğiniz besine göre kilonuz güncelleniyor...");

        switch (besin){
            case 1: kilo+=2;
                break;
            case 2: kilo+=1.25;
                break;
            default: kilo+=0.5;
                break;
        }
        return kilo;

    }
}
