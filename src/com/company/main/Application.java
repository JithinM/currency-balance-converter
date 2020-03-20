package com.company.main;

import com.company.currency.CurrencyBalance;
import com.company.service.CurrencyService;
import com.company.service.impl.UsDollarCurrencyService;

public class Application {

	public static void main(String[] args) {

				
		// Currency service should be Injected using DI based on the type of currency.
		// UsDollarCurrencyService will handle USD type

		CurrencyService currencyService = new UsDollarCurrencyService();
		
		CurrencyBalance balance = null;
		
		int amount;
		
		
		/* Given the balance 87, the function will return 3 Quarter, 1 Dime, 2 Penny */
		amount = 87;		

		balance = currencyService.getDenominations(amount);

		System.out.println(balance.getDecription());
		
		
		
		/*
		 * Given the balance 287, the function will return 2 Dollar, 3 Quarter, 1 Dime,
		 * 2 Penny coins
		 */

		amount = 287;

		balance = currencyService.getDenominations(amount);

		System.out.println(balance.getDecription());
		
		
		
		amount = 567;

		balance = currencyService.getDenominations(amount);

		System.out.println(balance.getDecription());
		
		

	}
}
