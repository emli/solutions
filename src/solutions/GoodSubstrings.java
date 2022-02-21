package solutions;

import java.util.HashSet;

public class GoodSubstrings {
    public int maxGoodSubstrings(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);

        for (int i = 0; i < stringBuilder.length(); i++) {
            int left = i - 1;
            int right = i + 1;
            while (stringBuilder.charAt(i) != '.' && left >= 0 && right < stringBuilder.length()

                    && ((stringBuilder.charAt(left) == '.' && stringBuilder.charAt(right) == '.') ||
                    (stringBuilder.charAt(left) == '.' && stringBuilder.charAt(right) != '.' && stringBuilder.charAt(right) == stringBuilder.charAt(i)) ||
                    (stringBuilder.charAt(left) != '.' && stringBuilder.charAt(right) == '.'  && stringBuilder.charAt(left) == stringBuilder.charAt(i)))){
                stringBuilder.setCharAt(left,stringBuilder.charAt(i));
                stringBuilder.setCharAt(right,stringBuilder.charAt(i));
                left--;
                right++;
            }
        }

//        for (int i = 1; i < stringBuilder.length(); i++) {
//            if (stringBuilder.charAt(i - 1) != '.' && stringBuilder.charAt(i) == '.'){
//                stringBuilder.setCharAt(i,stringBuilder.charAt(i - 1));
//            }
//        }


//        for (int i = stringBuilder.length() - 2; i >= 0; i--) {
//            if (stringBuilder.charAt(i + 1) != '.' && stringBuilder.charAt(i) == '.'){
//                stringBuilder.setCharAt(i,stringBuilder.charAt(i + 1));
//            }
//        }
        int ans = 0;
        for (int i = 0; i < stringBuilder.length(); i++) {
            HashSet<Character> hashSet = new HashSet<>();
            for (int j = i; j < stringBuilder.length(); j++) {
                hashSet.add(stringBuilder.charAt(j));
                if (hashSet.size() == 1){
                    ans++;
                }
            }
        }
        return ans;
    }
}
