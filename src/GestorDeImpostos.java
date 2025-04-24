import java.util.ArrayList;
import java.util.List;

public class GestorDeImpostos {
    private double valorTotalImpostos = 0;
    private List<Pessoa> pessoas = new ArrayList<>();

    public void adicionar(Pessoa pessoa) {
        valorTotalImpostos += pessoa.calcularImpostos();
        pessoas.add(pessoa);
    }

    //Getter e setter
    public double getValorTotalImpostos() {
        return valorTotalImpostos;
    }
}
