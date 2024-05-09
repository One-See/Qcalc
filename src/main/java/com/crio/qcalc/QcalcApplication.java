package com.crio.qcalc;


public class QcalcApplication {

	public static void main(String[] args) {

		LogicCalculator logCal = new LogicCalculator();
		logCal.AND(1, 3);
		System.out.println(logCal.getResult());

	}

}
