import java.util.HashMap;
import java.util.Map;

public class morning {
    // out put = 30
    public static void main(String[] args) {
        // duplicateChar();
        largestNum();
    }

    public static void largestNum() {
        int array[] = {1, 100, 12, 20, 30};
        int largestNum = array[0];
        int secondLargestNum;
        for (int ch : array) {
            if (ch > largestNum) {
                largestNum = ch;

            }
        }
    }

        public static void duplicateChar () {
            //o/p = a
            String str = "Syeda Sarwat";
            String newString = str.toLowerCase();
            HashMap<Character, Integer> dup = new HashMap<>();
            for (char ch : newString.toCharArray()) {
                dup.put(ch, dup.getOrDefault(ch, 0) + 1);
            }

            // to count duplicate character
            for (Map.Entry<Character, Integer> entry : dup.entrySet()) {
                if (entry.getValue() > 1) {
                    System.out.println(entry.getKey());
                }


            }

        }
    }



