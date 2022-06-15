package com.properties;

public class File_reader {
	
	//constructor_method
	private File_reader() {
		
		//private constructor created to avoid object creation on a different/another class unintentionally
		
	}
	
	
	//static_method
	public static File_reader Fr() {
		
		File_reader fr = new File_reader ();
		
		return fr;

	}
	
	
	//non_static method
	public Configuration_reader datareader() throws Throwable {
		
		Configuration_reader cr = new Configuration_reader();
		
		return cr;

	}

}
