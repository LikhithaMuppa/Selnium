
public class ReverseString1 {
public static void main(String[] args) {
	//intializing the the value
	String s = "Selenium";
	//to provide length of a string
	int len = s.length();
	//to store the value
	String rev = "";
	// len-1 = 8-1;i>=0 0 means "S" ;i-- it will decrease
	for(int i = len-1;i>=0;i--) {
	//  rev = rev(should ne blank)+charAt(i)(the value ur passing the 
		//index give me the characherter which is available on specific index
		rev =rev+s.charAt(i);	
	
		
	}
	//need to print outside the for loop dont print inside if print it will give all output explaination
	System.out.println(rev);
}
}
