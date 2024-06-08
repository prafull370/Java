package collectionFramework;

import java.util.HashMap;

public class MaxAppearence {

	public static void main(String[] args) {
    	int[] arr= {1,2,3,2,3,2};
    	HashMap<Integer,Integer> mp=new HashMap<>();
    	for(int el:arr) {
    		if(!mp.containsKey(el)) {
    			mp.put(el, 1);
    		}
    		else {
    			mp.put(el,mp.get(el)+1);
    		}
    	}
    	System.out.println(mp.entrySet());
    }
}
