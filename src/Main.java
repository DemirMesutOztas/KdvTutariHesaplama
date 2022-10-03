import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double input;
        double kdvli;
        double kdv;
        double oran;

        Scanner k_input = new Scanner(System.in);
        System.out.print("Tutar giriniz: ");
        input = k_input.nextDouble();

        oran = input<=1000 ? 1.18 : 1.10;
        kdvli = input*oran;
        kdv = kdvli-input;

        System.out.println("Kdvsiz tutar: "+ input);
        System.out.println("Kdvli tutar: "+ kdvli);
        System.out.println("Kdv: "+ kdv);



    }
}