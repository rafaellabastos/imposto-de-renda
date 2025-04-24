public abstract class Pessoa {
    private String nome;

    //Construtor
    public Pessoa(String nome) {
        this.nome = nome;
    }

    //Getter e setter
    public String getNome() {
        return nome;
    }

    //Métodos
    public abstract double calcularImpostos();
}
