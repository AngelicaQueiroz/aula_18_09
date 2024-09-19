import java.util.concurrent.Semaphore;

public class ExemploSinais {
    public static void main(String[] args) {
        //Cria um semáforo com uma permissão
        Semaphore semaphore = new Semaphore(1);

        //Cria e inicia as threads
        Thread t1 = new Thread(new Tarefa(semaphore, "Thread 1"));
        Thread t2 = new Thread(new Tarefa(semaphore, "Thread 2"));

        t1.start();
        t2.start();
    }
}
