public class Thread2 extends Thread {
    private String name;

    public Thread2(String name){
        this.name = name;
    }

    public void run() {
        for(;;){
            Log.toConsole(this.name);
        }
    }
}