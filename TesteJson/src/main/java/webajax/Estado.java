package webajax;

import java.util.List;

public class Estado {

	String uf;
	List <Cidade> cidades;
	
	public Estado(String nome, List<Cidade> cidades) {
		setUf(nome);
		setCidades(cidades);
	}
	
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public List<Cidade> getCidades() {
		return cidades;
	}
	public void setCidades(List<Cidade> cidades) {
		this.cidades = cidades;
	}
	
	
}
