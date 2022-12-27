package poo;

public class Jefe extends Empleado implements IJefes
{
	private double incentivo;
	
    	 public Jefe(String nombre, double sueldo,int dia,int mes,int anno)
    	 {
    		 super(nombre, sueldo, dia,mes,anno);
    	 }
    	 
    	 public void EstablecerIncentivo(double valor)
    	 {
    		 incentivo=valor;
    	 }
    	 
    	 public double Sueldo()
    	 {
    		 double sueldoJefe= super.Sueldo();
    		 return sueldoJefe + incentivo;
    	 }

		public String TomarDecisiones(String decision)
		{
		    	return "Un miembro de la direccion ha tomado la decision de: " + decision;
		}

		@Override
		public double EstableceBonus(double bono)
		{
			double prima=2000; //Suponiendo que los jefes tienen este privilegio
			return bono + ITrabajadores.bono_base + prima;
		}
    	
}
