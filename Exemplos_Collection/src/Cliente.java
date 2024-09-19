public class Exemplo6Estados {
    public static void main(String[] args) {
        Thread thread = new Thread(new MinhaThread());
        System.out.println("Estado da thread: " + thread.getState());
        thread.start();
        System.out.println("Estado da thread: " + thread.getState());
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Estado da thread: " + thread.getState());
    }

}