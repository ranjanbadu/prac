package com.listeners;
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.utility.Utility_1;
public class Listeners implements ITestListener{
	
	public void onFinish(ITestContext result) {
		
		
	}

	public void onStart(ITestContext arg0) {
		//System.out.println("test started*************");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
	try {
		Utility_1.getScreenshot(result.getName());;
	} catch (IOException e) {
		e.printStackTrace();
	}
		
	}

	public void onTestSkipped(ITestResult arg0) {
	
		
	}

	public void onTestStart(ITestResult arg0) {
	
		
	}

	public void onTestSuccess(ITestResult result) {
		
		System.out.println("success------------"+result.getName());
		
		
	}

}
