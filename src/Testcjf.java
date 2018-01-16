import ylf.HttpUtils;


public class Testcjf implements Runnable{
	private String value;
	
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public Testcjf(){}
	public Testcjf(String value){
		this.value = value;
	}
	
	public static void main(String[] args) {
		String slids ="";
//		String[] slidss = slids.split(",");
//		for (int i = 0; i < slidss.length; i++) {
			Testcjf t = new Testcjf("201707250349");
			Thread thread = new Thread(t);
			thread.start();
//		}
	}
	
	@Override
	public void run() {
//		test(value);
		HttpUtils.postcjf(value);
//		HttpUtils.postTestThread(value);
	}

}
