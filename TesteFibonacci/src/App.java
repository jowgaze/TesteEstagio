import java.util.Scanner;

public class App {

    /**
     * <h1>fib</h1>
     * @param n número que queremos saber se pertence a sequência de Fibonacci
     * @param a ao chamar a função recusiva, inicie o valor de a como 0 (Referente ao primeiro termo)
     * @param b ao chamar a função recusiva, inicie o valor de a como 1 (Referente ao segundo termo)
     * @return true se o número pertencer a sequência e false se não pertencer
     */
    public static boolean fib(int n, int a, int b) {
        if (n == a || n == b)
            return true;

        int proximo = a + b;

        if (proximo > n)
            return false;

        return fib(n, b, proximo);
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scan.nextInt();
        scan.close();

        if (fib(numero, 0, 1))
            System.out.println(numero + " pertence a sequência de Fibonacci");
        else
            System.out.println(numero + " não pertence a sequência de Fibonacci");
    }
}
