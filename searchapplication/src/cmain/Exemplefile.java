package cmain;

import java.io.File;

public class Exemplefile {
	public static void listeFichier (File dir) {
		if (dir.isDirectory()==true) {
			String Fichier[]=dir.list();
			System.out.println(dir.getAbsolutePath()+":");
			for(int i=0;i!=Fichier.length;i++) {
				System.out.println("\t"+Fichier[i]);
			}
			
		}
		
	}



}
