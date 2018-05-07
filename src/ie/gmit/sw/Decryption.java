/*==============================================================
|Authour Name : Raja Naseer Ahmed Khan.                      |

|B.Sc Software 2nd Year Data Structure and Algorithm Project |
|G00351263                                                   |
==============================================================*/

package ie.gmit.sw;

public class Decryption {
	Key k=new Key(); // getting array from Key class
	public Decryption() { // blank constructor to call methods
	};

	public  String decryption(String text) {
		long startTime=System.nanoTime();// getting start time
		StringBuilder sb=new StringBuilder(); // to build string text for file
		int aRow = 0; // row of first plain word
		int aCol = 0; // col of first plain word
		int bRow = 0; // row of second plain word
		int bCol = 0; // col of second plain word

		Diagraph dig=new Diagraph(); // object created for accessing diagraph methods
		
		String[] digraph= dig.digraph(text.toUpperCase()); // changing all characters to uppercase
		
		for(String str:digraph) { //looping through diagraph length
		
			for(int row=0;row<k.matrix1.length;row++) { // looping through array of alphabets
			
				for(int col=0;col<k.matrix1[row].length;col++) {
				
					if(row<=4 && (col>4 && col <=9)) { // limiting the index for 1st plain text
						if(k.matrix1[row][col]==str.charAt(0)) { // getting first alphabet
							aRow=row; // storing the location of first alphabet
							aCol=col;
						}
					}
					if((row >4 && row<=9)&&col<=4) { // limiting the index of 2nd plain text
						if(k.matrix1[row][col]==str.charAt(1)) { // getting 2nd alphabet
							bRow=row; // storing location of 2nd alphabet
							bCol=col;
						}
					}
				}
			}
			sb.append(k.matrix1[aRow][bCol]).append(k.matrix1[bRow][aCol]); //getting the index of decryption 
		}
		long endTime=System.nanoTime(); // checking time again
		
		System.out.println("Decryption Time (secs) : "+((endTime-startTime)/ 1000000000.0)); // giving time it took from start to finish
		return sb.toString();
	}
}
