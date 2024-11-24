import java.util.Scanner;

public class CircuitoResistencias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a resistência R1: ");
        double R1 = scanner.nextDouble();
        System.out.print("Digite a resistência R2: ");
        double R2 = scanner.nextDouble();
        System.out.print("Digite a resistência R3: ");
        double R3 = scanner.nextDouble();
        System.out.print("Digite a resistência R4: ");
        double R4 = scanner.nextDouble();

        double resistenciaEquivalente = R1 + R2 + R3 + R4;
        double maiorResistencia = Math.max(Math.max(R1, R2), Math.max(R3, R4));
        double menorResistencia = Math.min(Math.min(R1, R2), Math.min(R3, R4));

        System.out.println("Resistência equivalente: " + resistenciaEquivalente);
        System.out.println("Maior resistência: " + maiorResistencia);
        System.out.println("Menor resistência: " + menorResistencia);

        scanner.close();
    }
}

