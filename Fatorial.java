public class Fatorial {
    // Método recursivo para calcular o fatorial:
    public double fat(int n) {
        if (n < 0)
            return 0;
            
        // Caso base:
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // Chamada recursiva:
            return n * fat(n - 1);
        }
    }
}