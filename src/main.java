import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;


public class main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
		
		int random = (int)(Math.random()*100+1);
		System.out.println("Numero secreto: " + random);
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
                    "Demasiado pequeño, intenta de nuevo");
      
            }else if (guess > random){
                JOptionPane.showMessageDialog(null, "Demasiado grande, intenta de nuevo");
            }else {break;}
        }
        JOptionPane.showMessageDialog(null, "Felicidades, adivinaste el numero en " + count + " intentos!");

}

}
