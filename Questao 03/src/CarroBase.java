public class CarroBase extends Carro {
    public CarroBase() {
        descricao = "Carro básico";
    }

    @Override
    public double preco() {
        return 20000;
    }
}
