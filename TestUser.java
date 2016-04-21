import java.util.Scanner;

public class TestUsuario
{
    public static void main(){
        
    Scanner sc=new Scanner(System.in);
    Usuario[]usuarios=new Usuario[10];
    int nusu=0;
    int opcion;
    
    do{
        System.out.println(" ** Menu ** \n1.Nuevo Usuario \n2.Listar usuarios \n3.Salir");
        opcion=sc.nextInt();
        sc.nextLine();
        switch(opcion)
        {
            case 1:
            System.out.println("Introduce nombre:");
            String n=sc.nextLine();
            System.out.println("introduce apellido:");
            String a=sc.nextLine();
            System.out.println("introduce DNI:");
            String d=sc.nextLine(); 
            System.out.println("Es Empleado? Si o No:");
            //CAGADA AQUI 
            Boolean e=sc.nextLine();
            if(e="Si") 
                {return true;}
                else
                {return false;}
            //meter condicional If esto == true else no
                                   
            System.out.println("Está multado? true=SI false=NO:");
            boolean m=sc.nextLine();  
            System.out.println("Fecha de Nacimiento Dia");
            int dia=sc.nextInt();
            System.out.println("Fecha de Nacimiento Mes");
            int mes=sc.nextInt();
            System.out.println("Fecha de Nacimiento Año");
            int anno=sc.nextInt();
            Fechareal f=new Fechareal(dia, mes, anno);
            usuarios[nusu]=new Usuario(n,a,d,e,m,f);
            nusu++;
            break;
            
            case 2: for(int i=0; i<nusu;i++)
            {
                System.out.println("Usuario: "+usuarios[i]);
            }
            break;
            default:System.out.println("Opción incorrecta");
        }
    }
    while(opcion != 3);
    System.out.println("Adios!");
    /*
    Usuario f1=new Usuario("Guillermo","Checa","47280090w",true,false,new Fechareal(12,04,2016));
    System.out.println(f1.toString() );
    
    Usuario f2=new Usuario("Jaime","XXXX","123456P",true,false,new Fechareal(12,04,2016));
    System.out.println(f2.toString() );
    System.out.println("Modifico apellido a Perez...");
    f2.setApellido("Perez");
    System.out.println(f2.toString() );
    System.out.println("Modifico DNI a 12345...");
    f2.SetDNI("012345");
    System.out.println(f2.toString() );
    
    f2.SetDNI("012345P");
    System.out.println(f2.toString() );
    f2.SetFechare("012345w");
    System.out.println(f2.toString() );
    */
    }
}
