public class Main {
    public static void main(String[] args) {
        // Criar computador
        Computador pc = new Computador("Dell XPS", 8000, 500000, 4, 1e9); // 8GB RAM, 500GB SSD, 4 núcleos, 1 GigaOp/s

        // Criar SO
        SistemaOperacional windows = new SistemaOperacional("Windows 11", 20000, pc); // ocupa 20GB

        // Criar programas
        Programa chrome = new Programa("Google Chrome", 500, 2000, 5e9, windows);
        Programa photoshop = new Programa("Photoshop", 1000000, 2000, 1e10, windows); // vai dar erro por falta de espaço
        Programa jogo = new Programa("Jogo 3D", 2000, 16000, 2e9, windows); // vai dar erro por RAM

        // Executar cenários
        chrome.executarPrograma();     // sucesso
        photoshop.executarPrograma();  // erro instalação
        jogo.executarPrograma();       // erro execução
    }
}