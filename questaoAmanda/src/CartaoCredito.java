public class CartaoCredito implements Pagamento {
    private String numeroCartao;

    public CartaoCredito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$" + valor +
                " com Cartão de Crédito: " + numeroCartao);
    }
}
