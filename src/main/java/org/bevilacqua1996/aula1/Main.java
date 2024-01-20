package org.bevilacqua1996.aula1;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        System.out.println("Ex. 1");
        System.out.println();

        // Ex.1
        List<Produto> produtoList = Arrays.asList(new Produto("Item1",2.22),
                new Produto("Item2", 1.55),
                new Produto("Item3", 4.66),
                new Produto("Item4", 3.45),
                new Produto("Item4", 10.34));

        OptionalDouble optionalDouble = produtoList.stream().mapToDouble(Produto::getPreco).average();

        System.out.println(optionalDouble.getAsDouble());

        System.out.println();
        System.out.println("Ex. 2");
        System.out.println();

        // Ex.2
        List<String> wordsList = Arrays.asList("Palavra1", "Palavra2", "Palavra3", "Palavra1", "Palavra1", "Palavra2", "Palavra4");

        Set<String> words = new HashSet<String>(wordsList);

        Map<String, Integer> mapWordsFrequency = new HashMap<>();

        words.forEach(a -> mapWordsFrequency.put(a, 0));

        for(String word : words) {
            long frequencyWord = wordsList.stream().filter(a -> a.equals(word)).count();
            mapWordsFrequency.put(word, (int) frequencyWord);
        }

        mapWordsFrequency.forEach((word, frequency) -> {
            System.out.println(word + " -> " + frequency);
        });

        System.out.println();
        System.out.println("Ex. 3");
        System.out.println();

        // Ex.3
        Set<Livro> livros = new HashSet<>(Arrays.asList(new Livro("titulo1", "Autor1"),
                new Livro("titulo2", "Autor2"),
                new Livro("titulo3", "Autor3"),
                new Livro("titulo1", "Autor1"),
                new Livro("titulo1", "Autor2"),
                new Livro("titulo1", "Autor2"),
                new Livro("titulo1", "Autor1"),
                new Livro("titulo1", "Autor1")));

        livros.forEach(System.out::println);

        System.out.println();
        System.out.println("Ex. 4");
        System.out.println();

        // Ex.4
        Set<Integer> numerosInteiros = new HashSet<>(Arrays.asList(1,2,3,4,5,67,34,23,56,68,78));

        for(Integer numero : numerosInteiros) {
            if(numero==1 || numero==0) {
                continue;
            }
            boolean primo = true;
            for(int j=2; j<numero; j++) {
                if(numero%j == 0) {
                    primo = false;
                    break;
                }
            }
            if(primo) {
                System.out.println(numero);
            }
        }

        System.out.println();
        System.out.println("Ex. 5");
        System.out.println();

        // Ex.5
        Set<Aluno> alunos = new HashSet<>(Arrays.asList(new Aluno("Bruno", "ASGK876645"),
                new Aluno("Tales", "KJHBJ57465346"),
                new Aluno("Jailson", "NBVYFHD4654645"),
                new Aluno("Nuno", "NBVYFHD4654645")));

        alunos.forEach(System.out::println);

        System.out.println();
        System.out.println("Ex. 6");
        System.out.println();

        // Ex.6
        Agenda agenda = new Agenda();
        agenda.adicionarContato("Gerson", "2311-6789");
        agenda.adicionarContato("Jose", "2344-6789");
        agenda.adicionarContato("Nuno", "7888-6789");
        agenda.adicionarContato("Ines", "2311-9833");

        System.out.println(agenda.toString());

        agenda.deletarContato("Jose");

        System.out.println(agenda.toString());

        System.out.println(agenda.buscarContato("Ines"));
    }
}