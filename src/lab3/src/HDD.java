public class HDD extends Super {
    private String str = new String();
    public HDD(String str){
        super(str);
        this.str = str;
    }
    public void writeHDD(){
        System.out.println("Your text '" + str + "' is located in HDD.");
    }
}
