public class Carta {
private String valore;
private String seme;

public Carta(String valore, String seme){             // Costruttore
      this.valore = valore;
      this.seme = seme;

}

   public boolean confronta(String valore, String seme){      // Metodo
         if(this.valore == valore && this.seme == seme){
            return true ;
         }else{
            return false;
         }
   }     

//! testare la classe che potremmo inserire anche in un altro file e richiamare il tutto 
//! sempre ricordando che devono essere nello stesso package

   public static void main(String[] args) {       // main princiaple per testare la classe
     Carta carta = new Carta("Asso", "Cuori");
    

     boolean paper = carta.confronta("Asso", "Cuori");

     boolean paperTwo = carta.confronta("Re", "Cuori");

     System.out.println(paper);
     System.out.println(paperTwo);


    
   }

}
