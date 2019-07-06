Public class Etudiant{
	
	private String nom;
	private String prenom;
	private int age;
	private String campus;

	public Etudiant(){
	}

	public Etudiant(String nom, String prenom, int age, String campus){
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.campus = campus;
	}

	//write getter and setter here
	
	//surchage de la methode toString;
	public String toString(){
               
		return "Je suis l'etudiant "+this.nom + " "+this.prenom
		" et agé de "+ this.age + " et est regulier au campus de "+ 
			this.campus
	}



