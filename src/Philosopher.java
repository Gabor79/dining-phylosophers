public class Philosopher implements Runnable {

    private String name;
    private Fork left;
    private Fork right;
    public Philosopher(String name, Fork left, Fork right){
        this.name=name;
        this.left=left;
        this.right=right;
    }

    @Override
    public void run() {
        while(true){
            thinking(name);
            grab(name);
            eat(name);
            release(name);
        }
    }

    private void release(String name) {
        left.release();
        System.out.println(name + " has release the left");
        right.release();
        System.out.println(name + " has release the right");
    }

    private void eat(String name) {
        System.out.println(name + " is eating");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private void grab(String name) {
        left.grab();
        System.out.println(name + " has grabbed the left");
        right.grab();
        System.out.println(name + " has grabbed the right");
    }

    private void thinking(String name) {
        System.out.println(name + " is thinging");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
