package kr.ac.kookmin.exception.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 Makes numbered.txt the same as original.txt, but with each line numbered.
*/
public class AddLineNumber {
   public static void main(String[] args) throws IOException {
       String path = AddLineNumber.class.getResource("").getPath();
       System.out.println(path);
      
      try{
         BufferedReader inputStream = 
               new BufferedReader(new FileReader(path+"original.txt")); //���� ������ ���� �б�
         PrintWriter outputStream = 
               new PrintWriter(new FileOutputStream(path+"numbered.txt")); //���� �߰��ϱ�

         int i=1;
         while(true) {
        	 String line = inputStream.readLine();
        	 if(line==null)
        		 break;
        	 System.out.println( i+ " " +line);
             outputStream.println( i + " " +line);
             i++;
         }
         inputStream.close();
         outputStream.close( );
         
      } catch(Exception e) {
    	  e.printStackTrace();  
      }
 
   }
}