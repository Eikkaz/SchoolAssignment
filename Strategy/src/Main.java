import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		Converter converter = new Converter();
		numbers.addAll(getNumbers());
		
		converter.setStrategy(new IteratorConverter());
		System.out.println(converter.listToString(numbers));
		converter.setStrategy(new ArrayConverter());
		System.out.println(converter.listToString(numbers));
		converter.setStrategy(new GetConverter());
		System.out.println(converter.listToString(numbers));

	}

	private static List<Integer> getNumbers() {
		
		List<Integer> numbers = new ArrayList<>();
		Random r = new Random();
		
		for (int i =0; i < 61; i++) {
			numbers.add(r.nextInt(50));
		}
		
		return numbers;
	}

}
