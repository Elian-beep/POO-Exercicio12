package services;

/*
 * ORDEM: 3
 * */

public class ServicoPayPal implements ServicoPagamentoOnline{
	private static final double FEE_PERCENTAGE = 0.02;
	private static final double MONTHLY_INTEREST = 0.01;
	
	@Override
	public double taxaPagamento(double montante) {
		return montante * FEE_PERCENTAGE;
	}
	@Override
	public double contrato(double montante, int mes) {
		return montante * MONTHLY_INTEREST;
	}
	
	
	
	
}
