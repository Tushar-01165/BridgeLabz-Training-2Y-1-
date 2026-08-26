package Arrays.Leetcode;

public class Leetcode_2109 {
        public String addSpaces(String s, int[] spaces) {
            StringBuilder sb = new StringBuilder();
            int i = 0, j = 0;
            int n = s.length(), m =spaces.length;

            while (i < n) {
                if (j < m && i == spaces[j]) {
                    sb.append(' ');
                    j++;
                }
                sb.append(s.charAt(i));
                i++;
            }

            return sb.toString();
        }
}
