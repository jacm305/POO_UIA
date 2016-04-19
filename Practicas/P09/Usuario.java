class Usuario{
	private String nombre;
	private int telefono;
	private String direccion;
	private String mail;
	private String nickname;
	private int fechaNacimiento;

public Usuario(){
	nombre = null;
	telefono = 0;
	direccion = null;
	mail = null;
	nickname = null;
	fechaNacimiento = 0; 
}

public Usuario(String nom, int tel, String dir, String ml, String nick, int fecha){

	this.nombre = nom;
	this.telefono = tel;
	this.direccion = dir;
	this.mail = ml;
	this.nickname = nick;
	this.fechaNacimiento = fecha;
}

public Usuario (Usuario usr){
	nombre = usr.getNom();
	telefono = usr.getTel();
	direccion = usr.getDir();
	mail = usr.getMl();
	nickname = usr.getNick();
	fechaNacimiento = usr.getFecha();
}

public void setNom(String n){
	nombre = n;
}
public String getNom(){
	return nombre;
}
public void setTel(int t){
	telefono = t;
}
public int getTel(){
	return telefono;
}
public void setDir(String d){
	direccion = d;
}
public String getDir(){
	return direccion;
}
public void setMl(String m){
	mail = m;
}
public String getMl(){
	return mail;
}
public void setNick(String nic){
	nickname = nic;
}
public String getNick(){
	return nickname;
}
public void setFecha(int f){
	fechaNacimiento = f;
}
public int getFecha(){
	return fechaNacimiento;
}
}