package danieljuarez_lab8p2;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class Barra extends Thread {

    public JProgressBar Barra;
    public boolean Cambio;
    public boolean Vivo;
    public int Decrease;

    public Barra() {
    }

    public Barra(JProgressBar Barra, boolean Cambio, boolean Vivo, int Decrease) {
        this.Barra = Barra;
        this.Cambio = Cambio;
        this.Vivo = Vivo;
        this.Decrease = Decrease;
    }

    public JProgressBar getBarra() {
        return Barra;
    }

    public void setBarra(JProgressBar Barra) {
        this.Barra = Barra;
    }

    public boolean isCambio() {
        return Cambio;
    }

    public void setCambio(boolean Cambio) {
        this.Cambio = Cambio;
    }

    public boolean isVivo() {
        return Vivo;
    }

    public void setVivo(boolean alive) {
        this.Vivo = alive;
    }

    public int getDecrease() {
        return Decrease;
    }

    public void setDecrease(int Decrease) {
        this.Decrease = Decrease;
    }

    @Override
    public void run() {
        while (Cambio) {
            Barra.setValue(Barra.getValue() - Decrease);
            if (Barra.getValue() == 0) {
                JOptionPane.showMessageDialog(null, "Su Mascota Ha Fallecido", "Pet", JOptionPane.PLAIN_MESSAGE);
                Vivo = false;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
    }

}
