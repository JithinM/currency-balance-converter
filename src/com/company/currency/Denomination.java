package com.company.currency;

/**
 * @author Jithin
 *
 */
public class Denomination {

	private String name;
	
	private int value;
	
	/**
	 * @param name
	 * @param value
	 */
	public Denomination(String name, int value) {
		super();
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
}
