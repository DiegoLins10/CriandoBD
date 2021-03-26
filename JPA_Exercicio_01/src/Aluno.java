import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table
@NamedQueries({ @NamedQuery(name = "find Aluno id", query = "Select a from Aluno a where a.ra = :ra"),
		@NamedQuery(name = "get Alunos", query = "Select a from Aluno a"),
		@NamedQuery(name = "delete Aluno id", query = "Delete from Aluno where ra = :ra"),
		@NamedQuery(name = "update Aluno query", query = "Update Aluno set nome=:n, email=:e, celular=:c, nota1=:n1, nota2=:n2 where ra=:ra") })
public class Aluno {

	// Chave Primaria RA
	@Id
	private String ra;

	private String nome;
	private String email;
	private String celular;
	private double nota1;
	private double nota2;

	public Aluno() {
		super();
	}

	public Aluno(String ra, String nome, String email, String celular, double nota1, double nota2) {
		super();
		this.ra = ra;
		this.nome = nome;
		this.email = email;
		this.celular = celular;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	@Override
	public String toString() {
		return "Aluno [ra=" + ra + ", nome=" + nome + ", email=" + email + ", celular=" + celular + ", nota1=" + nota1
				+ ", nota2=" + nota2 + "]";
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
}
