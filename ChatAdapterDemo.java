// Demo class to test the chat adapter
public class ChatAdapterDemo {
    public static void main(String[] args) {
        LegacyChatService legacyChat = new LegacyChatService();
        ChatService adapter = new ChatServiceAdapter(legacyChat);
        adapter.sendMessage("Hello world!");
    }
}
