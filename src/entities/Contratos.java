package entities;

/*
 * ORDEM: 1
 * */

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contratos {
	private Integer numero;
	private Date date;
	private Double valorTotal;
	
	private List<Prestacoes> prestacoes = new ArrayList<>();
	
	public Contratos() {}

	public Contratos(Integer numero, Date date, Double valorTotal) {
		this.numero = numero;
		this.date = date;
		this.valorTotal = valorTotal;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public List<Prestacoes> getPrestacoes() {
		return prestacoes;
	}
	
	public void adicionarPrestacao (Prestacoes prestacaoObjeto) {
		prestacoes.add(prestacaoObjeto);
	}
	
	public void removerPrestacao (Prestacoes prestacaoObjeto) {
		prestacoes.remove(prestacaoObjeto);
	}
	
	
}
