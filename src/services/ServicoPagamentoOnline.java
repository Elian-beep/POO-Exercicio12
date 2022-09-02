package services;

/*
 * ORDEM: 2
 * */

public interface ServicoPagamentoOnline {
	double taxaPagamento(double montante);
	double contrato(double montante, int meses);
}
