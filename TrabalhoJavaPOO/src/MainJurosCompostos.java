public class MainJurosCompostos {
    public static void main(String[] args) {
        double valor = 1000.00;
        double taxaDeJuros = 5.0;
        int periodo = 10;

        JurosCompostos investimento = new JurosCompostos(valor, taxaDeJuros, periodo);

        double valorFuturo = investimento.calcularValorFuturo();

        System.out.printf("O valor futuro do investimento é: R$%.2f%n", valorFuturo);
    }
}