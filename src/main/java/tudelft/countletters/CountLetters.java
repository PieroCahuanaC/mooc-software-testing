package tudelft.countletters;

public class CountLetters {

    public int count(String str) {
        int words = 0;
        char last = ' ';

        for (int i = 0; i < str.length(); i++) {
            // Cuando se encuentra un delimitador y el último carácter es 'r' o 's'
            if (!Character.isLetter(str.charAt(i)) && (last == 'r' || last == 's')) {
                words++;
            }

            last = str.charAt(i); // Actualizar el último carácter
        }

        // Verificar si termina en r o s
        if (last == 'r' || last == 's') {
            words++;
        }

        return words;
    }

}
