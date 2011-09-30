// -------- Begin: TestAdvt.java ------------

import java.io.*;
import java.util.*;
class TestAdvt
{
    public static void main (String[] args)
    {
    
    try 
    {
        System.out.println ("Please enter the advertisement message to be displayed (enter 'n' to exit)");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        input = br.readLine(); // Read input from command	
    
    while(true)
    {

        
            if (!input.equalsIgnoreCase("n")) 
            {
            Thread advt = new Advertisement(input);
            advt.start();
            System.in.read();
            advt.interrupt();
            System.out.println ("Please enter the advertisement message to be displayed (enter 'n' to exit)");
            System.in.read(); // not sure why this 2nd read() is required to get code working
            input = br.readLine(); // Read input from command	
            }
            else
            {
            System.out.println("\n End of Ads ... Bye Bye");
            br.close();
            System.exit(0);
            }
    
    } //end While
    } // end try   
    catch(IOException e)
    {System.out.println ("error: " + e); }


    } // end Main
}
// --------End: TestAdvt.java ------------
