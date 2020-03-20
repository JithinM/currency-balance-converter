package com.company.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import com.company.currency.Currency;
import com.company.currency.CurrencyBalanceImpl;
import com.company.currency.Denomination;
import com.company.service.BalanceConverterService;

/**
 * @author Jithin
 *
 */
public class BalanceConverterServiceImpl implements BalanceConverterService {

	@Override
	public CurrencyBalanceImpl getCurrencyBalance(Currency currency, int amount) {

		HashMap<Integer, Denomination> denomMap = new HashMap<Integer, Denomination>();

		List<Integer> denomValues = new ArrayList<Integer>();

		List<Denomination> denomList = currency.getDenominations();

		for (Denomination denom : denomList) {

			denomValues.add(denom.getValue());
			denomMap.put(denom.getValue(), denom);
		}

		Collections.sort(denomValues, Collections.reverseOrder());

		int balance = amount;
		
		
		CurrencyBalanceImpl currencyBalance = new CurrencyBalanceImpl();

		for (Integer value : denomValues) {

			while (balance >= value) {

				currencyBalance.addDenomination(denomMap.get(value));			

				balance -= value;
			}

		}
		return currencyBalance;

	}
}
