public abstract class Carro {
    protected String descricao = "Carro básico";

    public String getDescricao() {
        return descricao;
    }

    public abstract double preco();
}
