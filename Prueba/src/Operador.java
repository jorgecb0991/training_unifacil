import java.util.List;

public class Operador {

	private String nombreEmpresa;
	private List<Plan> planes;

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public List<Plan> getPlanes() {
		return planes;
	}

	public void setPlanes(List<Plan> planes) {
		this.planes = planes;
	}

}
