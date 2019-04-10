import java.util.List;

public class GetConverter implements ListConverter {

	@Override
	public <E> String listToString(List<E> list) {
		
		StringBuilder str = new StringBuilder();
		
		for (int i = 0; i < list.size(); i++) {
			str.append(list.get(i)).append(", ");
			
			if (i % 3 == 0) {
				str.append("\n");
			}
		}
		return str.toString();
	}

}
