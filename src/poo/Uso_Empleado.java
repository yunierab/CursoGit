package poo;

import javax.swing.JOptionPane;

public class Uso_Empleado {

	public static void main(String[] args) 
	{
		//................Mostrar datos del empleado.......................//
		
		String nombre= JOptionPane.showInputDialog("Escriba el nombre del empleado");
		double sueldo= Double.parseDouble(JOptionPane.showInputDialog("Escriba el sueldo del empleado"));
	    int annoAlta= Integer.parseInt(JOptionPane.showInputDialog("Escriba el año de alta del empleado"));
	    int mesAlta= Integer.parseInt(JOptionPane.showInputDialog("Escriba el mes de alta del empleado"));
	    int diaAlta= Integer.parseInt(JOptionPane.showInputDialog("Escriba el dia de alta del empleado"));
	    
        Empleado emp=new Empleado(nombre,sueldo,diaAlta,mesAlta,annoAlta);
        Empleado emp1=new Empleado("Yunier");
        
        System.out.println("Datos del empleado...");
        System.out.println("Nombre del empleado: " + emp.Nombre() + "\n" + "Sueldo del empleado: " + emp.Sueldo() + " pesos" + "\n" + "Fecha de Alta: " + emp.getAltaContrato());
        System.out.println("Nombre del empleado: " + emp1.Nombre() + "\n" + "Sueldo del empleado: " + emp1.Sueldo() + " pesos" + "\n" + "Fecha de Alta: " + emp1.getAltaContrato());

        
        //................Subir sueldo del empleado.......................//
        
        System.out.println("Subir sueldo del empleado...");
		double porciento= Double.parseDouble(JOptionPane.showInputDialog("Escriba el porciento a subir"));
		emp.SubirSueldo(porciento);
        System.out.println("El nuevo sueldo del empleado es de " + emp.Sueldo()+ " pesos");  
        
        //Creacion de un objeto jefe
        Jefe jefe1=new Jefe("Yunia", 2000, 17, 01, 1994);
        System.out.println(jefe1.TomarDecisiones("Hay que cerrar las ventanas al culminar la jornada laboral"));
        
        //Para conocer el bonus del trabajador
        System.out.println("El salario del trabajador luego de aplicarle el bonus es de " + jefe1.EstableceBonus(3000) + " pesos");
        
	}

}
