public class Thread1 extends Thread {
    private String name;

    public Thread1(String name){
        this.name = name;
    }

    public void run() {
        for(;;){
            Log.toConsole(this.name);
        }
    }
}