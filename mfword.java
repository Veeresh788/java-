import java.util.*;

public class mfword {
    public static String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> countMap = new HashMap<>();
        String[] words = paragraph.toLowerCase().split("[ !?',;.]+");
        
        for (String word : words) {
            if (!bannedSet.contains(word)) {
                countMap.put(word, countMap.getOrDefault(word, 0) + 1);
            }
        }
        
        return Collections.max(countMap.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
    
    public static void main(String[] args) {
        String paragraph = "Ram hit a ball, the hit ball flew far after it was hit";
        String[] banned = {"hit"};
        
        System.out.println(mostCommonWord(paragraph, banned));
    }
}
