package todolist;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author bebel
 */
public class Tarefas {
    
    private String titulo;
    private String descricao;
    private static ArrayList<Tarefas> listaDeTarefas = new ArrayList<>();

    // Construtor que obriga a passar o título e a descrição da tarefa
    public Tarefas(String t, String d) {
        this.titulo = t;
        this.descricao = d;
    }
    
    // Método que printa na tela o Título e a Descrição
    public void ListaTarefas(){
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Descrição: " + getDescricao() + "\n");
    }
    
    // Método que adiciona as tarefas 
    public void AdicionarTarefa(Tarefas t) {
        listaDeTarefas.add(t);
        System.out.println("Tarefa adicionada: " + t.getTitulo());

        // Aqui ele adiciona a tarefa criada à um arquivo txt que está salvo na pasta do projeto com o nome 'tarefas'
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("tarefas.txt", true))) {
            writer.write("Titulo: " + t.getTitulo() + "\nDescrição: " + t.getDescricao() + "\n");
            writer.newLine(); 
        } catch (IOException e) {
            System.out.println("Erro ao salvar a tarefa: " + e.getMessage());
        }
    }
    
    // Aqui são os getters e setters dos atributos
    // <editor-fold> 
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
// </editor-fold>
    
}
