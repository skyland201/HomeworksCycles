
import java.util.Scanner;

public class ÜslüSayıHesaplayaProgram {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Üssü alınacak sayıyı giriniz: ");
        int üslüSayı= input.nextInt();
        System.out.println("Üs olcak sayıyı giriniz: ");
        int üs= input.nextInt();
        int fact=1;
        int diğerSayı=üslüSayı;
    int i;
        for (i = 1; i <= üs ; i++) {
         üslüSayı=fact*üslüSayı;
         fact=0;
         fact=fact+diğerSayı;
        }
        System.out.println(üslüSayı);
    }

}
