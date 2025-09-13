import java.util.Stack;

public class PilhaHistoricoAtendimentos {
    private Stack<Paciente> historico;

    public PilhaHistoricoAtendimentos() {
        historico = new Stack<>();
    }

    public void adicionarAoHistorico(Paciente p) {
        historico.push(p);
    }

    public Paciente verUltimoAtendido() {
        if (!historico.isEmpty()) {
            return historico.peek();
        }
        return null;
    }

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
