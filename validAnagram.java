
import java.util.HashMap;

public class validAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer>hm = new HashMap<>();
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
        }
        for(int i=0; i<t.length(); i++){
            char temp = t.charAt(i);
            if(hm.containsKey(temp)){
                if(hm.get(temp) > 1){
                    hm.put(temp, hm.get(temp) - 1);
                }else if(hm.get(temp) == 1){
                    hm.remove(temp);
                }
            }else{
                return false;
            }
        }
        return hm.isEmpty();
    }
}
