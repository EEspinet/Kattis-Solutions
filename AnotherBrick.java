/*
 * Created by:
 * Enrique F. Espinet
 * Copyright @2018
 */
package anotherbrick;

import java.util.*;

/**
 * Kattis
 * AnotherBrick
 * @author Enrique
 */
public class AnotherBrick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int height = in.nextInt();
        int width = in.nextInt();
        int numBricks = in.nextInt();
        
        int[] array1 = new int[numBricks];
        for(int i = 0; i < numBricks; i++)
        {
            int temp = in.nextInt();
//            System.out.println("Temp: " + temp);
            array1[i] = temp;
        }
        
        int widthTemp = width;
        int heightTemp = height;
        
        String output = "";
        
        outerLoop:
        for(int a = 0; a < numBricks; a++)
        {
            if(heightTemp > 0)
            {
                widthTemp -= array1[a];
                if(widthTemp < 0)
                {
                    output = "NO";
                    break outerLoop;
                }
                else
                {
                    output = "YES";
//                    System.out.println("Looped: " + a);
//                    System.out.println("WidthTemp: " + widthTemp);
                    if(widthTemp == 0)
                    {
                        widthTemp = 10;
                        heightTemp--;
                    }
                }
            }
            else
            {
                break outerLoop;
            }
        }
        System.out.println(output);
    }
    
}
