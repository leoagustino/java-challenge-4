import java.util.Scanner;

public class javaMethod {

    //method atau function
    public static void main(String[]args){
        Scanner scannner = new Scanner(System.in);
        int nilai;
        System.out.println("Masukkan Nilai : ");
        nilai = scannner.nextInt();
        checknilai(nilai);
    }

        static void checknilai(int nilai){
        if(nilai >=0 && nilai <= 20 ){
            System.out.println("Anda Mendapat : E");
        } else if (nilai >= 21 && nilai <=40){
            System.out.println("Anda Mendapat : D");
        } else if (nilai >=41 && nilai <=60){
            System.out.println("Anda Mendapat : C");
        } else if (nilai >=61 && nilai <=79){
            System.out.println("Anda Mendapat : B");
        }else if (nilai >= 80 && nilai <=100){
            System.out.println("Anda Mendapat : A");
        }else {
            System.out.println("Error");
        }
    }
    
    

}