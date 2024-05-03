package br.com.alura.threads.nomes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TarefaBusca implements Runnable {
    String caminhoDoArquivo;
    String nomeProcurado;

    public TarefaBusca(String caminhoDoArquivo, String nomeProcurado) {
        this.caminhoDoArquivo = caminhoDoArquivo;
        this.nomeProcurado = nomeProcurado;
    }

    @Override
    public void run() {
        int numeroDaLinha = 1;

        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(caminhoDoArquivo));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        while(scanner.hasNextLine()){
            String linha = scanner.nextLine();
            if(linha.contains(nomeProcurado)){
                System.out.println(numeroDaLinha + " - " + linha + " em " + caminhoDoArquivo);
            }
            numeroDaLinha++;
        }
    }
}
