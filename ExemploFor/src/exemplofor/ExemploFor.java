package exemplofor;
//Yasmin
public class ExemploFor {
    public static void main(String[] args) {
     int nota1,nota2,nota3;
     int i;
       NotaMedia m=new NotaMedia();
       for(i=0;i<30;i++){
       nota1=m.getNota();
       nota2=m.getNota();
       nota3=m.getNota();
       m.notaMedia(nota1,nota2,nota3);
       
       }
    }
    
}
