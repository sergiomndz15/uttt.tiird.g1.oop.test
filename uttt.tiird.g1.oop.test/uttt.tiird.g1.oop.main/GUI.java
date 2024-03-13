import javax.swing.JOptionPane;
public class GUI {
    public int solicitarN(){
        int n=Integer.parseInt(JOptionPane.showInputDialog("Coloca valor de n"));
        return n;
    }
    public void mostrarResultado(double fac, int n){
        JOptionPane.showMessageDialog(null, "El factorial de "+n+" es "+fac);
    }
}
