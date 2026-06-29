package services;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ServicoArquivo <T>{

    public void salvarArquivo(T item) {
        try (Scanner entrada = new Scanner(System.in); BufferedWriter bw = new BufferedWriter(new FileWriter(entrada.next()))) {

        } catch (IOException exception) {
            System.out.println("Erro ao salvar o arquivo!");
        }
    }
}
