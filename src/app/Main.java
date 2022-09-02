package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Contratos;
import entities.Prestacoes;
import services.ServicoContrato;
import services.ServicoPayPal;

public class Main {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("ENTRE COM OS DADOS DO CONTRATO");
		
		System.out.printf("Numero: ");
		int numero = sc.nextInt();
		sc.nextLine();
		
		System.out.printf("Data (dd/mm/yyyy): ");
		Date data = sdf.parse(sc.next());
		sc.nextLine();
		System.out.printf("Valor do contrato");
		double valorTotal = sc.nextDouble();
		
		Contratos contrato = new Contratos(numero, data, valorTotal);
		
		System.out.printf("Entre com o número de prestrações: ");
		int n = sc.nextInt();
		
		ServicoContrato servicoContrato = new ServicoContrato(new ServicoPayPal());
		
		servicoContrato.processaContrato(contrato, n);
		
		System.out.println("PRESTRAÇÕES: ");
		for (Prestacoes prestacao : contrato.getPrestacoes()) {
			System.out.println(prestacao);
		}
		
		sc.close();
	}
}
