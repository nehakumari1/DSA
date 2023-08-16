import java.io.*;
import java.util.*;
public class Duplicate {


        public static void main(String[] args) {
            String s="abaaabbbbeeeee";
            HashMap<Character,Integer> hmap= new HashMap<>();
            for (int i=0;i<s.length();i++)
            {
                if(hmap.containsKey(s.charAt(i)))
                {
                    hmap.put(s.charAt(i), hmap.get(s.charAt(i)) + 1);
                }
              else{
                    hmap.put(s.charAt(i),0);
                }
            }
                System.out.print(hmap);
            }
        }


