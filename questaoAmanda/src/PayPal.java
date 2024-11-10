public class PayPal {
    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    public void realizarPagamentoViaPayPal(double valor) {
        System.out.println("Processando pagamento de R$" + valor +
                " via PayPal, Conta: " + email);
    }
}
