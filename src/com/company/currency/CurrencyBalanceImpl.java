package com.company.currency;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Currency balance contains list of Denominations.
 * It keep track of count of distinct Denomination
 * @author Jithin
 *
 */
public class CurrencyBalanceImpl implements CurrencyBalance{

	List<Denomination> balance = new ArrayList<Denomination>();
	
	HashMap<String, Integer> balanceCounterMap = new LinkedHashMap<String, Integer>();
	
	/**
	 * add Denomination
	 * @param denom
	 */
	@Override
	public void addDenomination(Denomination denom) {
		
		balance.add(denom);
		
		Integer count = 0;
		String denomName = denom.getName();
		if(balanceCounterMap.containsKey(denomName)) {
			
			count = balanceCounterMap.get(denomName);
			balanceCounterMap.put(denomName, count+1);
		}else {
			
			balanceCounterMap.put(denomName, 1);
		}
		
	}
	
	
	/**
	 * Get description of balanace
	 * @return Description 
	 */
	@Override
	public String getDecription() {		
		
		
		StringBuffer denomString = new StringBuffer();
		
		boolean denomStringAppended = false;
		
		for (Map.Entry<String, Integer> mapElement : balanceCounterMap.entrySet()) {			
			
			if(denomStringAppended) {
				
				denomString.append(",");
			}
			denomString.append(mapElement.getValue());
			denomString.append(" ");
			denomString.append(mapElement.getKey());
			
			
			denomStringAppended = true;
		}
		return denomString.toString();
		
	}
	
	/**
	 * Value of the balance in the lowest unit of currency 
	 * @return
	 */
	@Override
	public int getValue() {
		
		return 0;
	}
	
 	
}
