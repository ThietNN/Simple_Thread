public class NumberGenerator implements Runnable {
    private Thread thread;
    public NumberGenerator(){
        thread = new Thread(this,"Number Generator Thread");
        System.out.println("Number generator thread created " + thread);
        thread.start();
    }

    public Thread getThread(){
        return thread;
    }

    @Override
    public void run(){
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + ", " + this.hashCode());
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread is ended");
    }

}
