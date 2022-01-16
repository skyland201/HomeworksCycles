import java.util.Scanner;

public class MükemmelSayıBulanProgram {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayı= input.nextInt();
        int toplam=0;
        for (int i = 1; i <sayı ; i++) {
            if(sayı%i==0)
                toplam+=i;

        }
        if(toplam==sayı)
            System.out.println(sayı+" Mükemmel sayıdır.");
        else
            System.out.println(sayı+" Mükemmel sayı değildir.");
    }
}
