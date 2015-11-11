package exemplowhile;
//Yasmin
import javax.swing.JOptionPane;
public class ExemploWhile {
    
    public static void main(String[] args) {
        
        int nota1,nota2,nota3;
        int i=0; 
        int numAlumnos = Integer.parseInt(JOptionPane.showInputDialog(null,"Número de alumnos: "));
       
       NotaMedia m=new NotaMedia();
       while(i<numAlumnos){
       nota1=m.getNota();
       nota2=m.getNota();
       nota3=m.getNota();
       m.notaMedia(nota1,nota2,nota3);
       i++;
       }
    }
    
}
