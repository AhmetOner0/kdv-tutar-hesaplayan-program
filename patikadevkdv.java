package giris;
import java.util.Scanner;

public class patikadevkdv {
    public static void main(String[] args) {
        double fiyat,kdvlifiyat,kdvtutar,kdvoran = 0.18;

        Scanner input = new Scanner(System.in);

        System.out.print("ürünün fiyatını giriniz: ");
        fiyat = input.nextInt();

        kdvtutar = (fiyat * kdvoran);
        kdvlifiyat = fiyat + kdvtutar;


        System.out.println("ürünün KDV oranı:"+kdvoran);
        System.out.println("KDV tutarı: "+kdvtutar );
        System.out.print("ürünün KDV'li fiyatı: " +kdvlifiyat);
    }


}

