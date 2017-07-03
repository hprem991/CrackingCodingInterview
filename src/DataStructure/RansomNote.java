package DataStructure;
import java.util.*;
import java.lang.*;

//https://www.hackerrank.com/challenges/ctci-ransom-note
public class RansomNote {
	
	boolean isRansonNotePossible(String []mag , String []note){
		
		Map<String, Integer> map =  new HashMap<String, Integer>();
		
		for(int i=0; i < mag.length; i++){
			map.put(mag[i], true);
		}
		
		for(int i = 0; i < note.length; i++){
			if(!map.containsKey(note[i])){
				return false;
			}
		}
		return true;
	}
}
