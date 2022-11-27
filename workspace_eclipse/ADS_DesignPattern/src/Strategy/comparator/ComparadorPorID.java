package Strategy.comparator;

import java.util.Comparator;

public class ComparadorPorID implements Comparator<Animal>  {

	@Override
	public int compare(Animal a1, Animal a2) {
		return a1.getId().compareTo(a2.getId());
	}
}
