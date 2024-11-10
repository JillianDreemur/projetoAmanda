public class PayPalAdapter implements Pagamento {
    private PayPal payPal;

    public PayPalAdapter(PayPal payPal) {
        this.payPal = payPal;
    }

    @Override
    public void processarPagamento(double valor) {
        payPal.realizarPagamentoViaPayPal(valor);
    }
}
