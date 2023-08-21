import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma temperatura em celsius: ");
        double num1 = input.nextDouble();
        System.out.println("Resultado da transformação: "+ ((num1*9/5)+32));
        input.close();
    }
}
