public class Fatorial {
    // Método recursivo para calcular o fatorial:
    public double calcular(int n) {
        // Caso base:
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // Chamada recursiva:
            return n * fatorial(n - 1);
        }
    }
}