package br.com.vladwoguer.JSFExemploMaven;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

@ManagedBean
@SessionScoped
public class PlanningBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nome;
	private String escolha;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String estimar(String valor) {
		if ("interrogacao".equals(valor)) {
			this.escolha = "interrogacao";
		} else if ("meio".equals(valor)) {
			this.escolha = "meio";
		} else {
			this.escolha = valor;
		}
		return "planning";
	}

	public String getEscolha() {
		return escolha;
	}

	public void setEscolha(String escolha) {
		this.escolha = escolha;
	}
}
