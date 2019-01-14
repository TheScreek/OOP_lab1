import java.sql.Timestamp;

public class Log {
    static public void toConsole(String msg){
        System.out.format("[%s] - %s \n", new Timestamp(System.currentTimeMillis()), msg);
    }
}