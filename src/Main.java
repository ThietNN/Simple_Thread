public class Main {

    public static void main(String args[]) {
        NumberGenerator ng1 = new NumberGenerator();
        try {
            while (ng1.getThread().isAlive()) {
                System.out.println("Main thread will be alive till the child thread is live");
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread run is over");


        NumberGenerator ng2 = new NumberGenerator();
        try {
            while (ng2.getThread().isAlive()) {
                System.out.println("Main thread will be alive till the child thread is live");
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread run is over");
    }
}
