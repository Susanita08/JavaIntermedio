package programa;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LeerArchivo {

	public LeerArchivo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Path file = Paths.get("C:\\eclipse","prueba.txt");
		try (BufferedReader reader = Files.newBufferedReader(file)) {
			String line = null;
		    while ((line = reader.readLine()) != null) {
		    	System.out.println(line);
		    }
		} catch (IOException x) {
			x.printStackTrace();
		}
	}

}
