import java.util.Scanner;


public class Exer1 {
    public static void main(String[] args) {
        
        Scanner leitura = new Scanner(System.in);
        int num;
        
        System.out.println("digite um numero");
        num = Integer.parseInt(leitura.nextLine() );

        if (num >= 10 && num <= 20) {
            System.out.println(" esta entre 10 e 20");

        }else {
            System.out.println("não esta entre 10 e 20");

        }

    }
}
