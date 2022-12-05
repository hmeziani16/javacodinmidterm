package problems.string;

import java.util.ArrayList;

public class Permutation {

    public static void main(String[] args) {


            String str = "bob";
            int n = str.length();


            permute(str, 0, n-1);

        }
        public static void permute(String str, int l, int r){
            ArrayList<String> list=new ArrayList<String>();
            if (l == r)

                list.add(str);
            else
            {
                for (int i = l; i <= r; i++)
                {
                    str = swap(str,l,i);
                    permute(str, l+1, r);
                    str = swap(str,l,i);
                }
            }
            for (int i=0;i<list.size() ;i++ ) {
                System.out.println(list.get(i));
            }

        }
        public static String swap(String a, int i, int j){
            char temp;
            char[] charArray = a.toCharArray();
            temp = charArray[i] ;
            charArray[i] = charArray[j];
            charArray[j] = temp;
            return String.valueOf(charArray);
        }


    }

