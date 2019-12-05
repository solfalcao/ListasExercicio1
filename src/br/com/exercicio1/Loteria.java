package br.com.exercicio1;

import java.util.HashMap;
import java.util.Map;

public class Loteria {

    public static void main(String[] args) {

        Map<Integer, String> loteriasSonho = new HashMap<>();


        loteriasSonho.put(0,"Ovos");
        loteriasSonho.put(1,"Água");
        loteriasSonho.put(2,"Escopeta");
        loteriasSonho.put(3, "Cavalo");
        loteriasSonho.put(4,"Dentista");
        loteriasSonho.put(5, "Fogo");

        for(Integer chave: loteriasSonho.keySet()){
            String valor = loteriasSonho.get(chave);
            System.out.println(chave+ " " +valor);
        }

        Map<String, String> apelidos = new HashMap<>();

        apelidos.put("João", "Juan, Fissura, Maromaba");
        apelidos.put("Miguel", "Night Watch, Bruce Waine, Tampinha");
        apelidos.put("Maria", "Wonder Woman, Mary, Marilene");
        apelidos.put("Lucas", "Lukinha, Jorge, George");


        for (String chave :apelidos.keySet()){
            String valor = apelidos.get(chave);
            System.out.println(valor);
        }



    }
}
