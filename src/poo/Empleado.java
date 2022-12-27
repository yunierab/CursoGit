package poo;

import java.util.*;

public class Empleado implements ITrabajadores
{
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private int anno;
	private int mes;
	private int dia;
	
     public Empleado(String nombre,double sueldo, int dia,int mes,int anno)
     {
    	 this.nombre=nombre;
    	 this.sueldo=sueldo;
    	 GregorianCalendar fecha=new GregorianCalendar(anno, mes-1,dia);  //Se pone mes-1 pk esta clase trata los meses de 0 a 11
    	 altaContrato=fecha.getTime();
     }
     
     
     //Sobrecarga de constructores (los demas parametros serian por defecto con esos valores)
     
     public Empleado(String nombre)
     {
    	 this(nombre, 30000, 1,1,2000);   //Con esto se llama al otro constructor
     }
     
     public String Nombre()
     {
    	 return nombre;
     }
     
     public double Sueldo()
     {
    	 return sueldo;
     }
     
     public int AnnoAlta()
     {
    	 return anno;
     }
     
     public int MesAlta()
     {
    	 return mes;
     }
     
     public int DiaAlta()
     {
    	 return dia;
     }
     

	public Date getAltaContrato() 
	{
		return altaContrato;
	}

	public void SubirSueldo(double porcentaje)
     {
    	 sueldo+=(sueldo*porcentaje)/100;
     }


	@Override
	public double EstableceBonus(double bono)
	{
		return bono+ ITrabajadores.bono_base;
	}
}
