/**
 * class Usuario
 * 
 * @author Gcheca
 * @version 0.1.1 12/04/2016
 */
    /* Constructor for objects of class Usuario  */
    public class Usuario
    {
        private String Nombre;
        private String Apellido;
        //DNI String o integer?
        private String DNI;
        private boolean Empleado;
        private boolean Multa;
        private Fechareal Fechaalta;

        //Constructor con Atributos
        public Usuario (String Nombre, String Apellido, String DNI, boolean Empleado, boolean Multa, Fechareal Fechaalta)
        {
        	this.Nombre=Nombre;
        	this.Apellido=Apellido;
        	this.DNI=DNI;
        	this.Empleado=Empleado;
        	this.Multa=Multa;
        	this.Fechaalta=Fechaalta;
        }
	
	//Constructor con Atributos asignados
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
     	public String GetNombre()
     	{
     		return Nombre;
     	}
// Posibles métodos:
/*
	DameNombre
	DameApellido
	DameDNI
	EsEmpleado
	TieneMulta
	Fechaalta
	DameID
*/

    	
}
    
    //fin clase Usuario
 
