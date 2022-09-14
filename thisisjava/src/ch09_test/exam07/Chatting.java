package ch09_test.exam07;

public class Chatting {
	class Chat{
		void start() {
			System.out.println("Chat을 시작합니다.");
		}
		void sendMessage(String message) {}
	}
	
	void startChat(String chatId) {
		String nickName = chatId;
		
		Chat chat = new Chat() {
			@Override
			void start() {
				while(true) {
					String inputData = "안녕하세요";
					String message = "["+nickName+"]"+"님이 입장하셨습니다";
					sendMessage(message);
					
					System.out.println(inputData);
					System.out.println(message);
					break;
				}
			}
		};
		
		chat.start();
	}

}
