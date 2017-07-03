package DataStructure;
import java.util.*;
import java.lang.*;


// https://www.hackerrank.com/challenges/ctci-making-anagrams

public class MakingAnagram {
	
	int minDelete(String first, String second){
		 Map<Character, Integer> map1 =  new HashMap<Character, Integer>();
		 
		 int count = 0;
		 
		 for(Character c:first.toCharArray()){
			 if(map1.containsKey(c)){
				 int val = map1.get(c);
				 val++;
				 map1.put(c, val);
			 } else {
				 map1.put(c, 1);
			 }
		 }
		 
		 for(Character c:second.toCharArray()){
			 if(map1.containsKey(c)){
				 int val = map1.get(c);
				 val--;
				 if(val > 0)
					 map1.put(c, val);
				 else
					 map1.remove(c);
			 } else {
				 count++;
			 }
		 }
		 
		 for(Map.Entry<Character, Integer> map: map1.entrySet()){
			 count += map.getValue();
		 }
		 return count;
	}
}
