import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String string=in.next();
        LinkedHashSet<Character> set=new LinkedHashSet<>();
        for(int i=0;i<string.length();i++)
        {
            Character str = string.charAt(i);
            set.add(str);
        }
        for(Character str:set){
            System.out.print(str);
        }
    }
}
    
