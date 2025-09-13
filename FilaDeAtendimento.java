
import java.util.LinkedList;

// Classe responsável por gerenciar a fila de atendimento usando LinkedList
public class FilaDeAtendimento {
    private LinkedList<Paciente> fila;

    // Inicializa a fila vazia
    public FilaDeAtendimento() {
        fila = new LinkedList<>();
    }

    // Adiciona um paciente ao final da fila
    public void adicionarPaciente(Paciente p) {
        fila.addLast(p);
    }

    // Remove e retorna o primeiro paciente da fila
    public Paciente atenderPaciente() {
        if (!fila.isEmpty()) {
            return fila.removeFirst();
        }
        return null;
    }

    // Verifica se a fila está vazia
    public boolean estaVazia() {
        return fila.isEmpty();
    }

    // Mostra todos os pacientes na fila
    public void mostrarFila() {
        if (fila.isEmpty()) {
            System.out.println("Fila de atendimento vazia.");
        } else {
            for (Paciente p : fila) {
                System.out.println(p.exibirInfo());
            }
        }
    }
}
