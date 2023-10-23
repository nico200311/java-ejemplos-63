package ec.edu.ups.trabajo.uno.clases;

public class Partido
{
	private String nombreEnfrentamiento;
	private int minutosJugados;
	
	
	public void setNombreEnfrentamiento (String nombreEnfrentamiento)
	{
		this.nombreEnfrentamiento=nombreEnfrentamiento;
	}
	public String getNombreEnfrentamiento()
	{
		return nombreEnfrentamiento;
	}
	
	
	public void setMinutosJugados (int minutosJugados)
	{
		this.minutosJugados=minutosJugados;
	}
	public int getMinutosJugados()
	{
		return minutosJugados;
	}
}
