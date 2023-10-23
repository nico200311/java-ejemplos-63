package ec.edu.ups.trabajo.uno.principal;
import ec.edu.ups.trabajo.uno.clases.*;
//Importamos la libreria del escaner 
import java.util.Scanner;

public class Principal 
{
	public static void main(String[] args) 
	{
	//Creamos la variable Scanner como una variable de clase
	//Instanciamos como un objeto e inicializamos como input
	System.out.println("Ingresa tu nombre: ");
	Scanner sc = new Scanner(System.in);
	/*Colocamos el tipo de dato que queremos recibir
	a continuacion el nombre del objeto
	String name = sc.nextLine(); -- Como String
	char gender = sc.next().charAt(0); -- Como character
	int age = sc.nextInt(); -- Como int
	double cgpa = sc.nextDouble(); -- Como double*/
	String nombreEscaner = sc.nextLine();
	
		
	Persona personaUno = new Persona();
	personaUno.setNombre("Pedro");
	//personaUno.nombre=("Pedro");
	personaUno.setApellido("Perez");
	//personaUno.apellido=("Perez");
	personaUno.setCedula("0101234567");
	//personaUno.cedula=("0101234567");
	
	EquiposFutbol equipoUno = new EquiposFutbol();
	equipoUno.setNombreEquipo("Deportivo Cuenca");
	//equipoUno.nombreEquipo=("Deportivo Cuenca");
	equipoUno.setIntegrantesTotales(50);
	//equipoUno.integrantesTotales=(50);
	
	Estadio estadioUno = new Estadio();
	estadioUno.setNombreEstadio("Estadio Alejandro Serrano Aguilar");
	//estadioUno.nombreEstadio=("Estadio Alejandro Serrano Aguilar");
	estadioUno.setAreaEstadio(7140);
	//estadioUno.areaEstadio=(7140);
	estadioUno.setCapacidad(16500);
	//estadioUno.capacidad=(16500);
	
	GanadorPartido ganadorUno = new GanadorPartido();
	ganadorUno.setGolesAnotados(3);
	//ganadorUno.golesAnotados=(3);
	ganadorUno.setNombreGanador("Deportivo Cuenca");
	//ganadorUno.nombreGanador=("Deportivo Cuenca");
	
	Partido partidoUno = new Partido();
	partidoUno.setMinutosJugados(100);
	//partidoUno.minutosJugados=(100);
	partidoUno.setNombreEnfrentamiento("Deportivo Cuenca vs Barcelona");
	//partidoUno.nombreEnfrentamiento=("Deportivo Cuenca vs Barcelona");
	
	PersonalEstadio personalEstadioUno = new PersonalEstadio();
	personalEstadioUno.setCargo("Paramedico");
	//personalEstadioUno.cargo=("Paramedico");
	personalEstadioUno.setCelular("0987654321");
	//personalEstadioUno.celular=("0987654321");
	personalEstadioUno.setSalario(500);
	//personalEstadioUno.salario=(500);
	
	Publico publicoUno = new Publico();
	publicoUno.setPrimeraVisita(true);
	//publicoUno.primeraVisita=(true);
	publicoUno.setProvincia("Azuay");
	//publicoUno.provincia=("Azuay");
	publicoUno.setRecurrencia(1);
	//publicoUno.recurrencia=(1);
	
	Uniforme uniformeUno = new Uniforme();
	uniformeUno.setColor("Azual Marino");
	//uniformeUno.color=("Azul Marino");
	uniformeUno.setMarca("Color Industry");
	//uniformeUno.marca=("Color Industry");
	uniformeUno.setModelo("A200");
	//uniformeUno.modelo=("A200");
	uniformeUno.setPatrocinadores("Nutri");
	//uniformeUno.patrocinadores=("Nutri");
	uniformeUno.setPrecio(105);
	//uniformeUno.precio=(105);
	uniformeUno.setTalla('M');
	//uniformeUno.talla=('M');
	
	//Mostrar datos de Persona 
	System.out.println("Datos de la Persona"+"\nNombre: "+personaUno.getNombre()+"\nApellido: "+personaUno.getApellido()+"\nCedula: "+personaUno.getCedula());
	//Mostrar datos de Equipos de Futbol
	System.out.println("\nDatos del Equipo"+"\nNombre del Equipo: "+equipoUno.getNombreEquipo()+"\nIntegrantes Totales: "+equipoUno.getIntegrantesTotales());
	//Mostrar datos del Estadio
	System.out.println("\nDatos del Estadio"+"\nNombre del Estadio: "+estadioUno.getNombreEstadio()+"\nArea del Estadio: "+estadioUno.getAreaEstadio()+" m2"+"\nCapacidad del Estadio: "+estadioUno.getCapacidad()+" personas");
	//Mostrar datos de el Ganador del Partido
	System.out.println("\nDatos del Ganador del partido"+"\nNombre del Ganador: "+ganadorUno.getNombreGanador()+"\nGoles anotados: "+ganadorUno.getGolesAnotados());
	//Mostrar datos del Partido
	System.out.println("\nDatos del Partido"+"\nNombre de los Equipos: "+partidoUno.getNombreEnfrentamiento()+"\nDuracion del Partido: "+partidoUno.getMinutosJugados()+" minutos");
	//Mostrar datos del Personal del Estadio
	System.out.println("\nDatos del Personal del Estadio"+"\nCargo del Empleado: "+personalEstadioUno.getCargo()+"\nCelular del Empleado: "+personalEstadioUno.getCelular()+"\nSalario del Empleado: "+"$"+personalEstadioUno.getSalario());
	//Mostrar datos del Publico
	System.out.println("\nDatos del Publico"+"\nPrimera vez en el Estadio: "+publicoUno.getPrimeraVisita()+"\nProvincia del Visitante: "+publicoUno.getProvincia()+"\nEsta es su visita numero: "+publicoUno.getRecurrencia());
	//Mostrar datos del Uniforme
	System.out.println("\nDatos del Uniforme"+"\nColor : "+uniformeUno.getColor()+"\nMarca: "+uniformeUno.getMarca()+"\nModelo: "+uniformeUno.getModelo()+"\nPatrocinadores: "+uniformeUno.getPatrocinadores()+"\nPrecio: "+"$"+uniformeUno.getPrecio()+"\nTalla: "+uniformeUno.getTalla());
	
	System.out.println("Ha ingresado: "+nombreEscaner);
	}
}
//Buscar libreria scanner para ingresar datos por teclado
//Usar la clase Scanner en la principal para pedir los datos
