package JAVA_Basic_07_Collection;

import java.util.LinkedList;
import java.util.Queue;

class Message{
    String command;
    String to;

    Message(String command, String to) {
        this.command = command;
        this.to = to;
    }

}
public class Ex03_Queue {
    public static void main(String[] args) {
        Queue<Message> messageQueue = new LinkedList<>();
        //선입선출

        messageQueue.offer(new Message("sendMail", "메세지"));
        messageQueue.offer(new Message("sendSNS", "메세지1"));
        messageQueue.offer(new Message("sendKato", "메세지2"));

        while (!messageQueue.isEmpty()) {
            Message message = messageQueue.poll();
            switch (message.command) {
                case "sendMail":
                    System.out.println(message.to + "메일전송");
                    break;
                //case 기타 등등:
                default: break;
            }
        }
    }
}
