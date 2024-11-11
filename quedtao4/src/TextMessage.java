class TextMessage extends Message {
    public TextMessage(MessageSender sender) {
        super(sender);
    }

    @Override
    public void send(String content) {
        sender.sendMessage("Texto simples: " + content);
    }
}