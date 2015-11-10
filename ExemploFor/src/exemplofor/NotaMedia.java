package exemplofor;
//Yasmin
import javax.swing.JOptionPane;

public class NotaMedia {
   int i=0;
   int nota1,nota2,nota3;
   
   public int getNota(){
    return (Integer.parseInt(JOptionPane.showInputDialog("Nota ")));
   }
   
   public void notaMedia(int nota1,int nota2,int nota3){
    JOptionPane.showMessageDialog(null,"Nota media "+((nota1+nota2+nota3)/3));
   }
}