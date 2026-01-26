package projetoAcademia;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.Scanner;


public class Mensalidade {
    Scanner sc = new Scanner(System.in);
	float ValorMensalidade;
	LocalDate DataVencimentoMensalidade;
	String StatusPagamentoMensalidade;
	Aluno aluno;

    Mensalidade(){
	
	}

    public void planosAcademia() {
        System.out.println("\n TABELA DE VALORES- J PERFORMANCE CLUB");
        System.out.println("┌──────────────────────────────────────────────┐");
        System.out.println("│ PLANO      │ VALOR MENSAL │ FIDELIDADE       │");
        System.out.println("├──────────────────────────────────────────────┤");
        System.out.println("│  Mensal  │ R$ 499,00     │ Mensal            │");
        System.out.println("│  Semestre│ R$ 369,00     │ 6 Meses           │");
        System.out.println("│  Anual   │ R$ 249,00     │ 12 Meses          │");
        System.out.println("└──────────────────────────────────────────────┘");
        
        String PlanoAluno;
        System.out.print(" Digite o nome do plano desejado: ");
        PlanoAluno = sc.nextLine();

        LocalDate DataCadastroAluno = LocalDate.now();
		DateTimeFormatter FormatacaoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		switch (PlanoAluno) {

	    	case "Mensal":
	    		DataVencimentoMensalidade = DataCadastroAluno.plusDays(30);
	    		System.out.println("Plano Mensal");
	    		System.out.println("O plano escolhido se vence em: " + DataVencimentoMensalidade.format(FormatacaoData));
	    		break;

	    	case "Semestral":
	    		DataVencimentoMensalidade = DataCadastroAluno.plusMonths(6);
	    		System.out.println("Plano Semestral");
	    		System.out.println("O plano escolhido se vence em: " + DataVencimentoMensalidade.format(FormatacaoData));
	    		break;

	    	case "Anual":
	    		DataVencimentoMensalidade = DataCadastroAluno.plusYears(1);
	    		System.out.println("Plano Anual");
	    		System.out.println("O plano escolhido se vence em: " + DataVencimentoMensalidade.format(FormatacaoData));
	    		break;

	    	default:
	    		System.out.println("Desculpe, tente novamente!");
	    		break;
		}
	    		if(DataCadastroAluno.isBefore(DataVencimentoMensalidade) || DataCadastroAluno.isEqual(DataVencimentoMensalidade)) {
	    			StatusPagamentoMensalidade = "Pagamento em dia!";
	      }		
	    		else {
	    	  		StatusPagamentoMensalidade = "Pagamento atrasado!";
	    }
	}
	
	public void pagamentoMensalidade() {
		int valorMensal = 499;
		int valorSemestral = 369;
		int valorAnual = 249;

		System.out.println("Qual será a forma de pagamento?");
		System.out.println("1 - Dinheiro (Plano Mensal Somente)");
		System.out.println("2 - Cartão (Plano Semestral)");
		System.out.println("3 - Cartão (Plano Anual)");
		System.out.println("4 - Pix (Plano Mensal Somente)");

		int opcaoPagamento = sc.nextInt();

		switch (opcaoPagamento) {
        	case 1:
        		System.out.println("Preparando pagamento em Dinheiro");
        		System.out.println("Valor: R$ " + valorMensal);
        		break;

        	case 2:
        		System.out.println("Preparando pagamento via Cartão Semestral");
        		System.out.println("Valor: R$ " + valorSemestral);
        		break;

        	case 3:
        		System.out.println("Preparando pagamento via Cartão Anual");
        		System.out.println("Valor: R$ " + valorAnual);
        		break;

        	case 4:
        		System.out.println("Preparando pagamento via Pix");
        		System.out.println("Valor: R$ " + valorMensal);
        		break;

        	default:
        		System.out.println("Desculpe, tente novamente!");
        		break;
		}	
		sc.close();
	}
}

