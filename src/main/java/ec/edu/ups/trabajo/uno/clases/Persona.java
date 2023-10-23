package ec.edu.ups.trabajo.uno.clases;
import java.util.Date;

public class Persona 
{
	private String nombre;
	private String apellido;
	private String cedula;
	private Date fechaNacimiento;
	
	//Proceso de Encapsulamiento
	//No debe tener retorno solo se debe asignarse con (setNombre), colocar los parametros de entrada (String) y el nombre con (nombre)
	public void setNombre (String nombre) 
	{
		//Pasar el nombre del Atributo al nombre del Paramatetro
		this.nombre=nombre;
	}
	
	public String getNombre () 
   	{                          
		return nombre;                    
    }

	
	public void setApellido (String apellido)
	{
		this.apellido=apellido;
	}
	
	public String getApellido ()
	{
		return apellido;
	}
	
	
	public void setCedula (String cedula)
	{
		this.cedula=cedula;
	}
	
	public String getCedula ()
	{
		return cedula;
	}
}
