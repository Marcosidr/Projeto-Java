public class Paciente {
    private static int contador = 1;
    private int id;
    private String nome;
    private int idade;
    private String sintoma;
// CRIAR O CONSTRUTOR, GETTERS, SETTERS E MÉTODO PARA EXIBIR INFORMAÇÕES DO PACIENTE
    public Paciente(String nome, int idade, String sintoma) {
        this.id = contador++;
        this.nome = nome;
        this.idade = idade;
        this.sintoma = sintoma;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSintoma() {
        return sintoma;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }
    // Método para exibir informações do paciente
    public String exibirInfo() {
        return "ID: " + id + " | Nome: " + nome + " | Idade: " + idade + " | Sintoma: " + sintoma;
    }
}
