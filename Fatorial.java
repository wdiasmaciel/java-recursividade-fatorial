public class Fatorial {
    // Método recursivo para calcular o fatorial:
    public double fat(int n) {
        // Caso base:
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // Chamada recursiva:
            return n * fat(n - 1);
        }
    }
}