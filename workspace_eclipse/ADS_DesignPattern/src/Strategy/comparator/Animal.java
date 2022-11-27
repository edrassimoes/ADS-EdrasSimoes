package Strategy.comparator;

public class Animal {
	
	private Long id;
	private String nome;
	
	// ctrl + 3 + gcuf
	public Animal(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	// ctrl + 3 + ggas
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// atalho ctrl + 3 - tos
	@Override
	public String toString() {
		return "Animal [id=" + id + ", nome=" + nome + "]";
	}	
	

}
