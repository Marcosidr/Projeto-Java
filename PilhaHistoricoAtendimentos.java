
import java.util.Stack;

// Classe responsável por gerenciar o histórico de atendimentos usando Stack
public class PilhaHistoricoAtendimentos {
    private Stack<Paciente> historico;

    // Inicializa a pilha de histórico vazia
    public PilhaHistoricoAtendimentos() {
        historico = new Stack<>();
    }

    // Adiciona um paciente atendido ao topo da pilha
    public void adicionarAoHistorico(Paciente p) {
        historico.push(p);
    }

    // Retorna o último paciente atendido sem remover
    public Paciente verUltimoAtendido() {
        if (!historico.isEmpty()) {
            return historico.peek();
        }
        return null;
    }

    // Mostra o histórico de atendimentos do mais recente ao mais antigo
    public void mostrarHistorico() {
        if (historico.isEmpty()) {
            System.out.println("Nenhum atendimento realizado ainda.");
        } else {
            for (int i = historico.size() - 1; i >= 0; i--) {
                System.out.println(historico.get(i).exibirInfo());
            }
        }
    }
}
