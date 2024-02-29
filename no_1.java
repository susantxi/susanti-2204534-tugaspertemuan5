package java_perulangan;

import java.util.Scanner;

public class no_1 {  
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int[] bilangan = new int[3];
        
        for(int i = 0; i < 3; i++){
            System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
            bilangan[i] = userInput.nextInt();
        }
        System.out.println();
        
        for(int i = 0; i < 3; i++){
            if(bilangan[i] >= 1000 && bilangan[i] <= 9999){
                System.out.println("Bilangan ke-" + (i + 1) + " merupakan bilangan ribuan.");
            }else{
                System.out.println("Bilangan ke-" + (i + 1) + " bukan bilangan ribuan.");
            }
        }
        
        userInput.close();
    }
}

