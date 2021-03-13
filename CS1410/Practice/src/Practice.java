import java.util.ArrayList;
public class Practice {
    public static void main(String[] args) {
        String word = "andrew";
        String word2 = "mccall";
        String[] letters = word.split("");
        for (int i = 0; i < letters.length; i++) {
            if (word2.contains(letters[i]) != true) {
                System.out.println(letters[i]);
            }
        }
    }
}
