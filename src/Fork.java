import java.util.concurrent.Semaphore;

public class Fork {

    private Semaphore semaphore = new Semaphore(1);

    public void grab(){
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void release(){
        semaphore.release();
    }
}
