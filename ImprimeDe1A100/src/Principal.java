public class Principal {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ContaDeUmACem());
        Thread thread2 = new Thread(new ContaDeUmACem());

        thread1.start();
        thread2.start();
    }
}
