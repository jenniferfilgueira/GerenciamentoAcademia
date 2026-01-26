package projetoAcademia;
import java.util.Scanner;

public class Instrutor {
	private Scanner sc = new Scanner(System.in);
    private String NomeDoInstrutor;
    private String TelefoneInstrutor;
    private int CREF;
    private Aluno AlunoDoInstrutor;
    private PlanoTreino PlanoDeTreino;

    Instrutor() {
    }

    Instrutor(String NomeDoInstrutor, String TelefoneInstrutor, int CREF, Aluno AlunoDoInstrutor, PlanoTreino PlanoDeTreino) {
        this.NomeDoInstrutor = NomeDoInstrutor;
        this.TelefoneInstrutor = TelefoneInstrutor;
        this.CREF = CREF;
        this.AlunoDoInstrutor = AlunoDoInstrutor;
        this.PlanoDeTreino = PlanoDeTreino;
    }

    public void registro() {
        System.out.println("\n┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃        REGISTRO DE INSTRUTOR - STAFF           ┃");
        System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
        
        System.out.print("Nome do Instrutor: ");
        this.NomeDoInstrutor = sc.nextLine();
        
        System.out.print("Telefone de Contato (instrutor): ");
        this.TelefoneInstrutor = sc.nextLine();
        
        System.out.print("Número do CREF (instrutor): ");
        this.CREF = sc.nextInt();
        
        System.out.println("\nProfissional vinculado com sucesso!");
        System.out.println("--------------------------------------------------\n");
    }

    public String getNomeInstrutor() { return NomeDoInstrutor; }
    public String getTelefone() { return TelefoneInstrutor; }
    public int getCref() { return CREF; }
    public Aluno getAluno() { return AlunoDoInstrutor; }
    public PlanoTreino getTreino() { return PlanoDeTreino; }

    @Override
    public String toString() {
        return String.format(
            "|------------------------------------------------|\n" +
            "|   RESPONSÁVEL: %-31s |\n" +
            "|   REGISTRO: CREF %-29d |\n" +
            "|   CONTATO: %-34s |\n" +
            "|------------------------------------------------|",
            this.NomeDoInstrutor.toUpperCase(), 
            this.CREF, 
            this.TelefoneInstrutor
        );
    }
}
