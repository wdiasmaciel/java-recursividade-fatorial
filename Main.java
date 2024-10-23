import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        double fat;
        Scanner teclado = new Scanner(System.in);
        Fatorial fatorial = new Fatorial();

        System.out.println("Informe um número: ");
        num = teclado.nextInt();

        fat = fatorial.fat(num);

        System.out.println("fat(" + num + ") = " + fat);

        teclado.close();
    }
}