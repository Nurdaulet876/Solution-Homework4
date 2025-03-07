// Adapter class to make LegacyChatService compatible with ChatService
public class ChatServiceAdapter implements ChatService{
    private LegacyChatService legacyChatService;

    // Constructor to initialize the adapter with a legacy chat service
    public ChatServiceAdapter(LegacyChatService legacyChatService){
        this.legacyChatService = legacyChatService;
    }

    // Adapting sendMessage to call the legacy method
    public void sendMessage(String message){
        legacyChatService.legacyMessage(message);
    }
}