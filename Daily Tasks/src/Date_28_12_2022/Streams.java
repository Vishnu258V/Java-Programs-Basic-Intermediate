package Date_28_12_2022;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Streams {

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
		// System.out.println(list);

		Set<Integer> duplicates = list.stream().collect(Collectors.toSet());
		System.out.println(duplicates);

		
		List<Integer> even = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(even);

		
		List<Boolean> conditiion = list.stream().map(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(conditiion);

		
		List<Integer> sort = list.stream().map(x -> x).sorted().collect(Collectors.toList());
		System.out.println(sort);

	}
}
