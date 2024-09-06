public class DesvioPadrao {
    private double[] dados;
    public DesvioPadrao(double[] dados) {
        this.dados = dados;
    }
    public double calcularMedia() {
        double soma = 0.0;
        for (double valor : dados) {
            soma += valor;
        }
        return soma / dados.length;
    }
    public double calcularDesvioPadrao() {
        double media = calcularMedia();
        double somaQuadrados = 0.0;
        for (double valor : dados) {
            somaQuadrados += Math.pow(valor - media, 2);
        }
        return Math.sqrt(somaQuadrados / dados.length);
    }
}
