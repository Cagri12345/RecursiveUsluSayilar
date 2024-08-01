package Basic;
import java.util.Scanner;
public class RecursiveUsluSayilar {

    //Taban üs hesabı yapan özyinelemeli metot
    static int usAl(int taban,int us){
        if(us == 0){
            return 1;  //Üssü sıfır olan her sayının sonucu 1'dir
        }
        return taban * usAl(taban,us-1);  //Özyinelemeli yer
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int taban,us;

        System.out.println("Taban değerini girin: ");
        taban = input.nextInt();

        System.out.println("Üs değerini girin: ");
        us = input.nextInt();

        System.out.println("Sonucunuz: " + usAl(taban,us));
    }
}
