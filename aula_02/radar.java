package aula_02;

public class radar {
    public Integer limite_velocidade;
    public String modelo;
    public String localizacao;
    
    public void emitir_notificacao(String placa, Integer velocidade_avaliada){
        System.out.println("limite de velocidade: "+ this.limite_velocidade);
        System.out.println("velocidade avaliada : "+ velocidade_avaliada);
        System.out.println("placa: "+placa);
    }

    public void avaliar_velocidade(carro c ){
        if (c.velocidade > this.limite_velocidade){
            emitir_notificacao(c.placa, c.velocidade);
        }
    }
}
