

import javax.swing.JFileChooser;

import java.io.File;


public class Main {

	
		public static void main(String[] args){
		//	JFrame parentFrame = new JFrame();
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setDialogTitle("Speichern unter");   
			 
			int userSelection = fileChooser.showOpenDialog(fileChooser);
			 
			if (userSelection == JFileChooser.APPROVE_OPTION) {
			    File fileToSave = fileChooser.getSelectedFile();
			    System.out.println("Save as file: " + fileToSave.getAbsolutePath());
			    System.out.println(fileToSave.getName());
			    System.out.println("this is a new Branch with a new Feature");
			}
	    } 
	}


