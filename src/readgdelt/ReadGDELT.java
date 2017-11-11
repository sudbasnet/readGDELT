/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readgdelt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author sudbasnet
 */

public class ReadGDELT {

	public static void main(String[] args) {
		
            BufferedReader br = null;				
            FileWriter fw = null;
            BufferedWriter bw = null;
            PrintWriter out = null;

            try {

            String sCurrentLine;
            
                String directory= "/Applications/XAMPP/xamppfiles/htdocs/DownloadGDELT/extracts/";
                    File file1 = new File(directory);

                    if (file1.isDirectory()) {
                        File[] files = file1.listFiles(); // All files and subdirectories                                           
                        for (int i = 0; files != null && i < files.length; i++) {	
                        String name = files[i].getName();
                        int filenameLength = name.length();
                        if (".CSV".equals(name.substring(filenameLength-4).toUpperCase())){

                        br = new BufferedReader(new FileReader(files[i]));                 
                        char[] chr = name.toCharArray();

                        StringBuffer n = new StringBuffer();
                        for(int c = 0; c < chr.length; c++){
                            if(chr[c] != '.'){
                                    n.append(Character.toString(chr[c]));
                            }
                            else
                                    break;
                        }
                        fw = new FileWriter("/Applications/XAMPP/xamppfiles/htdocs/DownloadGDELT/totxt/" + n + ".txt", true);
                        bw = new BufferedWriter(fw);
                        out = new PrintWriter(bw);

                        System.out.println("/Applications/XAMPP/xamppfiles/htdocs/DownloadGDELT/totxt/" + n + ".txt");

                            while ((sCurrentLine = br.readLine()) != null) {
        //                          String LineAll = sCurrentLine.replaceAll("\"\t",",");                                                        
        //                          String LineAll2 = LineAll.replaceAll("\t\"",",");                                                   
        //                          String[] attr = LineAll2.substring(2).split("\t");
                                    String[] attr = sCurrentLine.replaceAll("\t\"",",").replaceAll("\"\t",",").replaceAll("\"",",").split("\t");
//                                    System.out.println(attr[26]);
                                    if(attr[51].equals("IN") || attr[51].equals("PK") || attr[51].equals("BG")){
								
								out.write(attr[0]  + "\t" + attr[1].substring(6, 8)  + "\t" + attr[1].substring(4, 6)  + "\t" + attr[3]  + "\t"+attr[26]  + "\t"+attr[34]  + "\t"+ attr[51]  + "\t"+ attr[49]  +"\t"+ attr[50]  +"\t" +attr[53] + "\t" + attr[54] + "\t"+ attr[57]  +"\n");
							}
                            }//end while
                            out.close();
                       }//end for 
                    }

                }

            } catch (IOException e) {
                    e.printStackTrace();
            } 
            finally {
                    try {
                            if (br != null)br.close();
                            if(bw != null) bw.close();
//                            out.close();

                    } catch (IOException ex) {
                            ex.printStackTrace();
                    }
            }

		}

}