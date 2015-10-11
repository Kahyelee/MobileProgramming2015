package kc.ac.kookmin.exception.intro;

import java.io.*;


public class Test {
	public static void main(String args[]) {
		Trade a = new Trade();
		a.readFile();	
	}	
}

class Trade {
	
	public void readFile(){
		String path = Trade.class.getResource("").getPath();
		System.out.println(path);
			try {
				BufferedReader inputStream = new BufferedReader(new FileReader("/C:/Eclipse/Lab6/bin/kc/ac/kookmin/exception/intro/a.txt"));
				String s;
				
				while((s=inputStream.readLine())!=null){
					System.out.println(s);
				}
				inputStream.close();
			} catch(Exception e) {
				System.err.println(e);
				System.exit(1);
			}
	}
}