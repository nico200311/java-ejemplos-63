package ec.edu.ups.trabajo.uno.clases;

public class Publico 
{
	private boolean primeraVisita;
	private String provincia;
	private int recurrencia;
	
	public void setPrimeraVisita(boolean primeraVisita)
	{
		this.primeraVisita=primeraVisita;
	}
	public boolean getPrimeraVisita()
	{
		return primeraVisita;
	}
	
	
	public void setProvincia(String provincia)
	{
		this.provincia=provincia;
	}
	public String getProvincia()
	{
		return provincia;
	}
	
	
	public void setRecurrencia(int recurrencia)
	{
		this.recurrencia=recurrencia;
	}
	public int getRecurrencia()
	{
		return recurrencia;
	}
}
