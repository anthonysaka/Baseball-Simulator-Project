package backEnd;

import java.io.Serializable;

public class BoxScore implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8278254992666283578L;
	private String  equipoLocal;
	private String  equipoVisitante;
	private String  inning1H;
	private String  inning1V;
	private String  inning2H;
	private String  inning2V;
	private String  inning3H;
	private String  inning3V;
	private String  inning4H;
	private String  inning4V;
	private String  inning5H;
	private String  inning5V;
	private String  inning6H;
	private String  inning6V;
	private String  inning7H;
	private String  inning7V;
	private String  inning8H;
	private String  inning8V;
	private String  inning9H;
	private String  inning9V;
	private String  carreraH;
	private String  carreraV;
	private String  erroresH;
	private String  erroresV;
	private String  hitH;
	private String  hitV;
	
	
	
	
	public BoxScore(String equipoLocal, String equipoVisitante, String  inning1h, String  inning1v, String  inning2h, String  inning2v,
			String inning3h, String inning3v, String  inning4h, String inning4v, String  inning5h, String  inning5v, String  inning6h,
			String  inning6v, String inning7h, String  inning7v, String  inning8h, String  inning8v, String inning9h, String  inning9v,
			String carreraH, String  carreraV, String  erroresH, String  erroresV, String  hitH, String hitV) {
		super();
		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVisitante;
		inning1H = inning1h;
		inning1V = inning1v;
		inning2H = inning2h;
		inning2V = inning2v;
		inning3H = inning3h;
		inning3V = inning3v;
		inning4H = inning4h;
		inning4V = inning4v;
		inning5H = inning5h;
		inning5V = inning5v;
		inning6H = inning6h;
		inning6V = inning6v;
		inning7H = inning7h;
		inning7V = inning7v;
		inning8H = inning8h;
		inning8V = inning8v;
		inning9H = inning9h;
		inning9V = inning9v;
		this.carreraH = carreraH;
		this.carreraV = carreraV;
		this.erroresH = erroresH;
		this.erroresV = erroresV;
		this.hitH = hitH;
		this.hitV = hitV;
	}




	public String getEquipoLocal() {
		return equipoLocal;
	}




	public String getEquipoVisitante() {
		return equipoVisitante;
	}




	public String getInning1H() {
		return inning1H;
	}




	public String getInning1V() {
		return inning1V;
	}




	public String getInning2H() {
		return inning2H;
	}




	public String getInning2V() {
		return inning2V;
	}




	public String getInning3H() {
		return inning3H;
	}




	public String getInning3V() {
		return inning3V;
	}




	public String getInning4H() {
		return inning4H;
	}




	public String getInning4V() {
		return inning4V;
	}




	public String getInning5H() {
		return inning5H;
	}




	public String getInning5V() {
		return inning5V;
	}




	public String getInning6H() {
		return inning6H;
	}




	public String getInning6V() {
		return inning6V;
	}




	public String getInning7H() {
		return inning7H;
	}




	public String getInning7V() {
		return inning7V;
	}




	public String getInning8H() {
		return inning8H;
	}




	public String getInning8V() {
		return inning8V;
	}




	public String getInning9H() {
		return inning9H;
	}




	public String getInning9V() {
		return inning9V;
	}




	public String getCarreraH() {
		return carreraH;
	}




	public String getCarreraV() {
		return carreraV;
	}




	public String getErroresH() {
		return erroresH;
	}




	public String getErroresV() {
		return erroresV;
	}




	public String getHitH() {
		return hitH;
	}




	public String getHitV() {
		return hitV;
	}




	public void setEquipoLocal(String equipoLocal) {
		this.equipoLocal = equipoLocal;
	}




	public void setEquipoVisitante(String equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}




	public void setInning1H(String inning1h) {
		inning1H = inning1h;
	}




	public void setInning1V(String inning1v) {
		inning1V = inning1v;
	}




	public void setInning2H(String inning2h) {
		inning2H = inning2h;
	}




	public void setInning2V(String inning2v) {
		inning2V = inning2v;
	}




	public void setInning3H(String inning3h) {
		inning3H = inning3h;
	}




	public void setInning3V(String inning3v) {
		inning3V = inning3v;
	}




	public void setInning4H(String inning4h) {
		inning4H = inning4h;
	}




	public void setInning4V(String inning4v) {
		inning4V = inning4v;
	}




	public void setInning5H(String inning5h) {
		inning5H = inning5h;
	}




	public void setInning5V(String inning5v) {
		inning5V = inning5v;
	}




	public void setInning6H(String inning6h) {
		inning6H = inning6h;
	}




	public void setInning6V(String inning6v) {
		inning6V = inning6v;
	}




	public void setInning7H(String inning7h) {
		inning7H = inning7h;
	}




	public void setInning7V(String inning7v) {
		inning7V = inning7v;
	}




	public void setInning8H(String inning8h) {
		inning8H = inning8h;
	}




	public void setInning8V(String inning8v) {
		inning8V = inning8v;
	}




	public void setInning9H(String inning9h) {
		inning9H = inning9h;
	}




	public void setInning9V(String inning9v) {
		inning9V = inning9v;
	}




	public void setCarreraH(String carreraH) {
		this.carreraH = carreraH;
	}




	public void setCarreraV(String carreraV) {
		this.carreraV = carreraV;
	}




	public void setErroresH(String erroresH) {
		this.erroresH = erroresH;
	}




	public void setErroresV(String erroresV) {
		this.erroresV = erroresV;
	}




	public void setHitH(String hitH) {
		this.hitH = hitH;
	}




	public void setHitV(String hitV) {
		this.hitV = hitV;
	}



	
	
	

}