public class Equacao2grau {

    private int a;
    private int b;
    private int c;

    public Equacao2grau(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double contaDelta() {
        return (b * b) - (4 * a * c);
    }

    public double[] contaRaizes() {
        double delta = contaDelta();
        double[] raizes = new double[2];

        if (delta >= 0) {
            raizes[0] = (-b + Math.sqrt(delta)) / (2 * a);
            raizes[1] = (-b - Math.sqrt(delta)) / (2 * a);
        } else {
            throw new ArithmeticException("Delta não tem raiz real.");
        }

        return raizes;
    }

}

