package model;

import java.io.Serializable;

import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class healthCheck
 */
@WebServlet("/healthCheck")
public class Health implements Serializable {
	private double height,weight,bmi;
	private String bodyType;

	public double getHeight() {return height;}
	public void setHeight(double height) {this.height=height;}
	public double getWeight() {return weight;}
	public void setWeight(double weight) {this.weight=weight;}
	public void setBmi() {this.bmi=bmi;}
	public double getBmi() {return this.bmi;}
	public void setBodyType(String bodyType) {
		this.bodyType=bodyType;
	}
	public String getBodyType() {
		return this.bodyType;
	}
	public void setBmi(double bmi2) {
		// TODO 自動生成されたメソッド・スタブ

	}
}






