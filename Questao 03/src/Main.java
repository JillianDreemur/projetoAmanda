
public class Main {
    public static void main(String[] args) {

            Carro carroCliente1 = new CarroBase();
            carroCliente1 = new ArCondicionado(carroCliente1);
            carroCliente1 = new Multimidia(carroCliente1);
            System.out.println("Cliente 1: " + carroCliente1.getDescricao());
            System.out.println("Preço total: R$ " + carroCliente1.preco());


            Carro carroCliente2 = new CarroBase();
            carroCliente2 = new AirBag(carroCliente2);
            carroCliente2 = new Multimidia(carroCliente2);
            System.out.println("\nCliente 2: " + carroCliente2.getDescricao());
            System.out.println("Preço total: R$ " + carroCliente2.preco());
        }
    }