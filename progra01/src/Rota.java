import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Rota {

    public void planejarDia() {        
        int numRotas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de rotas:"));
        double totalKm = 0;
        for (int i = 0; i < numRotas; i++) {
            double km = Double.parseDouble(JOptionPane.showInputDialog("Digite a km da rota " + (i + 1) + ":"));
            totalKm += km;
        }
        double consumoMedio = 2.5;
        double totalLitros = totalKm / consumoMedio;
        double valorLitro = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do litro do óleo diesel:"));
        double valorTotal = totalLitros * valorLitro;

        NumberFormat nf = NumberFormat.getCurrencyInstance();
        DecimalFormat df = new DecimalFormat("#.00");

        JOptionPane.showMessageDialog(null, "Total de km: " + totalKm + "\nTotal de litros: " + df.format(totalLitros) + "\nValor total: " + nf.format(valorTotal));
    }
}
