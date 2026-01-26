package projetoAcademia;
import java.util.Scanner;

public class Aluno {
	Scanner sc = new Scanner(System.in);
    private String NomeAluno;
    private String TelefoneAluno;
    private String CpfAluno;
    private String DataCadastroAluno;
    Mensalidade MensalidadeAluno = new Mensalidade();
    
    Aluno() {
    	
    }

Aluno(String NomeAluno, String TelefoneAluno, String CpfAluno){
   this.NomeAluno = NomeAluno;
   this.TelefoneAluno = TelefoneAluno;
   this.CpfAluno = CpfAluno;
	}

	public void cadastro(){
		System.out.println("Olá, seja bem-vindo(a) a academia ADK! Vamos iniciar o seu cadastro?: ");

		System.out.print("Nome do Aluno: ");
		this.NomeAluno = sc.nextLine();

		System.out.println("Telefone para contato: ");
		this.TelefoneAluno = sc.nextLine();

		System.out.println("CPF do Aluno: ");
		this.CpfAluno = sc.nextLine();

		System.out.println("Digite a data que realizou o cadastro(dd/MM/yyyy)");
		this.DataCadastroAluno = sc.nextLine();
	}
	public String getNome() {
		return NomeAluno;
	}
	public String getTelefone() {
		return TelefoneAluno;
	}
	public String getCpf() {
		return CpfAluno;
	}
	public String getDataCadastro() {
		return DataCadastroAluno;
	}
	@Override 
		public String toString() {
			return String.format("\nNome do Aluno: " + this.NomeAluno + "\nStatus de Pagamento: " + this.MensalidadeAluno.StatusPagamentoMensalidade);
	}
}


