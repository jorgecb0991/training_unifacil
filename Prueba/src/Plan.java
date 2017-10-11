public class Plan {

	private String nombre;
	private String precio;
	private String minutos;
	private String rpc;
	private String internet;
	private String codigo;
	private String sms;

	public Plan() {

	}

	public Plan(String nombre, String precio, String minutos, String rpc,
			String internet, String codigo, String sms) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.minutos = minutos;
		this.rpc = rpc;
		this.internet = internet;
		this.codigo = codigo;
		this.sms = sms;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getMinutos() {
		return minutos;
	}

	public void setMinutos(String minutos) {
		this.minutos = minutos;
	}

	public String getRpc() {
		return rpc;
	}

	public void setRpc(String rpc) {
		this.rpc = rpc;
	}

	public String getInternet() {
		return internet;
	}

	public void setInternet(String internet) {
		this.internet = internet;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getSms() {
		return sms;
	}

	public void setSms(String sms) {
		this.sms = sms;
	}

}
