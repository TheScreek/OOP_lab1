public class Main {

    public static void main(String[] args) {
        Thread1 t1 = new Thread1("First");
        Thread2 t2 = new Thread2("Second");

        t1.start();
        t2.start();
    }
}