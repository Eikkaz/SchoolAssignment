import java.util.List;
import java.util.ListIterator;

public class IteratorConverter implements ListConverter {

	@Override
	public <E> String listToString(List<E> list) {
		// TODO Auto-generated method stub
		ListIterator iterator = list.listIterator();
		StringBuilder str = new StringBuilder();
		
		while (iterator.hasNext()) {
			str.append(iterator.next().toString()).append(", \n");
		}
		
		return str.toString();
	}

}
