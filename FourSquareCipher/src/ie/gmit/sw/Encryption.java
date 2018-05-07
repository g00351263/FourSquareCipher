/*==============================================================
|Authour Name : Raja Naseer Ahmed Khan.                      |
|B.Sc Software 2nd Year Data Structure and Algorithm Project |
|G00351263                                                   |
==============================================================*/

package ie.gmit.sw;

public class Encryption {
	Key k=new Key(); // object from Key class
	public Encryption() {
		// empty constructor to call method
	};

	public String Encrypt(String text) {
		
		long startTime=System.nanoTime(); // counting timer starts
		
		StringBuilder sb=new StringBuilder();
		
	/////////////////////////////////////////////////////////////////////	
		int aRow = 0; // getting index row of first bigram alphabet
		int aCol = 0; // getting index columns of first bigram alphabet
		
		///////////////////////////////////////////////////////////////
		
		int bRow = 0; // getting index row of 2nd bigram alphabet
		int bCol = 0; // getting index columns of 2nd bigram alphabet
	//////////////////////////////////////////////////////////////////////
		
		Diagraph dig=new Diagraph(); // getting words divided in bigram
		
		String[] digraph= dig.digraph(text.toUpperCase()); // all words from file to uppercase
		
		
		// looping through diagraph text
		for(String diga : digraph) { 
										//Big O = O(n^2)
			
			//looping through matrix array
			for(int row=0;row<k.matrix1.length;row++) {
			
				for(int col=0;col<k.matrix1[row].length;col++) {
				
					/// limiting the search to indexes for plain text 1
					//, getting the index for first alpha
					if(row <=4 && col<=4) {
					if(k.matrix1[row][col]==diga.charAt(0)) {
						aRow=row;
						aCol=col;
						}
					}
					/// limiting the search to indexes for plain text 2
					// getting the index of 2nd alpha//
					if((row>4 && row <=9)&&(col>4&&col<=9)) {
					if(k.matrix1[row][col]==diga.charAt(1)) {
						bRow=row;
						bCol=col;
					}
					}
				}
			}
			

			// adding to string on string builder from key//
			sb.append(k.matrix1[aRow][bCol]).append(k.matrix1[bRow][aCol]);	// index of encrypted alphabet		
		}
		long endTime=System.nanoTime(); // finishing time counter for process
		
		System.out.println("Encryption Time (secs) : "+((endTime-startTime)/ 1000000000.0)); // gives how many seconds took
		
		return sb.toString();
	}

}

