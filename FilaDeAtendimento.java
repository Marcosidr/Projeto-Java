import java.util.LinkedList;

public class FilaDeAtendimento {
    private LinkedList<Paciente> fila;

    public FilaDeAtendimento() {
        fila = new LinkedList<>();
    }

    public void adicionarPaciente(Paciente p) {
        fila.addLast(p);
    }

    public Paciente atenderPaciente() {
        if (!fila.isEmpty()) {
            return fila.removeFirst();
        }
        return null;
    }

    public boolean estaVazia() {
        return fila.isEmpty();
    }

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
