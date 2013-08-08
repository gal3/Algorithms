package implmentAnagramSolver;

import java.util.HashMap;

public class AnagramSolver {

	/**
	 * 
	 * @param s1 First String
	 * @param s2 Second String
	 * @return true if s1 is an Anagram of s2, false otherwise
	 * 
	 */
	public static boolean isAnagram(String s1, String s2){
		
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();

		if(s1 == null || s2 == null){
			return false;
		}
		else if(s1.length() != s2.length()){
			return false;
		}
		else{
			for(int i=0; i<s1.length();i++){
				if(!map1.containsKey(s1.charAt(i))){
					map1.put(s1.charAt(i), new Integer(1));
				}
				else{
					map1.put(s1.charAt(i), new Integer((Integer)map1.get(s1.charAt(i))+1));
				}
				
				if(!map2.containsKey(s2.charAt(i))){
					map2.put(s2.charAt(i), new Integer(1));
				}
				else{
					map2.put(s1.charAt(i), new Integer((Integer)map2.get(s2.charAt(i))+1));
				}
			}
			System.out.println(map1);
			System.out.println(map2);
			if(map1.equals(map2)){
				return true;
			}

		}
		
		return false;
	}
	
	public static void main(String[] args) {
		String s1 = "";
		String s2 = "";
		
		System.out.println(isAnagram(s1, s2));
	}

}
