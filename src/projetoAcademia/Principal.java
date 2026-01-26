package projetoAcademia;

public class Principal {
	public static void main(String[] args) {
		Aluno AlunoDaAcademia = new Aluno();
		Instrutor instrutor = new Instrutor();
		PlanoTreino Treinamentos = new PlanoTreino();
		Academia academia = new Academia();
		
		AlunoDaAcademia.cadastro();
		instrutor.registro();
		Treinamentos.PlanoDeTreino();
		AlunoDaAcademia.MensalidadeAluno.planosAcademia();
		AlunoDaAcademia.MensalidadeAluno.pagamentoMensalidade();
		academia.imprimirDadosAcademia(AlunoDaAcademia.toString(), instrutor.toString());
	}
}