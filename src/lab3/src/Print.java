public class Print extends Super {
    private String str = new String();
    public Print(String str){
        super(str);
        this.str = str;
    }
    public void printerPrint(){
        System.out.println("Your text '" + getText() + "' is printed.");
    }
}

