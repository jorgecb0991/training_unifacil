import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		List<TelefonoMovil> listaTelefonoMovil = new ArrayList<TelefonoMovil>();
		TelefonoMovil telefonoSeleccionado = new TelefonoMovil();
		Operador operadorSeleccionado = new Operador();
		Plan planSeleccionado = new Plan();

		TelefonoMovil s7 = new TelefonoMovil();
		s7.setNombre("Samsung S7");
		s7.setCamara("8MP");
		s7.setProcesador("1.4 Ghz");
		s7.setPantalla("4.7");

		TelefonoMovil ip6 = new TelefonoMovil();
		ip6.setNombre("IPhone 6");
		ip6.setCamara("9MP");
		ip6.setProcesador("1.5 Ghz");
		ip6.setPantalla("4.7");

		TelefonoMovil hp8 = new TelefonoMovil();
		hp8.setNombre("Huawei P8");
		hp8.setCamara("10MP");
		hp8.setProcesador("1.6 Ghz");
		hp8.setPantalla("4.7");

		listaTelefonoMovil.add(s7);
		listaTelefonoMovil.add(ip6);
		listaTelefonoMovil.add(hp8);

		Operador claro = new Operador();
		claro.setNombreEmpresa("CLARO");

		Plan max99 = new Plan();
		max99.setNombre("CLARO MAX 99");
		max99.setCodigo("99");
		max99.setInternet("6GB");
		max99.setMinutos("Ilimitado");
		max99.setPrecio("S/. 99");
		max99.setRpc("ilimitado");
		max99.setSms("ilimitado");

		Plan max149 = new Plan();
		max149.setNombre("CLARO MAX 149");
		max149.setCodigo("149");
		max149.setInternet("6GB");
		max149.setMinutos("Ilimitado");
		max149.setPrecio("S/. 99");
		max149.setRpc("ilimitado");
		max149.setSms("ilimitado");

		Plan max189 = new Plan();
		max189.setNombre("CLARO MAX 189");
		max189.setCodigo("189");
		max189.setInternet("6GB");
		max189.setMinutos("Ilimitado");
		max189.setPrecio("S/. 99");
		max189.setRpc("ilimitado");
		max189.setSms("ilimitado");

		List<Plan> planes = new ArrayList<Plan>();
		planes.add(max99);
		planes.add(max149);
		planes.add(max189);
		claro.setPlanes(planes);

		Operador entel = new Operador();
		entel.setNombreEmpresa("ENTEL");

		Plan entel99 = new Plan();
		entel99.setNombre("Entel 99");
		entel99.setCodigo("99");
		entel99.setInternet("6GB");
		entel99.setMinutos("Ilimitado");
		entel99.setPrecio("S/. 99");
		entel99.setRpc("ilimitado");
		entel99.setSms("ilimitado");

		Plan entel149 = new Plan();
		entel149.setNombre("Entel 149");
		entel149.setCodigo("149");
		entel149.setInternet("6GB");
		entel149.setMinutos("Ilimitado");
		entel149.setPrecio("S/. 99");
		entel149.setRpc("ilimitado");
		entel149.setSms("ilimitado");

		Plan entel189 = new Plan();
		entel189.setNombre("Entel  189");
		entel189.setCodigo("189");
		entel189.setInternet("6GB");
		entel189.setMinutos("Ilimitado");
		entel189.setPrecio("S/. 99");
		entel189.setRpc("ilimitado");
		entel189.setSms("ilimitado");

		List<Plan> planesEntel = new ArrayList<Plan>();
		planesEntel.add(entel99);
		planesEntel.add(entel149);
		planesEntel.add(entel189);
		entel.setPlanes(planesEntel);

		Operador movistar = new Operador();
		movistar.setNombreEmpresa("MOVISTAR");

		Plan mov99 = new Plan();
		mov99.setNombre("MOVISTAR 99");
		mov99.setCodigo("99");
		mov99.setInternet("6GB");
		mov99.setMinutos("Ilimitado");
		mov99.setPrecio("S/. 99");
		mov99.setRpc("ilimitado");
		mov99.setSms("ilimitado");

		Plan mov149 = new Plan();
		mov149.setNombre("MOVISTAR 149");
		mov149.setCodigo("149");
		mov149.setInternet("6GB");
		mov149.setMinutos("Ilimitado");
		mov149.setPrecio("S/. 99");
		mov149.setRpc("ilimitado");
		mov149.setSms("ilimitado");

		Plan mov189 = new Plan();
		mov189.setNombre("MOVISTAR 189");
		mov189.setCodigo("189");
		mov189.setInternet("6GB");
		mov189.setMinutos("Ilimitado");
		mov189.setPrecio("S/. 99");
		mov189.setRpc("ilimitado");
		mov189.setSms("ilimitado");

		List<Plan> planesMovistar = new ArrayList<Plan>();
		planesMovistar.add(mov99);
		planesMovistar.add(mov149);
		planesMovistar.add(mov189);
		movistar.setPlanes(planesMovistar);

		System.out.println("EXAMEN PARCIAL");
		System.out.println("================================");
		System.out.println("TELEFONO MOVIL");

		int indice = 0;
		for (char letra = 'A'; letra < 'A' + listaTelefonoMovil.size(); letra++) {
			System.out.printf("%s ) %s \n" ,letra ,listaTelefonoMovil.get(indice).getNombre());
			indice++;
		}
		System.out.println("SELECCIONE MOVIL");

		Scanner sc = new Scanner(System.in);
		String opcion = sc.next();

		System.out.println("CARACTERISTICAS");

		if ("A".equalsIgnoreCase(opcion)) {
			System.out.println("Pantalla :" + s7.getPantalla());
			System.out.println("Camara :" + s7.getCamara());
			System.out.println("Procesador : " + s7.getProcesador());
			telefonoSeleccionado = s7;
		} else if ("B".equalsIgnoreCase(opcion)) {
			System.out.println("Pantalla :" + ip6.getPantalla());
			System.out.println("Camara :" + ip6.getCamara());
			System.out.println("Procesador : " + ip6.getProcesador());
			telefonoSeleccionado = ip6;

		} else if ("C".equalsIgnoreCase(opcion)) {
			System.out.println("Pantalla :" + hp8.getPantalla());
			System.out.println("Camara :" + hp8.getCamara());
			System.out.println("Procesador : " + hp8.getProcesador());
			telefonoSeleccionado = hp8;
		}

		System.out.println("====================");
		
		System.out.println("OPERADORES");
		System.out.println("====================");
		System.out.println("[C]LARO");
		System.out.println("[E]NTEL");
		System.out.println("[M]OVISTAR");

		System.out.println("Seleccion un operador");

		Scanner scn = new Scanner(System.in);
		String opcionOperador = scn.next();

		System.out.println("====================");
		
		System.out.println("PLANES");
		
		System.out.println("====================");

		if ("C".equalsIgnoreCase(opcionOperador)) {
			operadorSeleccionado = claro;
			for (Plan plan : claro.getPlanes()) {
				System.out.println(plan.getNombre());
				System.out.println("Precio:" + plan.getPrecio());
				System.out.println("Minutos:" + plan.getMinutos());
				System.out.println("RPC:" + plan.getRpc());
				System.out.println("Internet:" + plan.getInternet());
				System.out.println("SMS:" + plan.getSms());
			}
		} else if ("E".equalsIgnoreCase(opcionOperador)) {
			operadorSeleccionado = entel;
			for (Plan plan : entel.getPlanes()) {
				System.out.println(plan.getNombre());
				System.out.println("Precio:" + plan.getPrecio());
				System.out.println("Minutos:" + plan.getMinutos());
				System.out.println("RPC:" + plan.getRpc());
				System.out.println("Internet:" + plan.getInternet());
				System.out.println("SMS:" + plan.getSms());
			}

		} else if ("M".equalsIgnoreCase(opcionOperador)) {
			operadorSeleccionado = movistar;
			for (Plan plan : movistar.getPlanes()) {
				System.out.println(plan.getNombre());
				System.out.println("Precio:" + plan.getPrecio());
				System.out.println("Minutos:" + plan.getMinutos());
				System.out.println("RPC:" + plan.getRpc());
				System.out.println("Internet:" + plan.getInternet());
				System.out.println("SMS:" + plan.getSms());
			}
		}
		System.out.println("====================");
		System.out.println("Seleccione plan :");
		Scanner scnp = new Scanner(System.in);
		String opcionPlan = scnp.next();

		List<Plan> listaPlanes = operadorSeleccionado.getPlanes();
		for (Plan plan : listaPlanes) {
			if (opcionPlan.equalsIgnoreCase(plan.getCodigo())) {
				planSeleccionado = plan;
			}
		}
		System.out.println("====================");
		System.out.println("Telefono Escogido : "
				+ telefonoSeleccionado.getNombre());

		System.out.println("CARACTERISTICAS  ");
		System.out.println("Pantalla : " + telefonoSeleccionado.getPantalla());
		System.out.println("Camara : " + telefonoSeleccionado.getCamara());
		System.out.println("Procesador : "
				+ telefonoSeleccionado.getProcesador());

		System.out.println("OPERADOR  ");
		System.out.println("empresa : "
				+ operadorSeleccionado.getNombreEmpresa());

		System.out.println("PLAN  ");
		System.out.println("Nombre : " + planSeleccionado.getNombre());
		System.out.println("Intener : " + planSeleccionado.getInternet());
		System.out.println("Minutos : " + planSeleccionado.getMinutos());
		System.out.println("Sms : " + planSeleccionado.getSms());
		System.out.println("Precio : " + planSeleccionado.getPrecio());
		System.out.println("RPC : " + planSeleccionado.getRpc());

	}
}
