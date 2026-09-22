import javax.swing.JOptionPane;

public class Exercicio13 {
    public static void main(String[] args) {
        int salario, pres;
        salario = Integer.parseInt(JOptionPane.showInputDialog("Digite seu salário bruto: "));
        pres = Integer.parseInt(JOptionPane.showInputDialog("Digite sua prestação bruto: "));

    if ((0.3 * salario) >= pres) {
        System.out.println("Empréstimo pode ser concedido.");
    }
            else {
            System.out.println("Empréstimo não pode ser concedido.");
        }
}
}