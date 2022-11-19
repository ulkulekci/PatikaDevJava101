package LetterCapitalize;


import java.util.Scanner;

class Main {

    public static String LetterCapitalize(String str) {
        // str Stringinin içindeki kelimelerin ilk harfleri büyük diğerleri küçük yapılır.
        char c = Character . toUpperCase ( str . charAt ( 0 ));
        //ilk harfini buyuttuk
        str = c + str . substring ( 1 );
        //buyutulen ilk harften sonra kelimenin diger harflerini ekledik.
        String bosluk=" ";
        for (int i = 1 ; i<str.length();i++)
        {
            if (str.charAt(i)==' ')
            {
                c=Character.toUpperCase(str.charAt (i+1));
                str = str.substring(0,i)+bosluk +c  + str.substring(i+2);

            }

        }
        return str;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LetterCapitalize(s.nextLine()));
    }

}