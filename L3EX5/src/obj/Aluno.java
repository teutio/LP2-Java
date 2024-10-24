package obj;

public class Aluno {
	private int mat = 0;
	private String nom = "Fulano";
	private double n1 = 0.0;
	private double n2 = 0.0;
	private double med = media();
	
	public Aluno() {
		
	}
	public Aluno(int mat, String nom, double n1, double n2) {
		this.mat =  mat;
		this.nom = nom;
		this.n1 = n1;
		this.n2 = n2;
		this.med = media();
	}
	
	public double media() {
		return (this.n1+this.n2)/2;
	}
	
	public void dados() {
		System.out.print("M: "+mat);
		System.out.println("   Nome: "+nom);
		System.out.println("Notas: "+n1+" e "+n2);
		System.out.println("Média: "+med);
		System.out.println("------------------------");
		
	}
	
	public boolean busca(String s) {
		if(s.equalsIgnoreCase(this.nom))
			return true;
			else
				return false;
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
	public double getN1() {
		return n1;
	}
	public void setN1(double n1) {
		this.n1 = n1;
	}
	public double getN2() {
		return n2;
	}
	public void setN2(double n2) {
		this.n2 = n2;
	}
	public double getMed() {
		return med;
	}
	public void setMed(double med) {
		this.med = med;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
