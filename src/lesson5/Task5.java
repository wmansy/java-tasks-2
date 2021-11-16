package lesson5;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Collections;
import java.util.ArrayList;

public class Task5 {
    String t;

    public static void main(String[] msi) {

        // System.out.println(f_palindrome("Loww ol"));
        // System.out.println(f_removeDuplicates("qwezrty1122qwerty33445566778899qwerty"));
        // System.out.println(f_anagram("Kot", "tOK"));
        // System.out.println(f_compareTo("12381", "1238"));
        // System.out.println(f_compareIgnoreCase("Kot", "koT"));
        // System.out.println("Hello".f_concat("World"));// tut
        // System.out.println(len("Kot"));
        // System.out.println(f_contentEquals("hello", "hello"));
        // System.out.println(f_equals("suuucces", "suuuccez"));
        // System.out.println(f_endsWith("hello", "llo"));
        // System.out.println(f_startsWith("hell", "he"));
        // System.out.println(f_repeatThreeChar("suuuccess"));
        // System.out.println(sumInt("123"));
        // System.out.println(f_firstChar("suuucces"));
        // System.out.println(repeatChar("suuuccess"));
    }

    public static boolean f_palindrome(String str) {
        return str.replaceAll("\\W", "")
                .equalsIgnoreCase(new StringBuilder(str.replaceAll("\\W", "")).reverse().toString());
    }

    public static String f_removeDuplicatesRegex(String str) {
        return new StringBuilder(new StringBuilder(str).reverse().toString().replaceAll("(.)(?=.*\\1)", "")).reverse()
                .toString();
    }

    public static boolean f_anagram(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        StringBuilder s1 = new StringBuilder(str1.toLowerCase());
        StringBuilder s2 = new StringBuilder(str2.toLowerCase());
        int x, y;
        x = -1;
        while (++x < s1.length()) {
            y = -1;
            while (++y < s2.length()) {
                if (s1.charAt(x) == s2.charAt(y)) {
                    s2.deleteCharAt(y);
                    break;
                }
            }
        }
        return s2.length() == 0;
    }

    public static int f_compareTo(String str1, String str2) {
        // return str1.compareTo(str2);
        int x = -1;
        while (++x < str1.length() && x < str2.length())
            if (str1.charAt(x) != str2.charAt(x))
                return str1.charAt(x) - str2.charAt(x);
        if (str1.length() != str2.length())
            return (str1.length() > str2.length()) ? str1.length() - str2.length() : str2.length() - str1.length();
        return 0;
    }

    public static int f_compareToIgnoreCase(String str1, String str2) {
        // return str1.compareToIgnoreCase(str2);
        return f_compareTo(f_lowerCase(str1), f_lowerCase(str2));
    }

    public void f_concat(String str) {
        this.t += str;
    }

    public static boolean f_contentEquals(String str, CharSequence c) {
        return str.contentEquals(c);
    }

    public static boolean f_endsWith(String str, String end) {
        // return str.endsWith(end);
        return str.substring(str.length() - end.length()).equals(end);
    }

    public static boolean f_equals(String str1, String str2) {
        // return str1.equals(str2);
        int i = -1;
        if (str1.length() == str2.length())
            while (++i < str1.length() && str1.charAt(i) == str2.charAt(i)) {
            }
        return i == str1.length();
    }

    public static int f_len(String str) {
        return str.length();
    }

    public static String f_lowerCase(String str) {
        // return str.toLowerCase();
        StringBuilder s = new StringBuilder(str);
        int i = s.length();
        while (--i > -1)
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                s.setCharAt(i, (char) (s.charAt(i) + 32));
        return new String(s);
    }

    public static String f_upperCase(String str) {
        // return str.toUpperCase();
        StringBuilder s = new StringBuilder(str);
        int i = s.length();
        while (--i > -1)
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                s.setCharAt(i, (char) (s.charAt(i) - 32));
        return new String(s);
    }

    public static char repeatChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = -1;
        while (++i < str.length())
            map.put(str.charAt(i), map.get(str.charAt(i)) != null ? map.get(str.charAt(i)) + 1 : 1);
        ArrayList<Integer> mapValues = new ArrayList<>(map.values());
        Collections.sort(mapValues);
        int max2 = mapValues.get(mapValues.size() - 2);
        i = 0;
        while (++i < str.length())
            for (Entry<Character, Integer> entry : map.entrySet())
                if (max2 == entry.getValue() && str.charAt(i) == entry.getKey())
                    return entry.getKey();
        return 0;
    }

    public static char f_firstChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = -1;
        while (++i < str.length())
            map.put(str.charAt(i), map.get(str.charAt(i)) != null ? map.get(str.charAt(i)) + 1 : 1);
        int min = Collections.min(map.values());
        i = -1;
        while (++i < str.length())
            for (Entry<Character, Integer> entry : map.entrySet())
                if (min == entry.getValue() && str.charAt(i) == entry.getKey())
                    return entry.getKey();
        return 0;
    }

    public static boolean f_startsWith(String str, String end) {
        // return str.startsWith(end);
        return str.substring(0, str.length() - end.length()).equals(end);
    }

    public static int f_repeatThreeChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = -1;
        while (++i < str.length())
            map.put(str.charAt(i), map.get(str.charAt(i)) != null ? map.get(str.charAt(i)) + 1 : 1);
        i = 0;
        for (Entry<Character, Integer> entry : map.entrySet())
            if (entry.getValue() == 3)
                i++;
        return i;
    }

    public static int f_sumInt(String str) {
        int i = str.length();
        int res = 0;
        while (--i > -1)
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
                res += str.charAt(i) - '0';
        return res;
    }
}
