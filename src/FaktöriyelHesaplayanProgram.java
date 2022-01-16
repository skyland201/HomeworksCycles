import java.util.Scanner;

public class FaktöriyelHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Kombinasyon sayılarını giriniz (C(n.r)): ");
        int n=input.nextInt();
        int r= input.nextInt();

        int fact=1;
        int fact2=1;

        for (int i = n; i >r ; i--) {
            fact*=i;
        }
        for (int j = 1; j <=(n-r) ; j++) {
            fact2*=j;
        }
        int sonuç=fact/fact2;
        System.out.println("C("+n+","+r+")= "+sonuç);
    }
}
