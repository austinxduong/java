package Strings;

public class MessagingDevice {
    public static int msgDevice(String msg) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int result = 0;

        for (int i = 0; i < msg.length(); i++) {
            char charIndex = msg.charAt(i);
            int position = alphabet.indexOf(charIndex) + 1;
            result += position;
        }
        return result;
    }

    public static void main (String[] args) {
        String msg = "xyzmpc";
        System.out.println(msgDevice(msg));
    }
}

// u // 21
// xyz // 75
// xyzmpc / 107