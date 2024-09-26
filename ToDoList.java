package todolist;

/**
 *
 * @author bebel
 */
public class ToDoList {

    public static void main(String[] args) {
        Tarefas tarefa1 = new Tarefas("ENVIAR TAREFA TEAMS", "Subir código para o Git e enviar link na tarefa do Teams");
        Tarefas tarefa2 = new Tarefas("PROVA QUINTA-FEIRA", "Estudar para prova quinta, matéria Java");

        tarefa1.AdicionarTarefa(tarefa1);
        tarefa2.AdicionarTarefa(tarefa2);
        tarefa1.ListaTarefas();
        tarefa2.ListaTarefas();
    }
    
}
