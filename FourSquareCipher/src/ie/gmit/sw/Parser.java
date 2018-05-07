/*==============================================================
|Authour Name : Raja Naseer Ahmed Khan.                      |
|B.Sc Software 2nd Year Data Structure and Algorithm Project |
|G00351263                                                   |
==============================================================*/

package ie.gmit.sw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Parser {
	
	public String fileReader(String fileName) throws Exception {
		StringBuilder sb=new StringBuilder();
		BufferedReader bf=new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
		String line;
		while((line=bf.readLine()) != null) {
			line = line.toUpperCase().replaceAll("[^A-Z ]", "");
			sb.append(line);
		}
		bf.close();
		return sb.toString();
	}
	
	public void fileWriter(String fileName,String text) throws Exception{
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)));
		bw.write(text);
		bw.close();
		
	}
}

