/*==============================================================
|Authour Name : Raja Naseer Ahmed Khan.                      |
|B.Sc Software 2nd Year Data Structure and Algorithm Project |
|G00351263                                                   |
==============================================================*/

package ie.gmit.sw;

import java.util.Scanner;

public class Menu {
	public Menu() {
	};

	public static void menu() throws Exception {
		int options;
		Scanner console = new Scanner(System.in);
		
		Parser p=new Parser();
		

		
		System.out.println("==============================================================");
		System.out.println("|Authour Name : Raja Naseer Ahmed Khan.                      |");
		System.out.println("|B.Sc Software 2nd Year Data Structure and Algorithm Project |");
		System.out.println("|G00351263                                                   |");
		System.out.println("==============================================================");

		System.out.println("\nSelect From Menu :");
		System.out.println("1 : For Encryption Through File \\ war.txt is default file\\");
		System.out.println("2 : For Decryption Through File ");
		System.out.println("4 : For Exit ...................");
		
		options = console.nextInt();
		
		while (options != 4) {
			if (options == 1) {

				System.out.println("\n-------------------------------------------");
				System.out.println("    Encrypted Text in File ");
				System.out.println("--------------------------------------------");
				
				p.fileWriter(new fileChoser().fileSaver(), new Encryption().Encrypt(p.fileReader(new fileChoser().fileChose())));

			} else if (options == 2) {
					
				System.out.println("\n-------------------------------------------");
				System.out.println("    Decrypted Text in File decryption.txt");
				System.out.println("--------------------------------------------");
			
				p.fileWriter(new fileChoser().fileSaver(), new Decryption().decryption(p.fileReader(new fileChoser().fileChose())));

			}
	

			System.out.println("\nSelect From Menu :");
			System.out.println("1 : For Encryption Through File ");
			System.out.println("2 : For Decryption Through File ");
			System.out.println("4 : For Exit ...................");
			options = console.nextInt();
	
		}
		System.out.println("Exiting .........See Ya.................");
	}
}
