package day15;

//import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//import java.util.concurrent.ConcurrentHashMap.KeySetView;

public class StringDemo {

	public static void main(String[] args) {
		String string = "good good study, day day up.";
		string = string.replaceAll("[^a-zA-Z]+", "");
		System.out.println(string);
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i = 0;i<string.length();i++) {
			char ch = string.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			} else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
		
		Set<Character> keys = map.keySet();
		for(Character key : keys ) {
			System.out.println("key:"+key);
		}
		
		Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
		for(Map.Entry<Character, Integer> e : entrySet) {
			Character key = e.getKey();
			Integer value = e.getValue();
			System.out.println(key+":"+value);
		}
	}

}
