package aula_03;

public class imovel {
    private Municipio municipio;
    private double areaM2;
    private Integer vagas;

    public double calcularIPTU(){
        return this.areaM2 * this.municipio.precoM2() * 1.05;
    }
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEstado(){
        this.estado;
    }

    public void setEstados(String estado){
        this.estado = estado
    }

    public double getPrecoM2(){
        return this.precoM2
    }

    public void setPrecoM2(double precoM2){
        this.precoM2 = precoM2;
    }
}


}
