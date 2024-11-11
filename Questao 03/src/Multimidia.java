public class Multimidia extends AcessorioDecorator {
    Carro carro;

    public Multimidia(Carro carro) {
        this.carro = carro;
    }

    @Override
    public String getDescricao() {
        return carro.getDescricao() + ", Multimídia";
    }

    @Override
    public double preco() {
        return carro.preco() + 1500;
    }
}
