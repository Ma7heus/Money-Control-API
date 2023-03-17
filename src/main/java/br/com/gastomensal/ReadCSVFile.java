package br.com.gastomensal;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.gastomensal.entities.ConsumoCartao;

public class ReadCSVFile {

	public static void main(String[] args) {
		try {
			File file = new File("C:\\Documentos\\arquivos_nubank\\nubank.csv"); //C:\Documentos\arquivos_nubank
			Scanner scanner = new Scanner(file);
			scanner.useDelimiter(",");
			
			List<ConsumoCartao> listaGastos = new ArrayList<ConsumoCartao>();
			
			while (scanner.hasNextLine()) {
				String linha = scanner.nextLine();
				String[] campos = linha.split(",");

				ConsumoCartao gasto = new ConsumoCartao();
				int contador = 0;

				for (String campo : campos) {
					populargasto(campo, contador, gasto);
					contador =+ 1;
				}
				listaGastos.add(gasto);
			}
			
			for (ConsumoCartao consumoCartao : listaGastos) {
				System.out.println(consumoCartao);
			}
			
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static void populargasto(String campo, int contador, ConsumoCartao gasto) {

		switch (contador) {
		case 0:
			gasto.setData(campo);
			break;
		case 1:
			gasto.setCategoria(campo);
			break;
		case 2:
			gasto.setNomeEstabelecimento(campo);
			break;
		case 3:
			gasto.setValorTransacao(new BigDecimal(campo));
			break;
		default:
			break;
		}
	}
}
