/* 
Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.

Çin Zodyağı nedir?

4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar. 
Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır ve yıldızlarla pek bir ilgisi yoktur.

Çin Zodyağı nasıl hesaplanır?

Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.

Doğum Tarihi %12 = 0 ➜ Maymun

Doğum Tarihi %12 = 1 ➜ Horoz

Doğum Tarihi %12 = 2 ➜ Köpek

Doğum Tarihi %12 = 3 ➜ Domuz

Doğum Tarihi %12 = 4 ➜ Fare

Doğum Tarihi %12 = 5 ➜ Öküz

Doğum Tarihi %12 = 6 ➜ Kaplan

Doğum Tarihi %12 = 7 ➜ Tavşan

Doğum Tarihi %12 = 8 ➜ Ejderha

Doğum Tarihi %12 = 9 ➜ Yılan

Doğum Tarihi %12 = 10 ➜ At

Doğum Tarihi %12 = 11 ➜ Koyun
*/

package Java.ikinciKonu_kosulluDurumlar.egzersizler;

import java.util.Scanner;

public class cinZodyagi {
    public static void main(String[] args){
        int dTarih, zodyag ;

        Scanner scan = new Scanner(System.in);

        System.out.print("Doğum yılınızı giriniz: ");
        dTarih = scan.nextInt();

        zodyag = dTarih % 12;

        switch(zodyag){
            case 0:
                System.out.print("Çin Zodyağı'na göre burcunuz: 'Maymun'");
                break;
            
            case 1:
                System.out.print("Çin Zodyağı'na göre burcunuz: 'Horoz'");  
                break;  

            case 2:
                System.out.print("Çin Zodyağı'na göre burcunuz: 'Köpek'");
                break;

            case 3:
                System.out.print("Çin Zodyağı'na göre burcunuz: 'Domuz'");
                break;

            case 4:
                System.out.print("Çin Zodyağı'na göre burcunuz: 'Fare'");
                break;

            case 5:
                System.out.print("Çin Zodyağı'na göre burcunuz: 'Öküz'");
                break;

            case 6:
                System.out.print("Çiz Zodyağı'na göre burcunuz: 'Kaplan'");
                break;

            case 7:
                System.out.print("Çin Zodyağı'na göre burcunuz: 'Tavşan'");
                break;

            case 8:
                System.out.print("Çin Zodyağı'na göre burcunuz: 'Ejderha'");
                break;

            case 9:
                System.out.print("Çin Zodyağı'na göre burcunuz: 'Yılan'");
                break;

            case 10:
                System.out.print("Çin Zodyağı'na göre burcunuz: 'At'");
                break;

            case 11:
                System.out.print("Çin Zodyağı'na göre burcunuz: 'Koyun'");
                break;
        }

    }
    
}
