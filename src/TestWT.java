import java.util.ArrayList;
import java.util.List;

import ylf.HttpClientUtil;
import ylf.HttpUtils;


public class TestWT implements Runnable{
	
	private String value;
	
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public TestWT(){}
	public TestWT(String value){
		this.value = value;
	}
	public static void main(String[] args) {
//		List<String> list = new ArrayList<String>();

			TestWT t = new TestWT();
			Thread thread = new Thread(t);
			thread.start();
		
	}

	@Override
	public void run() {
		HttpUtils.postWT(value);
	}

}
