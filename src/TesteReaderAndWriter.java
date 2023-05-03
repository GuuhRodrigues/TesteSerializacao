import java.io.IOException;

public class TesteReaderAndWriter {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Guuh\\Documents\\ManipulandoArquivo\\nomes.txt";
        String path2 = "C:\\Users\\Guuh\\Documents\\ManipulandoArquivo\\sobrenomes.txt";
        String path3 = "C:\\Users\\Guuh\\Documents\\ManipulandoArquivo\\nomes_e_sobrenomes.txt";


        // ManipuladorDeArquivo.leitor(path);
        // ManipuladorDeArquivo.leitor(path2);
        ManipuladorDeArquivo.juntar(path, path2, path3);
        ManipuladorDeArquivo.leitor(path3);

    }
}
