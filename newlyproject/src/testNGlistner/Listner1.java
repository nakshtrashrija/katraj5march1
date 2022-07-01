package testNGlistner;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listner1 implements ITestListener
{
	//Methods names--ontestPASS,ONtestFail,ONtestSuccess,ONTestSkipp
	@Override
	public void onTestFailure(ITestResult result)
	{
		Reporter.log("TC is failed,screenshot taken",true);
		ITestListener.super.onTestFailure(result);
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("TC is success",true);
		ITestListener.super.onTestSuccess(result);
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("TC is Skipp,please check dependant TC",true);
		ITestListener.super.onTestSkipped(result);
	}
		
	}


