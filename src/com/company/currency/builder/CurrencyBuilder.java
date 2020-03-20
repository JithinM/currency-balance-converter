package com.company.currency.builder;

import java.util.List;

import com.company.common.CurrencyType;
import com.company.currency.Currency;
import com.company.currency.Denomination;
import com.company.currency.UsDollarCurrency;
import com.company.repository.CurrencyRepository;

public class CurrencyBuilder {

	/**
	 * Gets the currency based on the type passed
	 * 
	 * @param type CurrencyType
	 * @return Currency
	 */
	public static Currency getCurrency(CurrencyType type) {

		Currency currency = null;

		if (null != type) {

			switch (type) {

			case USD:

				CurrencyRepository repo = new CurrencyRepository();
				List<Denomination> denom = repo.getUsDollarDenominations();
				currency = new UsDollarCurrency(denom);
				break;

			default:

				System.out.println("Unkonw CurrencyType " + type);
			}

		}

		return currency;
	}

}
