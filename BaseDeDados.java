import java.util.HashMap;

public class BaseDeDados {
 HashMap<String, String> baseDeDados = new HashMap<>();
    BaseDeDados(){
        baseDeDados.put("olá", "Oi! Como posso ajudar você?");
        baseDeDados.put("quem é você?", "Eu sou um chatbot que tenta simular como o ChatGPT funciona!");
        baseDeDados.put("o que é Java?", "Java é uma linguagem de programação orientada a objetos popular.");
        baseDeDados.put("o que é a vida?", "Java é uma linguagem de programação orientada a objetos popular.");
        baseDeDados.put("adeus", "Tchau! Espero ter ajudado.");
        baseDeDados.put("oi", "Oi!,tudo bem");
        baseDeDados.put("oi", "blz!,tudo bem");
        baseDeDados.put("a", "A letra 'A'faz parte do alfabeto ");
        baseDeDados.put("b", "A letra 'B'faz parte do alfabeto ");
        baseDeDados.put("c", "A letra 'C'faz parte do alfabeto ");
        baseDeDados.put("d", "A letra 'D'faz parte do alfabeto ");
        baseDeDados.put("e", "A letra 'E'faz parte do alfabeto ");
        baseDeDados.put("f", "A letra 'F'faz parte do alfabeto ");
        baseDeDados.put("g", "A letra 'G'faz parte do alfabeto ");
        baseDeDados.put("h", "A letra 'H'faz parte do alfabeto ");
        baseDeDados.put("i", "A letra 'I'faz parte do alfabeto ");
        baseDeDados.put("j", "A letra 'J'faz parte do alfabeto ");
        baseDeDados.put("k", "A letra 'K'faz parte do alfabeto ");
        baseDeDados.put("l", "A letra 'L'faz parte do alfabeto ");
        baseDeDados.put("m", "A letra 'M'faz parte do alfabeto ");
        baseDeDados.put("n", "A letra 'N'faz parte do alfabeto ");
        baseDeDados.put("o", "A letra 'O'faz parte do alfabeto ");
        baseDeDados.put("p", "A letra 'P'faz parte do alfabeto ");
        baseDeDados.put("como", "artigo");
        baseDeDados.put("tudo bem?", "Oi!,tudo bem sim, óbvio que eu estou bem");
        baseDeDados.put("fala parceiro", "Opa meu truta, tudo bem");
        baseDeDados.put("eae", "Opa meu truta, tudo bem");
        baseDeDados.put("dique?", "ce vende agua? ");
        baseDeDados.put("de que?", "diQuÊ?");
        baseDeDados.put("que", "diQuÊ?");
        baseDeDados.put("Davi Brito", "Calma ai Calabreso");
        baseDeDados.put("Sabe quem eu sou?", "Alguem com muito poder nas mãos");
        baseDeDados.put("Sabe quem eu sou", "Alguem com muito poder nas mãos");

        
     
        
    }
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }
    public HashMap<String, String> getBaseDeDados(){
        return baseDeDados;
    }
    public void setBaseDeDados(String key, String argument){
        baseDeDados.put(key, argument);
    }
        
}
