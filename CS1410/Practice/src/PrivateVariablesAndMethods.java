public class PrivateVariablesAndMethods {
    public static void main(String[] args) {
        hello word = new hello("boggarty");
        System.out.println(word.returnWord());
    }
}

//the class above cannot access private variables or methods

class hello{
    private String word;

    hello(String word){
        this.word = word;
        addOn();
    }

    private void addOn(){
        this.word = this.word + " is a horrible word";
    }

    String returnWord(){
        return this.word;
    }
}
