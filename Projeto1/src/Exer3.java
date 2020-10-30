import java.util.Scanner;


public class Exer3 {
    public static void main(String[] args) {
        
        Scanner leitura = new Scanner(System.in);
        int num;
        
        System.out.println("digite um numero inteiro");
        num = Integer.parseInt(leitura.nextLine() );

        if (num < 0 || num > 23) {
            System.out.println(" hora invalida");

        }else { 
            if (num < 6) {
            System.out.println(" Boa madrugada");
            }else {
                if (num < 12 ) {
                    System.out.println(" Boa dia"); 
                }else {
                    if (num < 18 ) {
                        System.out.println(" Boa "); 
                    }else {
                        System.out.println(" Boa noite");
                    }
                }    
            }
        }
    }
}
