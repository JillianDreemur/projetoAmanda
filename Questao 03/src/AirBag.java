public class AirBag extends AcessorioDecorator {
    Carro carro;

    public AirBag(Carro carro) {
        this.carro = carro;
    }

    @Override
    public String getDescricao() {
        return carro.getDescricao() + ", Air Bag";
    }

    @Override
    public double preco() {
        return carro.preco() + 3000;
    }
}