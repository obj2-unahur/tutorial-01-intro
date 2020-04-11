public class Mago {
   private String nombre;
   private char sexo;
   private int ataque;
   private int vida;

   public Mago(String nombre, char sexo) {
      this.nombre = nombre;
      this.sexo = sexo;
   }

   public Mago(String nombre, char sexo, int ataque, int vida) {
      this.nombre = nombre;
      this.sexo = sexo;
      this.setAtaque(ataque);
      this.vida = vida;
   }



   public String getNombre() {
      return nombre;
   }

   public char getSexo() {
      return sexo;

   }

   public int getAtaque() {
      return ataque;
   }

   public void setAtaque(int ataque) {
      if(ataque > 100)
         throw new IllegalArgumentException("no podes ser tan poderoso");
      this.ataque = ataque;
   }

   public int getVida() {
      return vida;
   }

   public void setVida(int vida) {
      this.vida = vida;
   }

   public String presentarse() {
      return "Hago magia y me llamo " + nombre;
   }

   public void sanar(int hierbas) {
      vida += hierbas * 3;
   }

   public void sanar(double aguaBendita) {
      vida += aguaBendita;
   }

}
