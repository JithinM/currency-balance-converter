package com.company.currency;

import java.util.List;

/**
 * Represents the Japanese Yen currency
 * @author Jithin
 *
 */
public class YenCurrency implements Currency {

	private final List<Denomination> denominations;

	/**
	 * @param denominations
	 */
	public YenCurrency(List<Denomination> denominations) {
		super();
		this.denominations = denominations;
	}

	@Override
	public List<Denomination> getDenominations() {
		return denominations;
	}

}