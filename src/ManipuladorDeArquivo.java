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
            System.out.println(linha);
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
        BufferedWriter buffWriter = new BufferedWriter(new FileWriter(path3));
        BufferedReader buffReader2 = new BufferedReader(new FileReader(path2));
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        BufferedReader buffRead2 = new BufferedReader(new FileReader(path));

        String linha = "";
        String linhaConjunta = "";
        while (true) {
            if (linha != null) {
                //System.out.println(linha);
            } else
                break;

            linha = buffRead.readLine();
            linhaConjunta =  buffRead2.readLine() + " " + buffReader2.readLine();
            buffWriter.append(linhaConjunta + "\n");
        }

        buffRead.close();
        buffWriter.close();
        buffReader2.close();
    }
}

