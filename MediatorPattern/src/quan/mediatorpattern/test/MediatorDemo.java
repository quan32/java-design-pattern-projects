package quan.mediatorpattern.test;

import quan.mediatorpattern.ChatRoom;
import quan.mediatorpattern.User;

public class MediatorDemo {
	public static final int TIME_JOIN =500;
	public static void main(String[] args) {
		final ChatRoom chatRoom1 = new ChatRoom();
		
		final User quan = new User("Quan");
		final User hiep = new User("Hiep");
		
		quan.joinChatRoom(chatRoom1);
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(TIME_JOIN);
				} catch (Exception e) {
					e.printStackTrace();
				}	
				hiep.joinChatRoom(chatRoom1);
			}
		}).start();	
	}
}
