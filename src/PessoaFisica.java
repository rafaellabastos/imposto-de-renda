public class PessoaFisica extends Pessoa {
    public static final double RECEITA_ANUAL_ISENCAO = 5000;
    public static final double ALIQUOTA_IMPOSTO_RENDA = 0.20;
    private double receitaAnual;

    //Construtor
    public PessoaFisica(String nome, double receitaAnual){
        super(nome);
        this.receitaAnual = receitaAnual;
    }

    //Getter e setter
    public double getReceitaAnual() {
        return receitaAnual;
    }

    @Override
    public double calcularImpostos() {
        if (receitaAnual <= RECEITA_ANUAL_ISENCAO) {
            return 0;
        } else {
            return (receitaAnual - RECEITA_ANUAL_ISENCAO) * ALIQUOTA_IMPOSTO_RENDA;
        }
    }
}
