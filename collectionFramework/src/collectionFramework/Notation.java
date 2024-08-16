package collectionFramework;
import java.util.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class A{
	public void M() {
		System.out.print("In A");
	}
}
class B extends A{
	@Override
	public void M() {
		System.out.print("In B");
	}
}

public class Notation {

	public static void main(String [] args) {
		List<Integer> list=Arrays.asList(1,5,7,55,20,24,50,22,30,9);
		List<Integer> fList=list.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(fList);
//		@SuppressWarnings({ "unchecked", "unused" })
		@SuppressWarnings("unused")
		List<Integer> mapStream= fList.stream().map(n ->n/2).collect(Collectors.toList());
		System.out.print(mapStream);
	}
}
