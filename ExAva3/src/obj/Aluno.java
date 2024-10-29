package obj;

public class Aluno {
	private int mat = 0;
	private String nom = "Fulano";
	private int idade = 0;

	public Aluno() {
		
	}
	
	public Aluno(int mat, String nom, int idade) {
		this.mat =  mat;
		this.nom = nom;
		this.idade = idade;

	}
	@Override
	public String toString() {
		return String.format("Aluno: %s  Idade:  %s \nMatrícula: %s", nom, idade, mat);  
	}

	public boolean busca(String s) {
		return(s.equalsIgnoreCase(this.nom));
	}
	
	
	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	
	
	
	
	
	
}
