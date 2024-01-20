package org.bevilacqua1996.aula1;

import java.util.HashMap;
import java.util.Map;

public class Agenda {

    private Map<String, String> contatos = new HashMap<>();

    public void adicionarContato(String nome, String numeroTelefone) {
        this.contatos.put(nome, numeroTelefone);
    }

    public void deletarContato(String nome) {
        this.contatos.remove(nome);
    }

    public String buscarContato(String nome) {
        return "Contato: " + nome + "Telefone: " + this.contatos.get(nome);
    }

    @Override
    public String toString() {
        String agenda = "";
        for (Map.Entry<String,String> contato : this.contatos.entrySet()) {
            agenda += "Contato: " + contato.getKey() + " Telefone: " + contato.getValue() + " \n";
        }
        return agenda;
    }
}
