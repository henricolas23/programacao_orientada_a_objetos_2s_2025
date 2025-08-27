package aula_02;

public class simulacao {

    public static void main(String[] args ){
        carro opala = new carro();
        opala.velocidade = 0;
        opala.placa = "aclr300";
        opala.modelo = "comodoro";
        opala.ano = 76;

        radar Radar = new radar();
        Radar.modelo = "pardal";
        Radar.limite_velocidade = 69;
        Radar.localizacao = "pistao sul";
        
        opala.acelerar(); //5
        opala.acelerar();//10
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
   
        Radar.avaliar_velocidade(opala);

        opala.acelerar();
        Radar.avaliar_velocidade(opala);

        opala.frear();
        Radar.avaliar_velocidade(opala);
    }
    
}
