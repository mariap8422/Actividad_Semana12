public class factorial2 {
    public static int factorial2(int num) {
        int resultado = 1;
        for (int i = 1; i <= num; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(factorial2(5)); 
    }
}