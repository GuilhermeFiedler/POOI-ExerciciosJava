public class MainEquacao2grau {

    public static void main(String[] args) {
        int a = 1;
        int b = 5;
        int c = 6;

        Equacao2grau equacao = new Equacao2grau(a, b, c);

        double ValordeDelta = equacao.contaDelta();
        System.out.println("Delta: " + ValordeDelta);

        try {
            double[] raizes = equacao.contaRaizes();
            System.out.println("x1 = " + raizes[0]);
            System.out.println("x2 = " + raizes[1]);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
