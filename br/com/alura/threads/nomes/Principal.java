package br.com.alura.threads.nomes;

public class Principal {
    public static void main(String[] args) {
        String nome = "Jon";
        Thread tarefa1 = new Thread(new TarefaBusca("assinaturas1.txt",nome));
        Thread tarefa2 = new Thread(new TarefaBusca("assinaturas2.txt",nome));
        Thread tarefa3 = new Thread(new TarefaBusca("autores.txt",nome));
        tarefa1.start();
        tarefa2.start();
        tarefa3.start();
    }
}
