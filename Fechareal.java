
/**
 * Clase para la Fecha
 * 
 * @author Guillermo Checa 
 * @version 0.1 6/4/16
 */
public class Fechareal
{
    //Atributos de Fecha
    private int Diaf;
    private int Mesf;
    private int Annof;
    
    Fechareal(int Diaf, int Mesf, int Annof){
        //Establece año minimo
        if(Annof<1700){
            Annof=1700;
            System.out.println("Año Mal");
        }
        //Establece mes mínimo
        if (Mesf<1){
            Mesf=1;
            System.out.println("Mes Mal");
        }
        //Da error al introducir mes mal
        if (Mesf>12){
            Mesf=1;
            System.out.println("Mes Mal");
        }
        
        if(Diaf<1){
            Diaf=1;
            System.out.println("Dia Mal");
        }
        
        if(Mesf!=2){
            if(Diaf>28){
            Diaf=28;
            System.out.println("Dia Mal");
        }
        }
        //Año bisiesto
        
        if (Mesf==2){
            if (esbisiesto(Annof)){
                if(Diaf>29){
                    Diaf=29;
                    System.out.println("Dia Mal");
                }
            }
            else{
               if(Diaf>28){
                   Diaf=28;
                   System.out.println("Dia Mal");
                }
            }
        }
                
        //Introduce fecha
        this.Diaf=Diaf;
        this.Mesf=Mesf;
        this.Annof=Annof;
    }

//Cadena toString
public String toString(){
    String s="[";
    s=s+Diaf+"-";
    s=s+Mesf+"-";
    s=s+Annof+"]";
    return s;
}

//Formula para sacar año bisiesto
private boolean esbisiesto(int anio){
if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
	return true;
else
	return false;
}

}
