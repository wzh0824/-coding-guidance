/**
 * @author a
 * @description: https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/
 */
public class Test05 {
    public static String replaceBlank(String s) {
        if (s == null) {
            return null;
        }
        char[] chars = s.toCharArray();
        int oldLength = chars.length;
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                count++;
            }
        }
        int newLength = oldLength + 2 * count;
        char[] newchars = new char[newLength];

        while (oldLength>0){
            oldLength--;
            if (chars[oldLength]==' '){
                newchars[--newLength]='0';
                newchars[--newLength]='2';
                newchars[--newLength]='%';
            }
            else {
                newchars[--newLength]=chars[oldLength];
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < newchars.length; i++) {
            stringBuilder.append(newchars[i]);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String s=" ";
        String s1 = replaceBlank(s);
        System.out.println(s1);
    }
}
