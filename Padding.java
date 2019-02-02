import java.util.Scanner;

public class Padding {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                System.out.print(s1);
                if(s1.length()<15){
                    for(int j = s1.length();j<15;j++){
                        System.out.print(" ");
                    }
                }
                
                String numberAsString = String.valueOf(x);
                String paddedNumberAsString = "000".substring(numberAsString.length()) + numberAsString;
                System.out.println(paddedNumberAsString);
            }
            sc.close();
            System.out.println("================================"); 

    }
}
