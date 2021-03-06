import java.io.FileNotFoundException;
import java.io.IOException;
import com.csvreader.CsvReader;

public class ReadFileWriteToConsole {
	
	private static final int MAXROW = 3;
	private static final int MAXCOL = 3;
    private static final String inFile = "in.csv";
	   
    public String[][] sheet = new String[MAXROW][MAXCOL];
	   
    public static void main(String args[]) throws IOException {
    	ReadFileWriteToConsole rw = new ReadFileWriteToConsole();
    	rw.readSheet();
    	rw.writeSheet();
    	// create a ReadWriteToConsole object
    	//  Do not change the signature of this method.
    	// ... insert code here ...
    	// invoke readSheet()
    	// ... insert code here ...
    	// invoke writeSheet()
    	// ... insert code here ...
    }	
	   
    public void readSheet() throws IOException {
    	CsvReader cr = new CsvReader(inFile);
    	int i = 0;
    	while(cr.readRecord()) {
    		sheet[i]=cr.getRawRecord().split(",");
    		i++;
    	}
    	// ... insert code here ...
    	//  Do not change the signature of this method.
	}
	   
	public void writeSheet(){
		int i=0;
		while(i<MAXROW) {
			for (String string : sheet[i]) {
				System.out.print("["+string+"]");
			}
			i++;
			System.out.println();
		}
		// ... insert code here ...
    	//  Do not change the signature of this method.
	}
}
