public class Main {
    public static void main(String[] args) {
        Pagamento pagamentoCartao =
                new CartaoCredito("3671 9426 7815 2615");
        pagamentoCartao.processarPagamento(100.0);

        PayPal contaPayPal = new PayPal("usuario@paypal.com");
        Pagamento pagamentoPayPal = new PayPalAdapter(contaPayPal);
        pagamentoPayPal.processarPagamento(200.0);
    }
}
//questao 5