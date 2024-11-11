class HTMLMessage extends Message {
    public HTMLMessage(MessageSender sender) {
        super(sender);
    }

    @Override
    public void send(String content) {
        sender.sendMessage("<html><body><p>" + content + "</p></body></html>");
    }
}