public class IntroLinkedLists {
    public static void main(String[] args) {

        LinkedList<String> cities = new LinkedList<>();

        cities.insert("logan");
        cities.insert("hyrum");
        cities.insert("newton");
        cities.insert("nibley");
        cities.insert("amalga");


//        String search = "logan";
//        if (cities.find(search)){
//            System.out.printf("we found %s\n", search);
//        }else{
//            System.out.printf("we did not find %s\n", search);
//        }

        Instance value1 = new Instance();
        Instance value2 = value1;
        value2.changeValue(7);
        System.out.println(value1.getValue());
        System.out.println(value2.getValue());

    }
}

class Instance{
    int value;
    Instance(){
        this.value = 4;
    }

    void changeValue(int number){
        this.value = number;
    }

    int getValue(){
        return this.value;
    }
}
