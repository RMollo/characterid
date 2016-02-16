//this .java is accidentally named showfont; 

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;




public class showfont {
	
// trying to read .csv of character ids, but I really have no idea..
	public static void main ( String [] args) {
	
		showfont obj = new showfont();
		obj.run();
		
	}
	
	public void run() {
		
		String csvFile = "/Users/rmollo/Desktop/entityfacts.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		
		try {
			
			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {


				String[] answer = line.split(cvsSplitBy);
				if (answer.length < 6) { System.out.println(line ); continue; }
				System.out.println( answer[1]
						+answer[2] );
						
	}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br !=null ) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("Done");
	}
}
		
	

