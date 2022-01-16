import java.util.Scanner;

public class GirilenSayıdanKüçük2ninKuvvetleriniBulanProgram {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Sınır sayısını giriniz: ");
        int sayı=input.nextInt();
        System.out.println("Dördün kuvvetleri");
        for (int i = 1; i <sayı ; i*=4) {

            System.out.println(i);

        } System.out.println("Beşin kuvvetleri: ");
        for (int j = 1; j <sayı ; j*=5) {

            System.out.println(j);
        }
    }
}
