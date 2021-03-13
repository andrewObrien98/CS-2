public class Strings {
    public static void main(String[] args) {
        //stuff you can do with Strings
        String name = " Andrew ";
        System.out.println(name.trim());
        //this gets rid of whitespace

        System.out.println(name.length());
        //returns length of string

        System.out.println(name.equals(" Andrew "));
        System.out.println(name.compareTo(" Andrew "));
        //just ways to compare strings

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        //ways to change if its upper or lower case

        System.out.println(name.replace("d", "Z"));
        //replaces the d in andrew with Z

        String[] letters = name.split("");
        //this just broke up all the characters and put them into a list

        //because Strings are immutable, if you ever need to create a string that is not immutable than use the
        //stringBuilder class

        StringBuilder sentence = new StringBuilder();
        sentence.append("hello how");
        sentence.append(" are you doing today");
        sentence.append("?");

        System.out.println(sentence);
        System.out.println(sentence.reverse());
        //how to reverse the string

        System.out.println(sentence.length());

        System.out.println(sentence.delete(0, 4));
        System.out.println(sentence.replace(6, 10, "bumm"));



    }
}
