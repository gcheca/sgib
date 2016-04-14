
/**
 * Clase genérica artículos Biblioteca
 * 
 * @author Guillermo Checa 
 * @version 0.1.2 14/04/2016
 */

public class Articulo
{
    // Atributos
        private String identificador;
        private String nombreart;
        private String tipoart;
        private int anno;
        private boolean prestado;
        private Fechareal fechadevolucion;
       //private boolean disponibilidad;
       //No recuerdo para que era la disponibilidad   

       //Constructor

       public String toString(){
    String s="Articulo: ";
            s=s.concat(this.identificador+", ");
            s=s.concat(this.nombreart+", ");
            s=s.concat(this.tipoart+", ");
            s=s.concat(this.anno+", ");
            s=s.concat(this.prestado+", ");
            s=s.concat(this.fechadevolucion+", ");
            //s=s.concat(this.disponibilidad".\n");
            return s;
        }
        //Constructor por parámetros
        public Articulo (String identificador, String nombreart, String tipoart, int anno, boolean prestado, Fechareal fechadevolucion)
        {
            this.identificador=identificador;
            this.nombreart=nombreart;
            this.tipoart=tipoart;
            this.anno=anno;
            this.prestado=prestado;
            this.fechadevolucion=fechadevolucion;
        }
    
        //Constructor default
        public Articulo()
        {
            this.identificador=new String("000000");
            this.nombreart=new String("Articulo");
            this.tipoart=new String("Generico");
            this.anno=2016;
            this.prestado=false;
            this.fechadevolucion=new Fechareal(31,12,2016);
        }
        
    //Establecer identificador
     public String Getidentificador()
        {
            return identificador;
        }
     //Set identificador
     public void setidentificador(String identificador){
        this.identificador=identificador;
        }   
     
    //Establecer nombreart
     public String Getnombreart()
        {
            return nombreart;
        }
     //Set nombreart
     public void setnombreart(String nombreart){
        this.nombreart=nombreart;
        }       
     
         //Establecer tipoart
     public String tipoart()
        {
            return tipoart;
        }
     //Set tipoart
     public void tipoart(String tipoart){
        this.tipoart=tipoart;
        }   
        
        //Establecer anno
     public int Getanno()
        {
            return anno;
        }
     //Set identificador
     public void setanno(int anno){
        this.anno=anno;
        }   
        
        //Establecer prestado
     public boolean Getprestado()
        {
            return prestado;
        }
     //Set nombreart
     public void setprestado(boolean prestado){
        this.prestado=prestado;
        }    
        
        //Establecer fechadevolucion
     public Fechareal Getfechadevolucion()
        {
            return fechadevolucion;
        }
     //Set identificador
     public void setfechadevolucion(Fechareal fechadevolucion){
        this.fechadevolucion=fechadevolucion;
        }   
        
        
        /*
         *  Posibles métodos:
         *                      CreaId
         *                      DimeNombre
         *                      DimeAnno
         *                      DimeTipo
         *                      EstaPrestado
         *                      Fechadev
         *                      EstaDisponible
        */

}
