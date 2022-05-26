package homework;

public class Main {

    public static void main(String[] args) {
        Worker.OnTaskDoneListener listener = System.out::println;
        Worker.OnTaskErrorListener listener2 = System.out::println;
        Worker worker = new Worker(listener, listener2);
        worker.start();
    }
}
