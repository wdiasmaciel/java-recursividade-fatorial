import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        double resultado;
        Scanner teclado = new Scanner(System.in);
        Fatorial fatorial = new Fatorial();

        System.out.println("Informe um número: ");
        num = teclado.nextInt();

        resultado = fatorial.fat(num);

        System.out.println("fat(" + num + ") = " + resultado);

        teclado.close();
    }
}