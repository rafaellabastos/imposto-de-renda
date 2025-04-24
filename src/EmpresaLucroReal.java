public class EmpresaLucroReal extends PessoaJuridica {
    public static final double ALIQUOTA_IMPOSTO_LUCRO = 0.25;


    public EmpresaLucroReal(String nome, double faturamentoAnual, double despesaAnual) {
        super(nome, faturamentoAnual, despesaAnual);
    }

    @Override
    public double calcularImpostos() {
        double lucro = getLucroAnual();
        if (lucro > 0) {
            return lucro * ALIQUOTA_IMPOSTO_LUCRO;
        } else {
            return 0;
        }
    }
}
