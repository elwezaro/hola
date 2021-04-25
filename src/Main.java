import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jugador [] jugadores = new Jugador [20];
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < jugadores.length; i++) {
			jugadores[i]=new Jugador();
			System.out.println("nombre:");
			jugadores[i].setNombre(sc.nextLine());
			System.out.println("apellidos:");
			jugadores[i].setApellidos(sc.nextLine());
			System.out.println("edad");
			jugadores[i].setEdad(sn.nextInt());
			System.out.println("equipo");
			jugadores[i].setEquipo(sc.nextLine());
			System.out.println("direccion");
			jugadores[i].setDireccion(sc.nextLine());
			System.out.println("app");
			jugadores[i].setApp(sn.nextInt());
			System.out.println("fpp");
			jugadores[i].setFpp(sn.nextInt());
			System.out.println("mpp");
			jugadores[i].setMpp(sn.nextInt());
			System.out.println("perpp");
			jugadores[i].setPerpp(sn.nextInt());
			System.out.println("hijos");
			jugadores[i].setnHijos(sn.nextInt());
			System.out.println("ppp");
			jugadores[i].setPpp(sn.nextInt());
			System.out.println("rpp");
			jugadores[i].setRpp(sn.nextInt());
			System.out.println("tpp");
			jugadores[i].setTpp(sn.nextInt());
			System.out.println("provincia");
			jugadores[i].setProvincia(sc.nextLine());
		}
		int opc=0;
		do {
			System.out.println("1. Muestra en pantalla un listado con los datos de todos los jugadores.\r\n" + 
					"2. Buscar Jugador. Solicita al usuario el nombre del jugador y muestra sus datos en pantalla.\\r\\n\" +"
					+ "3.salir");
			opc=sn.nextInt();
			switch (opc) {
			case 1:
			for (int i = 0; i < jugadores.length; i++) {
				System.out.println(Main.mostrarDatos(jugadores[i]));
			}	
				break;
			case 2:
				String jugador="";
				System.out.println("introduce jugador");
				jugador=sc.nextLine();
				for (int i = 0; i < jugadores.length; i++) {
					if(jugadores[i].getNombre().equalsIgnoreCase(jugador)) {
					System.out.println(Main.mostrarDatos(jugadores[i]));
					}
				}
				break;
			case 3:
				opc=3;
				break;
				
			default:
				System.out.println("demasiado grande");
				break;
			}
		} while (opc!=3);
	}
	static String mostrarDatos(Jugador jugon) {
		String datos="";
		datos=jugon.getNombre()+" "+jugon.getApellidos()+" con "+jugon.getEdad()+" años y direccion en "+jugon.getDireccion()+", jugador de "+jugon.getEquipo()+" y con "+jugon.getnHijos()+" hijos";
		return datos;
	}
}
