package ec.edu.ups.trabajo.uno.clases;

public class GanadorPartido 
{
	private String nombreGanador;
	public int golesAnotados;
	
	public void setNombreGanador (String nombreGanador)
	{
		this.nombreGanador=nombreGanador;
	}
	public String getNombreGanador ()
	{
		return nombreGanador;
	}
	
	public void setGolesAnotados (int golesAnotados)
	{
		this.golesAnotados=golesAnotados;
	}
	public int getGolesAnotados ()
	{
		return golesAnotados;
	}
}
