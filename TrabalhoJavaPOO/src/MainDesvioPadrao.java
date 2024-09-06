public class MainDesvioPadrao {
    public static void main(String[] args) {
        double[] dados = {5,8,6,7,4};
        DesvioPadrao dp = new DesvioPadrao(dados);
        double desvioPadrao = dp.calcularDesvioPadrao();

        System.out.printf("O desvio padrão é: %.2f%n", desvioPadrao);
    }
}
