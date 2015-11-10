package exemplowhile;
//Yasmin
public class ExemploWhile {
    public static void main(String[] args) {
        int nota1,nota2,nota3;
        int i=0;
       NotaMedia m=new NotaMedia();
       while(i<30){
       nota1=m.getNota();
       nota2=m.getNota();
       nota3=m.getNota();
       m.notaMedia(nota1,nota2,nota3);
       i++;
       }
    }
    
}