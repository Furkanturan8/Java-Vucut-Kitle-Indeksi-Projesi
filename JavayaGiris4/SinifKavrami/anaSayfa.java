package JavayaGiris4.SinifKavrami;
import java.util.Scanner;

public class anaSayfa {
    public static void main(String[] args) {
//bir insanın boy,kilo,yas,cinsiyet verileri alındı. Ve vücut kitle indeksi hesaplandı. Ek olarak yemek yediğinde kilo artışı sağlanıp kilo güncellendi.

        float vKitleIndeksi;
        insan ali=new insan();
        Scanner girisIslemleri=new Scanner(System.in);

        System.out.print("Boyunuzu giriniz:");
            int boyGiris=girisIslemleri.nextInt();
        System.out.print("Yaşınızı giriniz:");
            int yasGiris=girisIslemleri.nextInt();
        System.out.print("Kilonuzu giriniz:");
            float kiloGiris=girisIslemleri.nextFloat();
        System.out.print("Cinsiyetinizi giriniz (Erkek/Kadın):");
            String cinsiyetGiris=girisIslemleri.next();

        if(cinsiyetGiris.equals("Erkek") || cinsiyetGiris.equals("erkek") || cinsiyetGiris.equals("Kadın") || cinsiyetGiris.equals("kadın"))
            System.out.println("Verileriniz kaydedildi...");
        else{
            System.out.println("Hatalı cinsiyet seçimi yaptınız! Tekrar deneyiniz...");
            return;
        }

            ali.boy=boyGiris;
            ali.kilo=kiloGiris;
            ali.yas=yasGiris;
            ali.cinsiyet=cinsiyetGiris;

        System.out.print("Yediğiniz yiyeceği giriniz (1-et/2-sebze/3-diger): ");
           int besin=girisIslemleri.nextInt();

        System.out.println("Besin seçimi: "+besin);
        insan test=new insan();//burada insan sınıfını anaSayfaya dahil ettik.

        ali.kilo=test.yemek(besin,ali.kilo); //burada yemek fonksiyonunu çağırdık ve değerleri güncelledik
        //sonra ali.kilo ya yani alinin kilosuna atadık.

        System.out.println("Güncel kilonuz: "+ali.kilo);
        System.out.println("Boyunuz: "+ali.boy);
        System.out.println("Yaşınız: "+ali.yas);
        System.out.println("Cinsiyetiniz: "+ali.cinsiyet);

        vKitleIndeksi=10000 * ali.kilo/(ali.boy* ali.boy); //boy cm cinsinden olduğu için 10000 ile çarpıyoruz
        System.out.println("Vücut kitle indeksiniz:" + vKitleIndeksi);

        if (vKitleIndeksi<18.5)
            System.out.println("Ideal kilonun altında !");
        else if (vKitleIndeksi>18.5 && vKitleIndeksi<24.9)
            System.out.println("Ideal kiloda !");
        else if (vKitleIndeksi>25 && vKitleIndeksi<29.9)
            System.out.println("Ideal kilonun üstünde !");
        else if (vKitleIndeksi>30 && vKitleIndeksi<39.9)
            System.out.println("Ideal kilonun üstünde (obez) !");
        else
            System.out.println("Ideal kilonun çok üstünde (morbid obez) !");

    }
}
