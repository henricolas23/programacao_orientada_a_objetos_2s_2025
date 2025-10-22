public class Emprestimo {
    private TomadorEmprestimo tomadorEmprestimo;
    private Material material;
    private String dataEmprestimo;
    private String dataDevolucao;

    public Emprestimo(TomadorEmprestimo tomadorEmprestimo, Material material, String dataEmprestimo, String dataDevolucao) {
        this.tomadorEmprestimo = tomadorEmprestimo;
        this.material = material;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public TomadorEmprestimo getTomadorEmprestimo() {
        return tomadorEmprestimo;
    }

    public Material getMaterial() {
        return material;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void exibirDetalhes() {
        System.out.println("Data de Empréstimo: " + dataEmprestimo);
        System.out.println("Data de Devolução: " + dataDevolucao);
        System.out.println("--- TomadorEmprestimo ---");
        tomadorEmprestimo.exibirInfo();
        System.out.println("--- Material ---");
        material.descricao();
    }
}
