import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Program {

    public static void main(String[] args) {

        String path = "L:\\Faculdade_Arquivos\\Curso_Java\\Exercicio_Map\\in.txt";

        Map<String, Integer> candidates = new LinkedHashMap<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while (line != null){
                String fields[] = line.split(",");
                String name = fields[0];
                int votes = Integer.parseInt(fields[1]);

                if(candidates.containsKey(name)){
                    votes += candidates.get(name);
                    candidates.put(name, votes);
                }else{
                    candidates.put(name, votes);
                }



                line = br.readLine();
            }

        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }

        for(String key: candidates.keySet()){
            System.out.println(key + ":" + candidates.get(key));
        }


    }

}
