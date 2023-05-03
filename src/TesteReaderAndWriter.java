import java.io.IOException;

public class TesteReaderAndWriter {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Programas\\nomes.txt";
        String path2 = "C:\\Programas\\sobrenomes.txt";
        String path3 = "C:\\Programas\\nomes-e-sobrenomes.txt";


        // ManipuladorDeArquivo.leitor(path);
        // ManipuladorDeArquivo.leitor(path2);
        ManipuladorDeArquivo.juntar(path, path2, path3);
        //ManipuladorDeArquivo.leitor(path3);



    }
}
