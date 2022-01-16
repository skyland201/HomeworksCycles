import java.util.Scanner;

public class GirilenSayıyaKadarOlanÇiftSayılarıBulanProgram {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Sayı Giriniz: ");
        int sayı=input.nextInt();
        double ortalama=0;
        for (int i = 0; i < sayı; i++) {
            if(i%12==0||i==3||i==4){
                ortalama+=i;


            }


        }System.out.println(ortalama);
    }
}
