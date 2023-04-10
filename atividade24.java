package atividade24;
import java.util.Scanner;
public class atividade24 {
    
    public static void main(String[] args) {
        Integer quantidade,numero;
        Scanner scanner = new Scanner(System.in);

    System.out.println("Digite quantos números deseja digitar: ");
    while (!scanner.hasNextInt()){
        System.out.println("Digite um número válido");
        scanner.next();
    } 
    quantidade = scanner.nextInt();

    Integer i=0;
    
    do{
        System.out.println("Digite um número inteiro: ");

        while (!scanner.hasNextInt()){
            System.out.println("Digite um número válido");
            scanner.next();
        } 
        numero = scanner.nextInt();


     if (numero>0){
        System.out.println("O número é positivo");
     }
     else if (numero<0){
        System.out.println("O número é negativo");
     }
     else{
        System.out.println("O número é zero");
     }
    i++;
    } while (quantidade != i);
}
}