import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class NextLine {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        String line;
        int count = 1;
        while(input.hasNextLine()){
            line = input.nextLine();
            System.out.println(count + " " + line);
            count++;
        }

        input.close();
    }
}
