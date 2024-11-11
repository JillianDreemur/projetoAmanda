public class ArCondicionado extends AcessorioDecorator {
    Carro carro;

    public ArCondicionado(Carro carro) {
        this.carro = carro;
    }

    @Override
    public String getDescricao() {
        return carro.getDescricao() + ", Ar-Condicionado";
    }

    @Override
    public double preco() {
        return carro.preco() + 2500;
    }
}

