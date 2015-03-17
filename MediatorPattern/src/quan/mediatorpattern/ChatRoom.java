package quan.mediatorpattern;

import java.util.LinkedList;
import java.util.Queue;

public class ChatRoom {
	public static final int SLEEP_TIME = 50;
	private final Queue<MessageFormat> messagesQueue;
	
	public ChatRoom() {
		messagesQueue = new LinkedList<MessageFormat>();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while (true) {
					ChatRoom.this.showMessage();
					try {
						Thread.sleep(SLEEP_TIME);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	}
	
	public void showMessage(){
		while(!messagesQueue.isEmpty()){
			MessageFormat message = messagesQueue.remove();
			System.out.println(message.getSender()+": "+message.getMessage());
		}
	}
	
	public void addMessage(MessageFormat message) {
		messagesQueue.add(message);
	}
}
