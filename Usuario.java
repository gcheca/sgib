/**
 * clase Usuario
 * 
 * @author Gcheca
 * @version 0.1.2 14/04/2016
 */
    /* Constructor for objects of class Usuario  */
    public class Usuario
    {
        private String Nombre;
        private String Apellido;
        //DNI Será String ya que no realizaremos ninguna operación aritmética y puede incluir letra.
        private String DNI;   
        private boolean Empleado;
        private boolean Multa;
        private Fechareal Fechaalta;

        public String toString(){
            String s="Usuario: ";
            s=s.concat(this.Nombre+", ");
            s=s.concat(this.Apellido+", ");
            s=s.concat(this.DNI+", ");
            s=s.concat(this.Empleado+", ");
            s=s.concat(this.Multa+", ");
            s=s.concat(this.Fechaalta+".\n");
            return s;
        }
        //Constructor por parámetros
        public Usuario (String Nombre, String Apellido, String DNI, boolean Empleado, boolean Multa, Fechareal Fechaalta)
        {
            this.Nombre=Nombre;
            this.Apellido=Apellido;
            this.DNI=DNI;
            this.Empleado=Empleado;
            this.Multa=Multa;
            this.Fechaalta=Fechaalta;
        }
    
        //Constructor default
        public Usuario()
        {
            this.Nombre=new String("Name");
            this.Apellido=new String("Surname");
            this.DNI=new String("xxxxxxxxX");
            this.Empleado=false;
            this.Multa=false;
            this.Fechaalta=new Fechareal(01,01,2016);
        }
     
     //Metodos
     
     //Establecer nombre
     public String GetNombre()
        {
            return Nombre;
        }
     //Set Nombre
     public void setNombre(String Nombre){
        this.Nombre=Nombre;
        }
        
     //Establecer Apellido
     public String GetApellido()
        {
            return Apellido;
        }
     //Set Apellido
     public void setApellido(String Apellido){
        this.Apellido=Apellido;
        }
        
     //Establecer DNI
     public String GetDNI()
        {
            return DNI;
        }
     //Set DNI
     public void setDNI(String DNI){
        this.DNI=DNI;
        }
        
     //Establecer si es o no es Empleado
      public boolean GetEmpleado()
     {
        return Empleado;
     }
     // Set Empleado
     public void setEmpleado(boolean Empleado){
        this.Empleado=Empleado;
        }
     
     //Establecer si tiene o no Multa
     public boolean Getmulta()
     {
        return Multa;
     }
     //Set Multa
     public void setMulta(boolean Multa)
     {
         this.Multa=Multa;
     }
     
     //Establecer la fecha de alta del usuario
     public Fechareal GetFechaalta()
        {
            return Fechaalta;
        }
     //Set Fecha Alta
     public void setFechaAlta(Fechareal FechaAlta)
     {
         this.Fechaalta=Fechaalta;
     }
     
          public void SetDNI(String DNI)
          {
              char pl = DNI.charAt(0);
                if(pl>='A' && pl<='Z' )
                {
                    this.DNI = DNI;
                }
              this.DNI = new String("ERRONEO");
        }
    }//fin clase Usuario

