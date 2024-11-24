# Circuito de Resistências

Este programa calcula a resistência equivalente de um circuito com quatro resistores, além de determinar a maior e a menor resistência entre os componentes.

## Como Usar

1. O programa solicita as seguintes informações:
   - Resistência **R1**.
   - Resistência **R2**.
   - Resistência **R3**.
   - Resistência **R4**.

2. O programa realiza os seguintes cálculos:
   - **Resistência equivalente**: Soma das resistências \( R1 + R2 + R3 + R4 \).
   - **Maior resistência**: A maior resistência entre as quatro.
   - **Menor resistência**: A menor resistência entre as quatro.

3. O programa exibe os resultados.

## Como Executar

### Passos

1. **Crie um arquivo Java** com o código abaixo:

   ```java
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

           double resistenciaEquivalente = R1 + R2 + R3 + + R4;
           double maiorResistencia = Math.max(Math.max(R1, R2), Math.max(R3, R4));
           double menorResistencia = Math.min(Math.min(R1, R2), Math.min(R3, R4));

           System.out.println("Resistência equivalente: " + resistenciaEquivalente);
           System.out.println("Maior resistência: " + maiorResistencia);
           System.out.println("Menor resistência: " + menorResistencia);

           scanner.close();
       }
   }


2. **Compile o código:**

javac CircuitoResistencias.java

3. **Execute o programa:**

java CircuitoResistencias