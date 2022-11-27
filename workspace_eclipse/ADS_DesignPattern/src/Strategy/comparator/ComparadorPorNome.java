package Strategy.comparator;

import java.util.Comparator;

public class ComparadorPorNome implements Comparator<Animal> {

	// atalho coloca o curso em cima do nome da classe ctrl + 3
	@Override
	public int compare(Animal a1, Animal a2) {
		return a1.getNome().compareTo(a2.getNome());
	}
	
	

}
