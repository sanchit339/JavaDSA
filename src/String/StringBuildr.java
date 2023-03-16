package String;

public class StringBuildr {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series += (ch + " ");
        }
        System.out.println(series);  // but here for every loop new obj is created so performance issue
        // ie. for adding N char to string we get TC as (N^2)

        // this problem is solved by the string builder class which does not create new object

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            sb.append(ch + " ");
        }
        System.out.println(sb);
    }
}
