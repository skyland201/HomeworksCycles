import java.util.Scanner;

public class EBOB_EKOKBulanProgram {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int kontrol=1;
        while (kontrol==1){
            System.out.println("n1 sayısını giriniz: ");
            int n1= input.nextInt();
            System.out.println("n2 sayısını giriniz: ");
            int n2 = input.nextInt();
            int ebob=0;
            if(n1>=n2){
                for (int i = 1; i <=n1 ; i++) {
                    if(n1%i==0&&n2%i==0){
                        ebob=i;
                    }

                }
            }else{
                for (int i = 1; i <=n2 ; i++) {
                    if(n1%i==0&&n2%i==0){
                        ebob=i;
                    }

                }

            }
            System.out.println(n1+" ve "+n2+"'nin EBOB'U: "+ebob);
            int ekok=(n1*n2)/ebob;
            System.out.println(n1+" ve "+n2+"'nin EKOK'U: "+ekok);
            System.out.println("Çıkmak için 0 yazınız.\nDevam etmek için 1 yazınız." );
            kontrol=input.nextInt();
        }

    }
}
