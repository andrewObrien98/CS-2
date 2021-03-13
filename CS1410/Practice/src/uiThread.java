import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class uiThread implements Runnable {
    public final Queue<String> eventQueue = new LinkedList<>();
    private ArrayList<CustomEventHandler> eventHandlers = new ArrayList<>();
    public boolean running = false;
    @Override
    public void run() {
        while(running) {
            while(true) {
                String event = eventQueue.poll();
                if (event == null){
                    break;
                }
                for (CustomEventHandler eventHandler: eventHandlers) {
                    eventHandler.onEvent(event);
                }
            }
            synchronized (eventQueue) {
                try {
                    eventQueue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void addEvent(String event){
        synchronized (eventQueue) {
            eventQueue.add(event);
            eventQueue.notify();
        }
    }

    public void start(){
        running = true;
        new Thread(this).start();
    }

    public void stop(){
        running = false;
    }
    public void addEventHandler(CustomEventHandler eventHandler) {
        synchronized (eventHandlers){
            eventHandlers.add(eventHandler);
        }
    }
}
