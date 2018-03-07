package com.practice.tests;

/**
 * @author Praful Jha
 *
 */
/* Save this in a file called Main.java to compile and test it */

/* Do not add a package declaration */
import java.util.*;
import java.io.*;

/* You may add any imports here, if you wish, but only from the 
   standard library */

public class Main {
    public static int processData(ArrayList<String> array) {
        /* 
         * Modify this method to process `array` as indicated
         * in the question. At the end, return the appropriate value.
         *
         * Please create appropriate classes, and use appropriate
         * data structures as necessary.
         *
         * Do not print anything in this method.
         *
         * Submit this entire program (not just this method)
         * as your answer
         */
    	int count = 0;
    	String[][] str = new String[array.size()][4];
    	int i = 0;
    	for(String str1: array) {
    		str[i++] = str1.split("\\, ");
    		
    	}
    	Map<String,String> map = new HashMap<String,String>();
    	for(int k=0; k<str.length; k++) {
    		if(map.get(str[k][2]) == null) 
    			map.put(str[k][2], str[k][3]);
    		else
    		{
    			String[] a = map.get(str[k][2]).split("\\.");
				String[] b = str[k][3].split("\\.");
				if(Integer.parseInt(a[0]) < Integer.parseInt(b[0]) || Integer.parseInt(a[1]) <Integer.parseInt(b[1])) {
					count++;
					map.put(str[k][2],str[k][3]);
				}
				else if(Integer.parseInt(a[0]) > Integer.parseInt(b[0]) || Integer.parseInt(a[1]) >Integer.parseInt(b[1])) {
					count++;
				}
    		}
    	}
    
        return count;
    }

    public static void main (String[] args) {
        ArrayList<String> inputData = new ArrayList<String>();
        try {
            Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));
            while(in.hasNextLine()) {
                String line = in.nextLine().trim();
                if (!line.isEmpty()) // Ignore blank lines
                    inputData.add(line);
            }
            int retVal = processData(inputData);
            System.out.println(retVal);
            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
            output.println("" + retVal);
            output.close();
        } catch (IOException e) {
            System.out.println("IO error in input.txt or output.txt");
        }
    }
}
