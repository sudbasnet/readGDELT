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
                                    String[] attr = sCurrentLine.replaceAll("\t\"",",").replaceAll("\"\t",",").replaceAll("\"","").split("\t");
//                                    System.out.println(attr[26]);
                                    if((attr[51].equals("IN") || attr[51].equals("BG") || attr[51].equals("PK")) && 
//                                     attr 51 is the country code
                                        (
                                        attr[26].equals(	"020")||
                                        attr[26].equals(	"021"	)||
                                        attr[26].equals(	"0211"	)||
                                        attr[26].equals(	"0212"	)||
                                        attr[26].equals(	"0213"	)||
                                        attr[26].equals(	"0214"	)||
                                        attr[26].equals(	"022"	)||
                                        attr[26].equals(	"023"	)||
                                        attr[26].equals(	"0231"	)||
                                        attr[26].equals(	"0232"	)||
                                        attr[26].equals(	"0233"	)||
                                        attr[26].equals(	"0234"	)||
                                        attr[26].equals(	"024"	)||
                                        attr[26].equals(	"0241"	)||
                                        attr[26].equals(	"0242"	)||
                                        attr[26].equals(	"0243"	)||
                                        attr[26].equals(	"0244"	)||
                                        attr[26].equals(	"025"	)||
                                        attr[26].equals(	"0251"	)||
                                        attr[26].equals(	"0252"	)||
                                        attr[26].equals(	"0253"	)||
                                        attr[26].equals(	"0254"	)||
                                        attr[26].equals(	"0255"	)||
                                        attr[26].equals(	"0256"	)||
                                        attr[26].equals(	"026"	)||
                                        attr[26].equals(	"027"	)||
                                        attr[26].equals(	"028"	)||
                                        attr[26].equals(	"100"	)||
                                        attr[26].equals(	"101"	)||
                                        attr[26].equals(	"1011"	)||
                                        attr[26].equals(	"1012"	)||
                                        attr[26].equals(	"1013"	)||
                                        attr[26].equals(	"1014"	)||
                                        attr[26].equals(	"102"	)||
                                        attr[26].equals(	"103"	)||
                                        attr[26].equals(	"1031"	)||
                                        attr[26].equals(	"1032"	)||
                                        attr[26].equals(	"1033"	)||
                                        attr[26].equals(	"1034"	)||
                                        attr[26].equals(	"104"	)||
                                        attr[26].equals(	"1041"	)||
                                        attr[26].equals(	"1042"	)||
                                        attr[26].equals(	"1043"	)||
                                        attr[26].equals(	"1044"	)||
                                        attr[26].equals(	"105"	)||
                                        attr[26].equals(	"1051"	)||
                                        attr[26].equals(	"1052"	)||
                                        attr[26].equals(	"1053"	)||
                                        attr[26].equals(	"1054"	)||
                                        attr[26].equals(	"1055"	)||
                                        attr[26].equals(	"1056"	)||
                                        attr[26].equals(	"106"	)||
                                        attr[26].equals(	"107"	)||
                                        attr[26].equals(	"108"	)||
                                        attr[26].equals(	"130"	)||
                                        attr[26].equals(	"131"	)||
                                        attr[26].equals(	"1311"	)||
                                        attr[26].equals(	"1312"	)||
                                        attr[26].equals(	"1313"	)||
                                        attr[26].equals(	"132"	)||
                                        attr[26].equals(	"1321"	)||
                                        attr[26].equals(	"1322"	)||
                                        attr[26].equals(	"1323"	)||
                                        attr[26].equals(	"1324"	)||
                                        attr[26].equals(	"133"	)||
                                        attr[26].equals(	"134"	)||
                                        attr[26].equals(	"135"	)||
                                        attr[26].equals(	"136"	)||
                                        attr[26].equals(	"137"	)||
                                        attr[26].equals(	"138"	)||
                                        attr[26].equals(	"1381"	)||
                                        attr[26].equals(	"1382"	)||
                                        attr[26].equals(	"1383"	)||
                                        attr[26].equals(	"1384"	)||
                                        attr[26].equals(	"1385"	)||
                                        attr[26].equals(	"139"	)||
                                        attr[26].equals(	"140"	)||
                                        attr[26].equals(	"141"	)||
                                        attr[26].equals(	"1411"	)||
                                        attr[26].equals(	"1412"	)||
                                        attr[26].equals(	"1413"	)||
                                        attr[26].equals(	"1414"	)||
                                        attr[26].equals(	"142"	)||
                                        attr[26].equals(	"1421"	)||
                                        attr[26].equals(	"1422"	)||
                                        attr[26].equals(	"1423"	)||
                                        attr[26].equals(	"1424"	)||
                                        attr[26].equals(	"143"	)||
                                        attr[26].equals(	"1431"	)||
                                        attr[26].equals(	"1432"	)||
                                        attr[26].equals(	"1433"	)||
                                        attr[26].equals(	"1434"	)||
                                        attr[26].equals(	"144"	)||
                                        attr[26].equals(	"1441"	)||
                                        attr[26].equals(	"1442"	)||
                                        attr[26].equals(	"1443"	)||
                                        attr[26].equals(	"1444"	)||
                                        attr[26].equals(	"145"	)||
                                        attr[26].equals(	"1451"	)||
                                        attr[26].equals(	"1452"	)||
                                        attr[26].equals(	"1453"	)||
                                        attr[26].equals(	"1454"	)||
                                        attr[26].equals(	"170"	)||
                                        attr[26].equals(	"171"	)||
                                        attr[26].equals(	"1711"	)||
                                        attr[26].equals(	"1712"	)||
                                        attr[26].equals(	"172"	)||
                                        attr[26].equals(	"1721"	)||
                                        attr[26].equals(	"1722"	)||
                                        attr[26].equals(	"1723"	)||
                                        attr[26].equals(	"1724"	)||
                                        attr[26].equals(	"173"	)||
                                        attr[26].equals(	"174"	)||
                                        attr[26].equals(	"175"	)||
                                        attr[26].equals(	"176"	)||
                                        attr[26].equals(	"180"	)||
                                        attr[26].equals(	"181"	)||
                                        attr[26].equals(	"182"	)||
                                        attr[26].equals(	"1821"	)||
                                        attr[26].equals(	"1822"	)||
                                        attr[26].equals(	"1823"	)||
                                        attr[26].equals(	"183"	)||
                                        attr[26].equals(	"1831"	)||
                                        attr[26].equals(	"1832"	)||
                                        attr[26].equals(	"1833"	)||
                                        attr[26].equals(	"1834"	)||
                                        attr[26].equals(	"184"	)||
                                        attr[26].equals(	"185"	)||
                                        attr[26].equals(	"186"	)||
                                        attr[26].equals(	"190"	)||
                                        attr[26].equals(	"191"	)||
                                        attr[26].equals(	"192"	)||
                                        attr[26].equals(	"193"	)||
                                        attr[26].equals(	"194"	)||
                                        attr[26].equals(	"195"	)||
                                        attr[26].equals(	"1951"	)||
                                        attr[26].equals(	"1952"	)||
                                        attr[26].equals(	"196"	)||
                                        attr[26].equals(	"200"	)||
                                        attr[26].equals(	"201"	)||
                                        attr[26].equals(	"202"	)||
                                        attr[26].equals(	"203"	)||
                                        attr[26].equals(	"204"	)||
                                        attr[26].equals(	"2041"	)||
                                        attr[26].equals(	"2042"	)))
                                    {
                                        try{
//                                            out.write(sCurrentLine + "\n");
                                            out.write(attr[0]  + "\t" + attr[1].substring(6, 8)  + "\t" + attr[1].substring(4, 6)  + "\t" + attr[3]  + "\t"+attr[26]  + "\t"+attr[34]  + "\t"+ attr[51]  + "\t"+ attr[49]  +"\t"+ attr[50]  +"\t" +attr[53] + "\t" + attr[54] + "\t"+ attr[57]  +"\n");
                                        } catch(StringIndexOutOfBoundsException outofbound) {
                                            System.out.println(sCurrentLine + "\n");
                                        }
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

