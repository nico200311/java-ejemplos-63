package ec.edu.ups.trabajo.uno.clases;

public class Uniforme 
{
	private String marca;
	private String modelo;
	private String patrocinadores;
	private int precio;
	private char talla;
	private String color;
	
	public void setMarca (String marca)
	{
		this.marca=marca;
	}
	public String getMarca()
	{
		return marca;
	}
	
	
	public void setModelo (String modelo)
	{
		this.modelo=modelo;
	}
	public String getModelo ()
	{
		return modelo;
	}
	
	
	public void setPatrocinadores (String patrocinadores)
	{
		this.patrocinadores=patrocinadores;
	}
	public String getPatrocinadores()
	{
		return patrocinadores;
	}
	
	
	public void setPrecio (int precio)
	{
		this.precio=precio;
	}
	public int getPrecio()
	{
		return precio;
	}
	
	
	public void setTalla (char talla)
	{
		this.talla=talla;
	}
	public char getTalla()
	{
		return talla;
	}	
	
	public void setColor (String color)
	{
		this.color=color;
	}
	public String getColor()
	{
		return color;
	}
}
