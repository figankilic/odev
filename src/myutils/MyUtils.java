
package myutils;

import java.util.Scanner;

public class MyUtils {
    private static Scanner input;
    public static void main(String[] args) {
        input = new Scanner(System.in);
		float birinciKenarUzunlugu, ikinciKenarUzunlugu, tabanUzunlugu , yukseklik, ucgenCevresi, ucgenAlani,kenarSayısı,
                        kenarUzunlugu,cokgenCevresi,cokgenAlani ,kenarSayisi ,kenarUzunluk ;
		
		System.out.println("Üçgenin Birinci Kenar Uzunluğunu giriniz:");
		birinciKenarUzunlugu = input.nextFloat();
		System.out.println("Üçgenin İkinci Kenar Uzunluğunu giriniz:");
		ikinciKenarUzunlugu= input.nextFloat();
		System.out.println("Üçgenin Taban Uzunluğunu Giriniz:");
		tabanUzunlugu= input.nextFloat();
                System.out.println("üçgen Çevre= "+ucgenCevre(birinciKenarUzunlugu, ikinciKenarUzunlugu, tabanUzunlugu));
                
		System.out.println("Üçgenin Yüksekliğini Giriniz:");
		yukseklik= input.nextFloat();
                System.out.println("üçgen Alan= "+ucgenAlan(tabanUzunlugu,yukseklik));

                
                System.out.println("çokgen kaç kenardan oluşuyor:");
                kenarSayısı=input.nextFloat();
                System.out.println("çokgen kenarlaın uzunluğu oluşuyor:");
                kenarUzunlugu=input.nextFloat();
                System.out.println("çokgen Çevre= "+cokgenCevre(kenarSayısı,kenarUzunlugu));

                
                System.out.println("kenar sayısı giriniz:");
                kenarSayisi=input.nextFloat();
                System.out.println("çokgen kenarlaın uzunluğu oluşuyor:");
                kenarUzunluk=input.nextFloat();
                System.out.println("çokgen Alan= "+cokgenAlan(kenarSayisi,kenarUzunluk));

		
		}

	public static float ucgenCevre(float a, float b, float c){
		float cevre= a+b+c;
		return (float) cevre;
		}
	public static float ucgenAlan(float z, float h)
        {
            float alan= (z*h)/2;
            return (float) alan;
	}
       public static float cokgenCevre(float kenar,float uzunluk)
       {
           float cevre= kenar*uzunluk;
           return (float) cevre;
       }
       public static float cokgenAlan(float kenar1,float uzunluk1)
       {
           float alan= (float) ((kenar1*(uzunluk1*uzunluk1))/(4*Math.tan(Math.PI/kenar1)));
           return (float) alan;
       }
	
    }
   
    
