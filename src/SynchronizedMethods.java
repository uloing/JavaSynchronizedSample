
public class SynchronizedMethods {
	static int staticSum;
	private int sum = 0;

	public void calculate() {
		setSum(getSum() + 1);
	}

	public synchronized void synchronisedCalculate() {
	    setSum(getSum() + 1);
	}
	
	public static synchronized void syncStaticCalculate() {
	    staticSum = staticSum + 1;
	}
	
	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
}
