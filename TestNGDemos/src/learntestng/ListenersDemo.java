package learntestng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersDemo implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Case started and Test Case name is: "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Case success and Test Case name is: "+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Case failed and Test Case name is: "+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Case skipped and Test Case name is: "+result.getName());
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test Case onStart and Test Case name is: "+context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test Case finished and Test Case name is: "+context.getName());
	}

}
