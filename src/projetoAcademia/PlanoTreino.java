package projetoAcademia;
import java.util.Scanner;

public class PlanoTreino {

	    Scanner sc = new Scanner(System.in);
	    private int objetivo;
	    private int duracaoSemanas;

	    public void PlanoDeTreino() {
			System.out.println();
	        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
	        System.out.println("┃   CENTRAL DE PLANEJAMENTO J PERFORMANCE CLUB   ┃");
	        System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
	        System.out.println("Selecione o foco do treinamento:");
	        System.out.println(" [1] Power Hypertrophy   [2] Fat Burn (HIIT)");
	        
	        System.out.print("\n Escolha uma opção: ");
	        this.objetivo = sc.nextInt();
	        System.out.print(" Planejar para quantas semanas? ");
	        this.duracaoSemanas = sc.nextInt();

	        System.out.println("\n Gerando cronograma personalizado... \n");

			switch (objetivo) {

				case 1:
					mostrarCabecalho("HIPERTROFIA AVANÇADA", "Volume e Densidade");

					imprimirDia("SEGUNDA", "Push (Peito/Ombro/Tríceps)");
					imprimirExercicio("Supino Inclinado", 4, "10-12", "60s");
					imprimirExercicio("Desenvolvimento Arnold", 3, "12", "45s");
					imprimirExercicio("Tríceps Corda", 4, "15", "30s");
					imprimirDia("TERÇA", "Pull (Costas/Bíceps)");
					imprimirExercicio("Puxada Pronada", 4, "10", "60s");
					imprimirExercicio("Remada Curvada", 3, "12", "45s");
					imprimirExercicio("Rosca Scott", 4, "10", "45s");
					imprimirDia("QUARTA", "Pernas (Força)");
					imprimirExercicio("Agachamento Livre", 4, "8-10", "90s");
					imprimirExercicio("Leg Press", 3, "12", "60s");
					imprimirExercicio("Panturrilha em Pé", 4, "15", "30s");
					imprimirDia("QUINTA", "Ombros + Core");
					imprimirExercicio("Elevação Lateral", 4, "12", "45s");
					imprimirExercicio("Desenvolvimento Militar", 3, "10", "60s");
					imprimirExercicio("Prancha", 3, "40s", "30s");
					imprimirDia("SEXTA", "Upper Body Completo");
					imprimirExercicio("Supino Reto", 3, "10", "60s");
					imprimirExercicio("Remada Baixa", 3, "12", "60s");
					imprimirExercicio("Rosca Direta", 3, "12", "45s");
					break;

				case 2:
					mostrarCabecalho("EMAGRECIMENTO ATIVO", "Déficit Calórico & Intensidade");

					imprimirDia("SEGUNDA", "HIIT Metabólico");
					imprimirExercicio("Burpees", 4, "20", "30s");
					imprimirExercicio("Mountain Climbers", 4, "40s", "20s");
					imprimirDia("TERÇA", "Cardio + Core");
					imprimirExercicio("Esteira", 1, "30 min", "-");
					imprimirExercicio("Abdominal Infra", 3, "20", "30s");
					imprimirDia("QUARTA", "HIIT Inferior");
					imprimirExercicio("Agachamento Explosivo", 4, "15", "30s");
					imprimirExercicio("Avanço Alternado", 3, "20", "30s");
					imprimirDia("QUINTA", "HIIT Superior");
					imprimirExercicio("Flexão de Braço", 4, "12", "30s");
					imprimirExercicio("Polichinelo", 3, "1 min", "20s");
					imprimirDia("SEXTA", "Circuito Total");
					imprimirExercicio("Thrusters", 4, "20", "30s");
					imprimirExercicio("Corda", 4, "1 min", "30s");
					break;

				default:
					System.out.println("Opção inválida. Reinicie o sistema.");
			}

		}

	    private void mostrarCabecalho(String titulo, String subtitulo) {
	        System.out.println("╔═════════════════════════════════════════════════╗");
	        System.out.println("  OBJETIVO: " + titulo);
	        System.out.println("  META: " + subtitulo + " | PRAZO: " + duracaoSemanas + " Semanas");
	        System.out.println("╚═════════════════════════════════════════════════╝");
	    }

	    private void imprimirDia(String dia, String foco) {
	        System.out.println("\n " + dia + " | Foco: " + foco);
	        System.out.println("---------------------------------------------------");
	        System.out.printf("%-22s | %-5s | %-10s | %-8s %n", "MOVIMENTO", "SETS", "REPS", "REST");
	    }

	    private void imprimirExercicio(String nome, int series, String reps, String descanso) {
	        System.out.printf(" %-19s | %-5d | %-10s | %-8s %n", nome, series, reps, descanso);
	    }
}
