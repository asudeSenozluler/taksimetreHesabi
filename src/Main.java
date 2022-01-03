import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        System.out.print("Aracınız kilometrede kaç kuruş yakıyor?: ");
        double kurus=scanner.nextDouble();
        System.out.print("Aracınızla kaç kilometre gittiniz?:");
        int km= scanner.nextInt();

        double tutar=kurus*km;
        System.out.println("Ödemeniz gereken tutar: "+tutar+" kuruş");


    }
}
