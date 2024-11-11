public class Main {
    public static void main(String[] args) {
        // Envio de mensagem em texto simples via Email
        Message simpleEmailMessage = new TextMessage(new EmailSender());
        simpleEmailMessage.send("Olá, esta é uma mensagem em texto simples via Email!");

        // Envio de mensagem em HTML via Email
        Message htmlEmailMessage = new HTMLMessage(new EmailSender());
        htmlEmailMessage.send("Olá, esta é uma mensagem HTML via Email!");

        // Envio de mensagem em texto simples via SMS
        Message simpleSMSMessage = new TextMessage(new SMSSender());
        simpleSMSMessage.send("Olá, esta é uma mensagem em texto simples via SMS!");

        // Envio de mensagem em HTML via SMS
        Message htmlSMSMessage = new HTMLMessage(new SMSSender());
        htmlSMSMessage.send("Olá, esta é uma mensagem HTML via SMS!");
    }
}