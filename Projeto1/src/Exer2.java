import java.util.Scanner;


public class Exer2 {
    public static void main(String[] args) {
        
        Scanner leitura = new Scanner(System.in);
        float nota1, nota2, media;
        
        System.out.println("digite a primeira nota: ");
        nota1 = Integer.parseInt(leitura.nextLine() );

        System.out.println("digite a segunda nota: ");
        nota2 = Integer.parseInt(leitura.nextLine() );

       media = (nota1 + nota2) /2;

       if (media <4){
        System.err.println("Reprovado. ");
       }else {
           if (media >= 7) {
            System.out.println("Aprovado ");
           }else {
            System.out.print("Recuperação ");
            System.out.print("Digite a nota de recuperação: ");
            media = Float.parseFloat(leitura.nextLine());
            if (media < 6){
                System.err.print("reprovado na rec. ");
            }else {
                System.out.println("Aprovado ");
            }
           }
       }
    }
}
