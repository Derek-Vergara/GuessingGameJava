import java.net.URL;
import javax.swing.*;


public class main {
    public static void main(String[] args){

        Icon failreDim = null;
        Icon winreDim = null;
        // Iconos con URL 
        URL rutaIcono = main.class.getResource("/resources/fail.jpeg");
        if (rutaIcono != null){
            ImageIcon failIcon = new ImageIcon(rutaIcono);

            failreDim = new ImageIcon(failIcon.getImage().getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH));
        }
        URL rutaIcono2 = main.class.getResource("/resources/win.jpg");
        if (rutaIcono2 != null){
            ImageIcon winIcon = new ImageIcon(rutaIcono2);
            winreDim = new ImageIcon(winIcon.getImage().getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH));
        }
		int random = (int)(Math.random()*100+1);
		
        int guess = 0;
        int count = 0;
        

        JOptionPane.showMessageDialog(null, "Debes de adivinar un numero entre 1 y 100"
            ,"Juego de Adivinanza", JOptionPane.INFORMATION_MESSAGE);
        
        while (guess != random){
            //JOptionPane.showMessageDialog(null, "Adivina el numero entre 1 y 100");
            guess = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu numero:"));
            count++;
            if (guess < random){
                JOptionPane.showMessageDialog(null, 
                    "Demasiado pequeño, intenta de nuevo",
                    "Intento Fallido",JOptionPane.PLAIN_MESSAGE,failreDim);
      
            }else if (guess > random){
                JOptionPane.showMessageDialog(null, "Demasiado grande, intenta de nuevo",
                "Intento Fallido",JOptionPane.PLAIN_MESSAGE,failreDim);
            }else
                 {break;}
        }
        JOptionPane.showMessageDialog(null, 
            "Felicidades, adivinaste el numero en " + count + " intentos!",
            "Juego Terminado", JOptionPane.INFORMATION_MESSAGE,winreDim);

}

}
