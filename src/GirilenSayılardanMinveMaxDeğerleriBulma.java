import java.util.ArrayList;
import java.util.Scanner;

public class GirilenSayılardanMinveMaxDeğerleriBulma {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int min=0;
        int max=0;
        int val=0;
        int n2=1;
        System.out.println("Kaç tane sayı gireceksiniz: ");
        int n1= input.nextInt();
        for (int i = 1; i <=n1 ; i++) {
            System.out.println(i+" sayıyı giriniz: ");
            n2= input.nextInt();
            if(n2>val){
                max=n2;
                val=n2;
            }else{
               if(n2<min)
                   min=n2;
            }
        }
        System.out.println("En büyük sayı: "+max);
        System.out.println("En küçük sayı"+ min);
    }
}
