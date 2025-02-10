package candidatura;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        // analisarCandidato(1900);
        // analisarCandidato(2200);
        // analisarCandidato(2000);
        selecaoCandidatos();

    }
    static void selecaoCandidatos(){
        String[] candidatos = {"felipe","marcia","julia","paulo","augusto","monica","fabricio","mirela","daniela","jorge"};
        ArrayList<String> candidatosSelecionados = new ArrayList<String>();
        int selecionados=0;
        for(int i=0;i<candidatos.length;i++){
            if(selecionados==5){
                break;
            }
            double salPretendido = gerarSalPretendido();
            System.out.println("nome: "+candidatos[i]+" salario pretendido: "+salPretendido);
            if(salPretendido<=2000){
                candidatosSelecionados.add(candidatos[i]);
                selecionados++;
            }
        }
        for (String string : candidatosSelecionados) {
            System.out.println(string);
        }

    }
    static double gerarSalPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }
    static void analisarCandidato(double salPretendido){

        double salBase = 2000.0;
        if(salPretendido>salBase){
            System.out.println("Aguardando resultado dos demais candidatos");
        }else if(salBase==salPretendido){
            System.out.println( "lIGAR PRO CANDIDATO E OFERECER CONTRAPROPOSTA ");
        }else{
            System.out.println("Ligar para o candidato");
        }
    }

    
}
