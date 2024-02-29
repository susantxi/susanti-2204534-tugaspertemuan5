package java_perulangan;

import java.util.Scanner;

public class no_2 {
    public static boolean isPrime(int num) {
        for(int i = 2; i <= num/2; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
        
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Masukkan batas awal: ");
        int batasAwal = userInput.nextInt();

        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = userInput.nextInt();
        
        if(batasAwal >= 1 && batasAkhir <= 100){
            System.out.printf("Bilangan prima %d sd %d adalah: ", batasAwal, batasAkhir);
            for(int i = batasAwal; i <= batasAkhir; i++){
                if(i != 1 && isPrime(i)){
                    System.out.print(i + " ");
                }
            }
            System.out.println();

            System.out.printf("Bilangan komposit %d sd %d adalah: ", batasAwal, batasAkhir);
            for(int i = batasAwal; i <= batasAkhir; i++){
                if(i != 1 && !isPrime(i)){
                    System.out.print(i + " ");
                }
            }
        }else{
            System.out.println("Batasan yang Anda Masukkan Tidak Dapat Diproses");
        }
        System.out.println();
        userInput.close();
    }
}
