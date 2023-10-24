package Date_28_12_2022;

import java.util.ArrayList;
import java.util.List;

public class StreamForEach {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(21);
		list.add(20);
		list.add(20);
		list.add(11);
		list.add(21);
		list.add(230);
		list.add(221);
		list.add(11);
	
		
			list.forEach(val -> System.out.println(val/2));
		
		
	}
}