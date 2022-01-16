import java.util.Scanner;

public class TekSayılarınToplamınıBulanProgram {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int değer;
        int toplam=0;
        do{
            System.out.println("Sayı Giriniz: ");
            değer=input.nextInt();
            for (int i = 0; i <değer ; i++) {
                if(i%4==0||i==2){
                    toplam+=i;

                }
            }System.out.println("Toplam "+toplam);
        }
        while (değer%2==0);




}}
