package recursion;

import java.util.*;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        Deque<Character> stack = new LinkedList<>();

        stack.isEmpty();
        StringBuffer sb = new StringBuffer();
        while (n-- > 0){
            String s = sc.next();
            sb.append(s);
            n--;
        }
        System.out.println(reverseWords(String.valueOf(sb)));
    }
    public static String reverseWords(String s) {
        int len = s.length();
        char[] c = s.toCharArray();
        System.out.println(c);
        reverse(c);
        System.out.println(c);
        int l = 0,j = 0;
        for(int r = l + 1; r < len;r++){
            if(c[r] == ' '){
                j = r + 1;
                while(l < r){
                    r--;
                    char temp = c[l];
                    c[l] = c[r];
                    c[r] = temp;
                    l++;
                }
                l = j;
            }
        }
        return String.valueOf(c);
    }
    public static void reverse(char[] ch){
        int j = ch.length - 1,i = 0;
        while(i < j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
    }
}
