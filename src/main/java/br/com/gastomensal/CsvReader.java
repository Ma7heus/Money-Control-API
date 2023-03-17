package br.com.gastomensal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigDecimal;
import java.util.ArrayList;

import br.com.gastomensal.entities.ConsumoCartao;

public class CsvReader {

    public static void main(String[] args) {
        String csvFile = "C:\\Documentos\\arquivos_nubank\\nubank.csv";
        String line = "";
        String csvSplitBy = ",";
        ArrayList<MeuObjeto> objetos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] info = line.split(csvSplitBy);
                String coluna1 = info[0];
                String coluna2 = info[1];
                String coluna3 = info[2];
                String coluna4 = info[3];
                MeuObjeto objeto = new MeuObjeto(coluna1, coluna2, coluna3, coluna4);
                objetos.add(objeto);
               
                ConsumoCartao cartao = new ConsumoCartao(coluna1, coluna2, coluna3, coluna4);
                System.out.println(cartao.getValorTransacao());
                
              //System.out.println(objeto.coluna1 + "/" + objeto.coluna2 + "/" + objeto.coluna3 + "/" + objeto.coluna4 + "/");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MeuObjeto {
    String coluna1;
    String coluna2;
    String coluna3;
    String coluna4;

    public MeuObjeto(String coluna1, String coluna2, String coluna3, String coluna4) {
        this.coluna1 = coluna1;
        this.coluna2 = coluna2;
        this.coluna3 = coluna3;
        this.coluna4 = coluna4;
    }
}
