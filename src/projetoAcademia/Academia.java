package projetoAcademia;
public class Academia {
    private String NomeDaAcademia;
    Aluno AlunoDaAcademia;
    Instrutor InstrutorDoAluno;
    Mensalidade MensalidadeDaAcademia;

    Academia(){

    }
    public void imprimirDadosAcademia(String nome, String nomeInstrutor) {
    	NomeDaAcademia = "J PERFORMANCE CLUB";
    	
    	System.out.print("---------- Bem-vindo à academia " + NomeDaAcademia + "----------");
    	System.out.println(nome);
    	System.out.print(nomeInstrutor);
    }
    public Aluno getAluno() {
    	return AlunoDaAcademia;
    }
    public Instrutor getInstrutor() {
    	return InstrutorDoAluno;
    }
    public Mensalidade getMensalidade() {
    	return MensalidadeDaAcademia;
    }
}