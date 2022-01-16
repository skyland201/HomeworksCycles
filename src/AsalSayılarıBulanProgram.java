public class AsalSayılarıBulanProgram {
    public static void main(String[] args) {
        int asalsayı=2;
        System.out.println(asalsayı);
        for (int i = 2; i <100 ; i++) {

            if(i==3||i==5||i==7){
                asalsayı=i;

                System.out.println(asalsayı);
            }
            if(i%2!=0&&i%3!=0&&i%5!=0&&i%7!=0){
                asalsayı=i;
                System.out.println(asalsayı);
            }


        }
    }
}
