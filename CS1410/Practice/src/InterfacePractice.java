public class InterfacePractice {
    public static void main(String[] args) {
        Person baby = new Baby();
        Person adult = new Adult();
        whatIDo(baby);
        whatIDo(adult);
    }
    public static void whatIDo(Person person){
        person.whatIAm();
        System.out.println(person.soundIMake());
        System.out.println(person.howIWalk());
        System.out.println();
    }
}
//you will see I added public, this is because of access privileges
interface Walk {
    abstract String howIWalk();

    //default method is how you can implement a method in an interface
    default void Shoes(){
        System.out.println("we all use some part of our body to walk");
    }
}

abstract class Person implements Walk {
    String whatIam;
    Person(){
        whatIam = "Person";
    }
    abstract String soundIMake();
    void whatIAm(){
        System.out.println(this.whatIam);
    }
}

class Baby extends Person{
    String sound;
    String walk;
    Baby(){
        this.walk = "on all fours";
        this.sound = "bah bah bah";
    }
    String soundIMake(){
        return this.sound;
    }
    public String howIWalk(){
        return this.walk;
    }
}

class Adult extends Person{
    String sound;
    String walk;
    Adult(){
        this.walk = "on my two feet";
        this.sound = "I talk like a regular person";
    }
    String soundIMake(){
        return this.sound;
    }
    public String howIWalk(){
        return this.walk;
    }
}
