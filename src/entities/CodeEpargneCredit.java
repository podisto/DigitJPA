package entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the codeEpargneCredit database table.
 * 
 */
@Entity
@Table(name="codeEpargneCredit")
@NamedQuery(name="CodeEpargneCredit.findAll", query="SELECT c FROM CodeEpargneCredit c")
public class CodeEpargneCredit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String codecredit;

	private String codeepargne;

	private String compteurcredit;

	private String compteurepargne;

	public CodeEpargneCredit() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodecredit() {
		return this.codecredit;
	}

	public void setCodecredit(String codecredit) {
		this.codecredit = codecredit;
	}

	public String getCodeepargne() {
		return this.codeepargne;
	}

	public void setCodeepargne(String codeepargne) {
		this.codeepargne = codeepargne;
	}

	public String getCompteurcredit() {
		return this.compteurcredit;
	}

	public void setCompteurcredit(String compteurcredit) {
		this.compteurcredit = compteurcredit;
	}

	public String getCompteurepargne() {
		return this.compteurepargne;
	}

	public void setCompteurepargne(String compteurepargne) {
		this.compteurepargne = compteurepargne;
	}

}