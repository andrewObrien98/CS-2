import java.util.Scanner;

public class BabyAndroid {
    public static void main(String[] args) {
        uiThread uiThread = new uiThread();
        uiThread.start();

        uiThread.addEventHandler(new CustomEventHandler() {
            @Override
            public void onEvent(String event) {
                if (event.equals("swipe")){
                    System.out.println("You swiped the phone");
                }
            }
        });
        uiThread.addEventHandler(new CustomEventHandler() {
            @Override
            public void onEvent(String event) {
                if (event.equals("shook")){
                    System.out.println("You shook the phone");
                }
            }
        });
        uiThread.addEventHandler(new CustomEventHandler() {
            @Override
            public void onEvent(String event) {
                if (event.equals("touch")){
                    System.out.println("You touched the phone");
                }
                if (event.equals("name")){
                    System.out.println("You named the phone");
                }
            }
        });
        String userEvent = "";
        System.out.println("Welcome to BabyAndroid! Please type in your event! ");
        while(!userEvent.equals("stop")){
            Scanner scanner = new Scanner(System.in);
            userEvent = scanner.nextLine();
            uiThread.addEvent(userEvent);
        }

        uiThread.stop();
    }
}
