import java.io.IOException;

public class lab1 {
	public static void main(String[] args) throws IOException {
		String str1="";
		char strIn;
		int i;
		System.out.println("Enter the text. Use \"Space\" as word separator, \".\" as sentence separator, \"!\" in the end of the text.");
		do {
			strIn = (char) System.in.read();
			str1 += strIn;
		} while(strIn != '!');
		char[] strMain = str1.toCharArray();
		int strlen = str1.length();
		
		int WordStart = 0, WordEnd = 0, shift=0;
		char swap;
		for(i=0;i<strlen-1;i++) {
			if((strMain[i+1] < 'A') || ((strMain[i+1] > 'Z') && (strMain[i+1] < 'a')) || (strMain[i+1] > 'z')) {
				WordEnd=i;
				shift=0;
				for(int j=WordStart;j<WordEnd;j++) {
					for(int m=WordStart;m<WordEnd-shift;m++) {
						swap=strMain[m];
						strMain[m]=strMain[m+1];
						strMain[m+1]=swap;
					}
					shift+=1;
				}
				if(strMain[i+1]==33) {
					i=strlen-2;
				}
				if(strMain[i+1]==32) {
					WordStart = i+2;
					i+=1;
				}
				if(strMain[i+1]==46) {
					WordStart = i+3;
					i+=2;
				}
			}
		}
		
		System.out.print("\nResult: ");
		for(i=0;i<strlen;i++) {
			System.out.print(strMain[i]);
		}
	}
}