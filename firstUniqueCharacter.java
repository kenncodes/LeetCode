import java.util.HashMap;

public class firstUniqueCharacter{
    public static int firstUniqChar(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i),0) + 1);
        }
        for(int i=0;i<s.length();i++){
            if(hm.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String [] args){
        System.out.println(firstUniqChar("absabc"));
    }
}