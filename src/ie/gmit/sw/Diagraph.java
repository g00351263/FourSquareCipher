/*==============================================================
|Authour Name : Raja Naseer Ahmed Khan.                      |
|B.Sc Software 2nd Year Data Structure and Algorithm Project |
|G00351263                                                   |
==============================================================*/
package ie.gmit.sw;


public class Diagraph {
	Diagraph(){}; // empty constructor for calling method
	
	public  String[] digraph(String text) {
		// text is file read into 1 text variable
		
		
		if(text.length()%2 != 0) {
			text=text+"X"; // if pairing of last word is not possible then adds X to pair
		}
		
		int x=0;
		
		String[] dig=new String[text.length()/2]; // array for half the length of file as 
												  // need pair all alpha in file
		
		for(int i=0;i<(text.length()/2);i++) {
			
			dig[i]=text.substring(x, x+2); // adding alpha with another alpha
			
			x=x+2; // incrementing twice to get all alpha reaching 2nd index
			
		}
		return dig;
	}
}

