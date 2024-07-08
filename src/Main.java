import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int a ;
        int b ;
        System.out.println("Kenarlari giriniz : ");
        a = scanner.nextInt();
        b= scanner.nextInt();
        System.out.println("Alan:" + a*b + "\n\n CEVRE:" + (a+a+b+b));


        }
    }
