/*==============================================================
|Authour Name : Raja Naseer Ahmed Khan.                      |

|B.Sc Software 2nd Year Data Structure and Algorithm Project |
|G00351263                                                   |
==============================================================*/
// taken from google search

package ie.gmit.sw;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

public class fileChoser {
public fileChoser() {};

public static String fileChose () {
	String fileReturn = null;
// calling the file chooser object
		JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		
//writes on diaglog box
		jfc.setDialogTitle("Choose your file to open: ");
// limiting the files extension
		jfc.setAcceptAllFileFilterUsed(false);
		FileNameExtensionFilter filter = new FileNameExtensionFilter("txt and dat files", "txt", "dat");
		jfc.addChoosableFileFilter(filter);
///////////////////////////////////////////////////////////		
		int returnValue = jfc.showOpenDialog(null);


		if (returnValue == JFileChooser.APPROVE_OPTION) {

			File selectedFile = jfc.getSelectedFile();
			
			 fileReturn = selectedFile.getAbsolutePath().toString();
		}
	
		return fileReturn;
	}
///////////////////////File Saver///////////////////////////////////
public static String fileSaver() {
	String fileReturn = null;

	JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
	
	jfc.setDialogTitle("Choose your file location to save: ");
	jfc.setAcceptAllFileFilterUsed(false);
	FileNameExtensionFilter filter = new FileNameExtensionFilter("txt and dat files", "txt", "dat");
	jfc.addChoosableFileFilter(filter);
	
	int returnValue = jfc.showOpenDialog(null);


	if (returnValue == JFileChooser.APPROVE_OPTION) {

		File selectedFile = jfc.getSelectedFile();
		
		 fileReturn = selectedFile.getAbsolutePath().toString();
	}

	return fileReturn;
}

}