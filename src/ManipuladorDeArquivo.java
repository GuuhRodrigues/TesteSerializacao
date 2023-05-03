import java.io.*;

public class ManipuladorDeArquivo {
    public static void leitor(String path) throws IOException{
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";
        while (true) {
            if (linha != null) {
                System.out.println(linha);
            } else
                break;
            linha = buffRead.readLine();
        }
            buffRead.close();
        }

    public static void escritor(String path) throws IOException{
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
        String  linha = "";
        buffWrite.append(linha + "\n");
        buffWrite.close();
    }

    public static void juntar(String path, String path2, String path3) throws IOException{
        BufferedReader nomes = new BufferedReader(new FileReader(path));
        BufferedReader sobrenomes = new BufferedReader(new FileReader(path2));
        BufferedWriter nomes_e_sobrenomes = new BufferedWriter(new FileWriter(path3));

        String nome, sobrenome;

        while ((nome = nomes.readLine()) != null && (sobrenome = sobrenomes.readLine()) != null) {
            nomes_e_sobrenomes.write(nome + " " + sobrenome);
            nomes_e_sobrenomes.newLine();
        }
        nomes.close();
        sobrenomes.close();
        nomes_e_sobrenomes.close();
    }
}

