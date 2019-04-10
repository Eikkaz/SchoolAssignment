import java.util.List;

public class ArrayConverter implements ListConverter {

	@Override
	public <E> String listToString(List<E> list) {
		Object[] numbers = list.toArray();
		StringBuilder str = new StringBuilder();
		
		for(int i = 0; i < numbers.length; i++) {
			str.append(numbers[i]).append(", ");
			
			if (i % 3 == 0) {
				str.append("\n");
			}
			
		}
			
		return str.toString();
	}

}
