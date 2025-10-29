public class sumade1anum {
    public static int sumade1anum(int num) {
        if (num <= 1) {
            return num;
        }
        return num + sumade1anum(num - 1);
    }

    public static void main(String[] args) {
        System.out.println(sumade1anum(6)); 
    }
}
//recuriva