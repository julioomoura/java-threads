public class ContaDeUmACem implements Runnable {

    @Override
    public void run() {
        for (int i =0; i < 100; i++) {
            long threadID = Thread.currentThread().getId();
            System.out.println(threadID);
        }
    }
}
