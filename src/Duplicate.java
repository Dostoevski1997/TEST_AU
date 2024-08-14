import java.util.HashSet;
import java.util.Set;
public class Duplicate {

    public static void main(String[] args) {

        String word = "Hello";
        char duplicate = duplicate(word);

        if (duplicate != '\0') {
            System.out.println("Повторяющийся символ: " + duplicate);
        } else {
            System.out.println("Повторяющихся символов нет.");
        }
    }
    public static char duplicate(String word) {
        Set<Character> seenCharacters = new HashSet<>();
        for (char ch : word.toCharArray()) {
            if (seenCharacters.contains(ch)) {
                return ch;
            } else {
                seenCharacters.add(ch); //
            }
        }

        return '\0'; //
    }
}