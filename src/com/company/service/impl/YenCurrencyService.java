package com.company.service.impl;

import com.company.common.CurrencyType;
import com.company.currency.Currency;
import com.company.currency.CurrencyBalance;
import com.company.currency.builder.CurrencyBuilder;
import com.company.service.BalanceConverterService;
import com.company.service.CurrencyService;

/**
 * @author Jithin
 *
 */
public class YenCurrencyService implements CurrencyService {

	@Override
	public CurrencyBalance getDenominations(int amount) {
		
		Currency currency = CurrencyBuilder.getCurrency(CurrencyType.JPY);
		
		BalanceConverterService converterService = new BalanceConverterServiceImpl();
		
		CurrencyBalance balance = converterService.getCurrencyBalance(currency, amount);
		
		return balance;
	}

}