import java.util.Scanner;

public class ContagemLetraA {
    public static String contaLetrasA(String s) {
        int count = 0;
        for (char c : s.toLowerCase().toCharArray()) {
            if (c == 'a') {
                count++;
            }
        }
        return "A letra 'a' ocorre " + count + " vezes.";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma string: ");
        String input = scanner.nextLine();
        System.out.println(contaLetrasA(input));
        scanner.close();
    }
}
