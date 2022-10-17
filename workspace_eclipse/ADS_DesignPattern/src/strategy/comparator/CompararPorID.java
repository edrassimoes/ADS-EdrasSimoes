package strategy.comparator;

import java.util.Comparator;

public class CompararPorID implements Comparator<Animal> {

	@Override
	public int compare(Animal o1, Animal o2) {
		return o1.getId().compareTo(o2.getId());
	}
	
}
