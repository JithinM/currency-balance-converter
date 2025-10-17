package com.company.repository;

import java.util.ArrayList;
import java.util.List;

import com.company.currency.Denomination;

/**
 * @author jithin
 *
 */
public class CurrencyRepository {

	/**
	 * get List of USD Denomination
	 * @return
	 */
	public List<Denomination> getUsDollarDenominations(){
		
		
		List<Denomination> denominations = new ArrayList<Denomination>();
		
		
		//Currency should be configured in DB or config file.	
		
		denominations.add(new Denomination("Penny", 1));
		denominations.add(new Denomination("Nickel", 5));
		denominations.add(new Denomination("Dime", 10));
		denominations.add(new Denomination("Quarter", 25));
		//denominations.add(new Denomination("Half Dollar", 50));
		denominations.add(new Denomination("Dollar", 100));
		
		//if bills needs to be added
//		denominations.add(new Denomination("2 Dollar", 200));
//		denominations.add(new Denomination("5 Dollar", 500));
//		denominations.add(new Denomination("10 Dollar", 10000));
//		denominations.add(new Denomination("20 Dollar", 20000));
//		denominations.add(new Denomination("50 Dollar", 50000));
//		denominations.add(new Denomination("100 Dollar", 100000));
		
		
		
		return denominations;
	}
	
	/**
	 * get List of INR Denomination
	 * @return
	 */
	public List<Denomination> getINRDenominations(){
		
		// TODO
		
		return null;
	}
	
	/**
	 * get List of JPY (Japanese Yen) Denomination
	 * @return
	 */
	public List<Denomination> getYenDenominations(){
		
		List<Denomination> denominations = new ArrayList<Denomination>();
		
		// Japanese Yen denominations (values in smallest unit - 1 yen)
		// Coins
		denominations.add(new Denomination("1 Yen", 1));
		denominations.add(new Denomination("5 Yen", 5));
		denominations.add(new Denomination("10 Yen", 10));
		denominations.add(new Denomination("50 Yen", 50));
		denominations.add(new Denomination("100 Yen", 100));
		denominations.add(new Denomination("500 Yen", 500));
		
		// Bills (in yen units)
		denominations.add(new Denomination("1000 Yen", 1000));
		denominations.add(new Denomination("2000 Yen", 2000));
		denominations.add(new Denomination("5000 Yen", 5000));
		denominations.add(new Denomination("10000 Yen", 10000));
		
		return denominations;
	}

}
