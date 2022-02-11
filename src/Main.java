import java.util.Scanner;
public class Main {
    static int power(int us , int taban){
        int result =1;
        for (int i = 1 ; i<=us;i++){
            result*=taban;
        }
        return result;
    }
    public static void main(String[] args) {
        int us , taban;
        Scanner sc=new Scanner(System.in);

        System.out.print("Taban degerini giriniz : ");
        taban=sc.nextInt();

        System.out.print("Us degerini giriniz : ");
        us=sc.nextInt();

        System.out.println("Sonuc : " +power(us,taban));

    }
}
