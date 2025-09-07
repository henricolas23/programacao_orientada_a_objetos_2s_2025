package atividades.atividade_1;

public class main {

    public class Programa {
    private String nome;
    private int armazenamentoNecessario; // MB
    private int memoriaRAMNecessaria;    // MB
    private double quantidadeOperacoes;  // número de operações
    private SistemaOperacional sistemaOperacional;

    public Programa(String nome, int armazenamentoNecessario, int memoriaRAMNecessaria, double quantidadeOperacoes, SistemaOperacional sistemaOperacional) {
        this.nome = nome;
        this.armazenamentoNecessario = armazenamentoNecessario;
        this.memoriaRAMNecessaria = memoriaRAMNecessaria;
        this.quantidadeOperacoes = quantidadeOperacoes;
        this.sistemaOperacional = sistemaOperacional;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getArmazenamentoNecessario() { return armazenamentoNecessario; }
    public void setArmazenamentoNecessario(int armazenamentoNecessario) { this.armazenamentoNecessario = armazenamentoNecessario; }

    public int getMemoriaRAMNecessaria() { return memoriaRAMNecessaria; }
    public void setMemoriaRAMNecessaria(int memoriaRAMNecessaria) { this.memoriaRAMNecessaria = memoriaRAMNecessaria; }

    public double getQuantidadeOperacoes() { return quantidadeOperacoes; }
    public void setQuantidadeOperacoes(double quantidadeOperacoes) { this.quantidadeOperacoes = quantidadeOperacoes; }

    public SistemaOperacional getSistemaOperacional() { return sistemaOperacional; }
    public void setSistemaOperacional(SistemaOperacional sistemaOperacional) { this.sistemaOperacional = sistemaOperacional; }

    // Método para executar o programa
    public void executarPrograma() {
        Computador comp = sistemaOperacional.getComputador();

        // Verifica se há espaço em disco
        if (armazenamentoNecessario > sistemaOperacional.getArmazenamentoDisponivel()) {
            System.out.println("Erro ao instalar " + nome + ": espaço insuficiente em disco.");
            return;
        }

        // Verifica se há memória suficiente
        if (memoriaRAMNecessaria > comp.getMemoriaRAM()) {
            System.out.println("Erro ao executar " + nome + ": memória insuficiente.");
            return;
        }

        // Caso tudo certo, executa
        double tempoExecucao = quantidadeOperacoes / (comp.getOperacoesPorSegundo() * comp.getNucleos());
        System.out.println("Programa " + nome + " executado com sucesso!");
        System.out.printf("Tempo de execução: %.4f segundos%n", tempoExecucao);
    }
}
    
}
