package com.company.currency;

import java.util.List;

public interface Currency {

	/**
	 * Gets the list of possible denominations
	 * @return List of Denomination
	 */
	List<Denomination> getDenominations();
	

}
