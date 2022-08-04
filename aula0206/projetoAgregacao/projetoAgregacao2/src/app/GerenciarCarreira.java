package app;

import model.Escuderia;
import model.Pais;
import model.Piloto;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GerenciarCarreira {
    public static void main(String[] args) throws IOException {
        Pais brasil = new Pais();
        brasil.setCodigo(2);
        brasil.setDescricao("Brasil");
        Escuderia ferrari = new Escuderia();
        ferrari.setCodigo(15);
        ferrari.setDescricao("Ferrari");

        Piloto massa = new Piloto();
        massa.setNumero(23);
        massa.setNome("Felipe Massa");
        massa.setEscuderia(ferrari);
        massa.setPaisOrigem(brasil);

        massa.gerarTempo(40);

        massa.imprimir();
        Path path = Paths.get("C:\\Windows");
        if (Files.isDirectory(path)) {
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);
            int i=0;
            for (Path p : directoryStream) {
                System.out.println(++i + ") " + p);
            }
        }
    }




}