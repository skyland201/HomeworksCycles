import java.util.Scanner;

public class ArmstrongSayılarıBulanProgram {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Sayı giriniz: " );
        int sayı= input.nextInt();
        int temp=sayı;
        int value=0;
        int toplam=0;
        while(sayı!=0){
            sayı/=10;
            value++;
        }
        sayı=temp;
        System.out.println(value);
        for (int i = 0; i <value ; i++) {
          temp=sayı%10;
          sayı/=10;
          toplam+=temp;
            System.out.println(temp);
        }
        System.out.println(toplam);
    }
}
