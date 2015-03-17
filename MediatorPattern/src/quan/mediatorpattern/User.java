package quan.mediatorpattern;

public class User{
	public static final int TIME_TO_SEND = 1000;
	private String name;
	private ChatRoom chatRoom;
	private int messageId = 1;
	
	public User(String name){
		this.name = name;
	}
	
	public void joinChatRoom(ChatRoom chatroom) {
		this.chatRoom = chatroom;
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true) {
					User.this.sendMessage();
					try {
						Thread.sleep(TIME_TO_SEND);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}	
			}
		}).start();
	}
	
	public void sendMessage() {
		String message = "Message "+messageId++;
		chatRoom.addMessage(new MessageFormat(this.name, message));
	}
}
