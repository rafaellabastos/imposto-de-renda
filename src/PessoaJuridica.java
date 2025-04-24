public abstract class PessoaJuridica extends Pessoa {
    private double faturamentoAnual;
    private double despesaAnual;

    //Construtor
    public PessoaJuridica(String nome, double faturamentoAnual, double despesaAnual) {
        super(nome);
        this.faturamentoAnual = faturamentoAnual;
        this.despesaAnual = despesaAnual;
    }

    //Getter e setter
    public double getFaturamentoAnual() {
        return faturamentoAnual;
    }

    public double getDespesaAnual() {
        return despesaAnual;
    }

    public double getLucroAnual() {
        return faturamentoAnual - despesaAnual;
    }
}
