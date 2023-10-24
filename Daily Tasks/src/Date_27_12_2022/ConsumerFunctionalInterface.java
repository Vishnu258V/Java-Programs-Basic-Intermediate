package Date_27_12_2022;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class ConsumerFunctionalInterface {
	public static void main(String[] args) {

		// Consumer a type of Functional interface which takes only one parameter return nothing
		Consumer<String> str = (t) -> System.out.println(t); 
		str.accept("Vishnu");
		
		// we can give this type also
		IntConsumer i = v -> System.out.println(v);
		i.accept(4561);
		
		LongConsumer ln = (value) -> {
			System.out.println(value);
		};
		ln.accept(89745631231L);
		
		
		
	}
}
