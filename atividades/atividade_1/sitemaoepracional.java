package atividades.atividade_1;

public class sitemaOepracional {

private String nome;
    private int armazenamentoOcupado; // espaço ocupado no HD em MB
    private Computador computador;

    public SistemaOperacional(String nome, int armazenamentoOcupado, Computador computador) {
        this.nome = nome;
        this.armazenamentoOcupado = armazenamentoOcupado;
        this.computador = computador;
        computador.setSistemaOperacional(this);
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getArmazenamentoOcupado() { return armazenamentoOcupado; }
    public void setArmazenamentoOcupado(int armazenamentoOcupado) { this.armazenamentoOcupado = armazenamentoOcupado; }

    public Computador getComputador() { return computador; }
    public void setComputador(Computador computador) { this.computador = computador; }

    // Verifica espaço disponível
    public int getArmazenamentoDisponivel() {
        return computador.getArmazenamento() - armazenamentoOcupado;
    }
}
    

