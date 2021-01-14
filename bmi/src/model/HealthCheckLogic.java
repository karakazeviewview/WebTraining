package model;

/**
 * Servlet implementation class HealthCheckLogic
 */
public class HealthCheckLogic {
public void excute(Health health) {
	double weight=health.getWeight();
	double height=health.getHeight();
	double bmi=weight/(height/100.0*height/100.0);
	health.setBmi(bmi);

	//BMI指数から体型を判定して設定
	String bodyType;
	if(bmi<18.5) {
		bodyType="痩せ型";
	}else if(bmi<25){
		bodyType="普通";
	}else {
		bodyType="肥満";
	}
	health.setBodyType(bodyType);
	}
}

