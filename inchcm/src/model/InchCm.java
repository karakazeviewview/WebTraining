package model;

import java.io.Serializable;

public class InchCm implements Serializable{
	private String inch;
	private int cm;
	public InchCm(){}
	public String getInch() {
		return inch;
	}
	public void setInch(String inch) {
		this.inch = inch;
	}
	public int getCm() {
		return cm;
	}
	public void setCm(int cm) {
		this.cm = cm;
	}
}