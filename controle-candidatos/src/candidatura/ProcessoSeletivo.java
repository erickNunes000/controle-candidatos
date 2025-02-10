package candidatura;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        analisarCandidato(1900);
        analisarCandidato(2200);
        analisarCandidato(2000);
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
