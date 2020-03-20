package com.company.currency;

import java.util.List;

/**
 * Represents the US Dollar currency
 * @author Jithin
 *
 */
public class UsDollarCurrency implements Currency{


	private final List<Denomination> denominations ;

	
	/**
	 * @param denominations
	 */
	public UsDollarCurrency(List<Denomination> denominations) {
		super();
		this.denominations = denominations;
	}
	

	@Override
	public List<Denomination> getDenominations() {
		
		return denominations;
	}
	
}
