import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        int km;
        double perKm = 2.20, total, startPrice=10;

        Scanner inp = new Scanner(System.in);
        System.out.print("KM giriniz : ");
        km = inp.nextInt();

        total = perKm * km;
        total += startPrice;

        total = (total < 20) ? 20 : total;

        System.out.print("toplam tutar : " + total);


    }
}
