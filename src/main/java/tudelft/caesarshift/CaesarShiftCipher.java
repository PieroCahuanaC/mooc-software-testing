package tudelft.caesarshift;

public class CaesarShiftCipher {

    public String encrypt(String message, int shift) {
        StringBuilder sb = new StringBuilder();
        shift = shift % 26;

        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (c == ' ') {
                sb.append(c); // puede tener espacios
            } else if (c < 'a' || c > 'z') {
                return "invalid";
            } else {
                int shifted = c + shift;
                if (shifted > 'z') {
                    shifted = shifted - 26;
                } else if (shifted < 'a') {
                    shifted = shifted + 26;
                }

                sb.append((char) shifted);
            }
        }
        return sb.toString();
    }
}
