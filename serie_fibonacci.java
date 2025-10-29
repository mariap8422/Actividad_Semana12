public class serie_fibonacci {
    // Recursivo
    public static int fiboRec(int n) {
        if (n <= 1) return n;
        return fiboRec(n - 1) + fiboRec(n - 2);
    }

    // Iterativo
    public static int fiboIter(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println("Recursivo: " + fiboRec(7)); 
        System.out.println("Iterativo: " + fiboIter(7)); 
    }
}