package atividades.atividade_1;

public class computador {
    
    private String modelo;
    private int memoriaRAM; // em MB
    private int armazenamento; // em MB
    private int nucleos;
    private double operacoesPorSegundo; // FLOPS ou similar
    private SistemaOperacional sistemaOperacional;

    public Computador(String modelo, int memoriaRAM, int armazenamento, int nucleos, double operacoesPorSegundo) {
        this.modelo = modelo;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
        this.nucleos = nucleos;
        this.operacoesPorSegundo = operacoesPorSegundo;
    }

    // Getters e Setters
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getMemoriaRAM() { return memoriaRAM; }
    public void setMemoriaRAM(int memoriaRAM) { this.memoriaRAM = memoriaRAM; }

    public int getArmazenamento() { return armazenamento; }
    public void setArmazenamento(int armazenamento) { this.armazenamento = armazenamento; }

    public int getNucleos() { return nucleos; }
    public void setNucleos(int nucleos) { this.nucleos = nucleos; }

    public double getOperacoesPorSegundo() { return operacoesPorSegundo; }
    public void setOperacoesPorSegundo(double operacoesPorSegundo) { this.operacoesPorSegundo = operacoesPorSegundo; }

    public SistemaOperacional getSistemaOperacional() { return sistemaOperacional; }
    public void setSistemaOperacional(SistemaOperacional sistemaOperacional) { this.sistemaOperacional = sistemaOperacional; }
}
    

