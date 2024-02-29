package java_perulangan;

import java.util.Scanner;

public class no_3 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Masukkan nilai : ");
        int N = userInput.nextInt();
        
        if(N > 0 && N <= 1000){
            for(int i = 1 ; i <= N; i++){
                for(int j = 1; j <= i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }else{
            System.out.printf("Tidak Ada Hasil Untuk Nilai %d \n", N);
        }
        
        userInput.close();
    }
}
