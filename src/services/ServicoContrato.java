package services;

import java.util.Calendar;
import java.util.Date;

import entities.Contratos;
import entities.Prestacoes;

public class ServicoContrato {
	private ServicoPagamentoOnline servicoPagamentoOnline;

	public ServicoContrato(ServicoPagamentoOnline servicoPagamentoOnline) {
		this.servicoPagamentoOnline = servicoPagamentoOnline;
	}
	
	public void processaContrato(Contratos contrato, int meses) {
		double cotaBasica = contrato.getValorTotal() / meses;
		
		for (int i=1; i<=meses; i++) {
			Date date = adicionarMes(contrato.getDate(), i);
			double atualizacaoCota = cotaBasica + servicoPagamentoOnline.contrato(cotaBasica, i);
			double cotaCheia = atualizacaoCota + servicoPagamentoOnline.taxaPagamento(atualizacaoCota);
			
			contrato.adicionarPrestacao(new Prestacoes(date, cotaCheia));
		}
	}
	
	private Date adicionarMes(Date data, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}
}
