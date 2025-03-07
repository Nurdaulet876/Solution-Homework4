# ConfigurationManager & ChatServiceAdapter

• Overview
This project demonstrates the implementation of two structural design patterns:
• Singleton Pattern – ConfigurationManager ensures a single instance for managing configuration settings.
• Adapter Pattern – ChatServiceAdapter adapts LegacyChatService to be compatible with ChatService.

• File Structure
ConfigurationManager.java – Singleton class for managing configuration settings.
ConfigManagerDemo.java – Demo class to test ConfigurationManager.
LegacyChatService.java – Old chat service with a legacy method signature.
ChatService.java – Modern chat service interface.
ChatServiceAdapter.java – Adapter to make LegacyChatService compatible with ChatService.
ChatAdapterDemo.java – Demo class to test ChatServiceAdapter.

• Compilation and Execution
Prerequisites:
(1)Ensure you have Java 8 or later installed.
(2)Use a terminal or command prompt with access to javac and java.

Compilation:
• Run the following command to compile all Java files:
javac *.java

• Running the Demos:
To run the ConfigurationManager demo:
java ConfigManagerDemo
To run the ChatServiceAdapter demo:
java ChatAdapterDemo

• Expected Output:
(1)ConfigManagerDemo:
Max players: 100
Default language: en
Game difficulty: medium

Configuration settings:
maxPlayers -> 100
defaultLanguage -> en
gameDifficulty -> medium

(2)ChatAdapterDemo:
Legacy chat: Hello world!
