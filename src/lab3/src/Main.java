import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        String text = new String();
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your text:");
        text = sc.nextLine();
        for(;;){
        System.out.println("What we need to do next?\nWrite 1 to write in USB;\nWrite 2 to write in HDD;\nWrite 3 to print\nWrite 0 to exit.");
        num = sc.nextInt();
        USB usb = new USB(text);
        HDD hdd = new HDD(text);
        Print print = new Print(text);
        switch(num){
            case 1: usb.writeUSB(); break;
            case 2: hdd.writeHDD(); break;
            case 3: print.printerPrint(); break;
            case 0: System.exit(0);
            default: System.out.println("Try again."); break;
            }
        }
    }
}
