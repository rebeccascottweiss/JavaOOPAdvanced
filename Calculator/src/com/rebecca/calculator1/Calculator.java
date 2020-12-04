package com.rebecca.calculator1;

import java.io.Serializable;

public class Calculator implements Serializable {
	private double results; 
	private double operandOne; 
	private double operandTwo; 
	private String operation; 
		
	public void setResults(double results) {
		this.results = results;
	}

	public Calculator() {
		
	}

	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}

	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}


	public void setOperation(String operation) {
		this.operation = operation;
	}; 
	
	
	public void performOperation() {
		if (this.operation == "+") {
			this.setResults(this.operandOne + this.operandTwo);
		} else if (this.operation == "-") {
			this.setResults(this.operandOne - this.operandTwo);
		}; 
	}
	
	public double getResults() {
		return results; 
	}
	
}
