import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Calculadora{

    public static void main (String args[]){

        double altura, peso, imc;

        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua Altura: "));
        peso   = Double.parseDouble(JOptionPane.showInputDialog("Digite sua Peso: "));

        imc = peso / (altura * altura);

        DecimalFormat decimal = new DecimalFormat("0.00");

        String valorFormatado = decimal.format(imc);


        JOptionPane.showMessageDialog(null, "IMC = " +valorFormatado);

    }
}