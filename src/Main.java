public class Main {

    public static void main(String[] args) {
        int philosopher = 5;
        Philosopher[] philosophers = new Philosopher[5];
        Fork[] forks = new Fork[5];

        for (int i = 0; i<philosopher;i++){
            forks[i] = new Fork();
        }


        for (int i = 0; i<philosophers.length;i++){
             Fork leftFork = forks[i];
             Fork rightFork = forks[(i+1)%forks.length];

            if(i==philosophers.length-1) {
                philosophers[i] = new Philosopher(i + "", leftFork,rightFork);
            }else{
                philosophers[i] = new Philosopher(i + "", rightFork, leftFork);
            }

            Thread t = new Thread(philosophers[i]);
            t.start();

        }


    }
}
