package DB;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

public class PersisteProfessor {

    public static void salvarEmArquivo(String nomeArquivo, String dados) {

        String jsonString = dados;

        // Criar um objeto ObjectMapper
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Converter a string JSON para um objeto JsonNode
            JsonNode jsonNode = objectMapper.readTree(jsonString);

            // Acessar os valores do JSON
//            String nome = jsonNode.get("nome").asText();
//            int idade = jsonNode.get("idade").asInt();
//            String cidade = jsonNode.get("cidade").asText();



        } catch (Exception e) {
            e.printStackTrace();
        }


        // Criar um objeto File com o caminho do arquivo
        File arquivo = new File("/Users/miguelmoura/Desktop/TESTE/testeEdit.odt");

        try {
            // Criar um objeto FileWriter que vai escrever no arquivo, true indica que vamos adicionar ao arquivo (não substituir)
            FileWriter fw = new FileWriter(arquivo, true);

            // Criar um objeto BufferedWriter para escrever em buffer
            BufferedWriter bw = new BufferedWriter(fw);

            // Escrever os dados no arquivo
            bw.write(dados);
            bw.newLine(); // Adicionar uma nova linha após os dados

            // Fechar os recursos
            bw.close();
            fw.close();

            System.out.println("Dados salvos com sucesso no arquivo.");

        } catch (IOException e) {
            e.printStackTrace();
        }


        // LER ARQUIVOS

        String caminhoArquivo = "/Users/miguelmoura/Desktop/TESTE/testeEdit.odt";

        try {
            // Abre o arquivo para leitura usando FileReader
            FileReader fileReader = new FileReader(caminhoArquivo);

            // Cria um BufferedReader para ler linhas de texto eficientemente
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Lê cada linha do arquivo e imprime no console
            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                try {
                    // Converter a string JSON para um objeto JsonNode
                    JsonNode linhaJSON = objectMapper.readTree(linha);


                    System.out.println(linhaJSON);



                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            // Fecha o BufferedReader e o FileReader
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            // Trata exceções de leitura de arquivo
            e.printStackTrace();
        }

    }

}
