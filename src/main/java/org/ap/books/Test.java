package org.ap.books;

public class Test {
    public static void main(String[] args) {
        System.out.println(Test.reversString("A BC DEFM GH"));
    }

    public static char[] reversString(String input) {
        char str[] = input.toCharArray();

        int sIdx = 0;
        int eIdx = str.length - 1;

        while (sIdx < eIdx) {
            if ((str[sIdx] == ' ' && str[eIdx] == str[sIdx]) ||
                    (str[sIdx] != ' ' && str[eIdx] != ' ')
            ) {
                char t = str[sIdx];
                str[sIdx] = str[eIdx];
                str[eIdx] = t;
                sIdx++;
                eIdx--;

            }else if( str[sIdx] == ' ' && str[eIdx] != ' '){
                sIdx++;
            }else {
                eIdx--;
            }

        }


        return str;

    }


}
