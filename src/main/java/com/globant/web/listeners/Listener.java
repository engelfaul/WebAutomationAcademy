package com.globant.web.listeners;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * Class listeners.
 * @author juan.montes
 */
public class Listener implements ITestListener {
	
	private Logger log = Logger.getLogger(Listener.class);

	@Override
	public void onFinish(ITestContext arg0) {

	}

	@Override
	public void onStart(ITestContext arg0) {

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {

	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		log.info("THE TEST FAILED");
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {

	}

	@Override
	public void onTestStart(ITestResult arg0) {

	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		log.info("THE TEST PASSED");
	}

}
