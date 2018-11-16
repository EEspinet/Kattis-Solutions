/*
 * Created by:
 * Enrique F. Espinet
 * Copyright @2018
 */
package abc;

import java.util.*;

/**
 * Kattis ABC
 * https://open.kattis.com/problems/abc
 * @author Enrique
 */
public class ABC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int first = in.nextInt();
        int second = in.nextInt();
        int third = in.nextInt();
        
        String word = in.next();
        
        int min = 0;
        int middle = 0;
        int max = 0;
        
        List<Integer> list = Arrays.asList(first,second,third);
        list.sort(Comparator.naturalOrder());
        min = list.get(0);
        middle = list.get(1);
        max = list.get(2);
        
        String output = "";
        if(word.charAt(0) == 'A')
        {
            output = output + min + " ";
        }
        if(word.charAt(0) == 'B')
        {
            output = output + middle + " ";
        }
        if(word.charAt(0) == 'C')
        {
            output = output + max + " ";
        }
        if(word.charAt(1) == 'A')
        {
            output = output + min + " ";
        }
        if(word.charAt(1) == 'B')
        {
            output = output + middle + " ";
        }
        if(word.charAt(1) == 'C')
        {
            output = output + max + " ";
        }
        if(word.charAt(2) == 'A')
        {
            output = output + min + " ";
        }
        if(word.charAt(2) == 'B')
        {
            output = output + middle + " ";
        }
        if(word.charAt(2) == 'C')
        {
            output = output + max + " ";
        }
        
        System.out.println(output);
        
    }
    
}
