package aula_03;

public class Municipio {
private Municipio municipio;
private String nome;
private String estado;
private String precoM2;



    public Municipio() {
    }


    public String getNome(){

    public Municipio(Municipio municipio, String nome, String estado, String precoM2) {
        this.municipio = municipio;
        this.nome = nome;
        this.estado = estado;
        this.precoM2 = precoM2;
    }
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
