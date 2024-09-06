public class JurosCompostos {
    private double valor;
    private double taxaDeJuros;
    private int periodo;

    public JurosCompostos(double valor, double taxaDeJuros, int periodo) {
        this.valor = valor;
        this.taxaDeJuros = taxaDeJuros;
        this.periodo = periodo;
    }

    public double calcularValorFuturo() {
        return valor * Math.pow((1 + taxaDeJuros / 100), periodo);
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public double getTaxaDeJuros() {
        return taxaDeJuros;
    }
    public void setTaxaDeJuros(double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }
    public int getPeriodo() {
        return periodo;
    }
    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }
}

