package com.TestNG_FEATURES;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Rerun implements IRetryAnalyzer {

	int start = 0;
	int end   = 3;
	
	//rerun class (no of times to be run for given condition)
	@Override
	public boolean retry(ITestResult result) {
		
		if (start < end) {
			
			start++;
			return true;
		}
		return false;
	}

	
	
}
