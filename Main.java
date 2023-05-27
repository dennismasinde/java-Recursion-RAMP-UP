public class Main {

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(fibonacci(3));
        System.out.println(triangularNumber(3));
    }

    public static int factorial(int num) {
        if (num == 1) {
            return num;
        }
        return num * factorial(num - 1);
    }

    public static int fibonacci(int num) {
        if (num == 1) {return num;}
        if (num == 0) {return num;}
        return fibonacci(num - 1) + fibonacci(num -2);
    }

    public static int triangularNumber(int num) {
        if (num == 1) {
            return num;
        }
        return num + triangularNumber(num -1);
    }
}
