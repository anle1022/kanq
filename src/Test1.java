import java.util.ArrayList;
import java.util.List;

import ylf.HttpClientUtil;
import ylf.HttpUtils;


public class Test1 implements Runnable{
	private byte[] lock = new byte[0];
	private String value;
	private String value2;
	
	
	public String getValue() {
		return value;
	}
	public String getValue2() {
		return value2;
	}
	public void setValue2(String value2) {
		this.value2 = value2;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	public Test1(){}
	public Test1(String value){
		this.value = value;
	}
	public Test1(String value,String value2){
		this.value = value;
		this.value2 = value2;
	}
	
	public String test(String i){
		i=i+3;
		synchronized(lock){
			i=i+1;
		}
		System.out.println(i);
		return i;
	}
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

//		String slids ="201710100163、201710100223、201710100232、201710110921";
//		String[] slidss = slids.split("、");
//		for (int i = 0; i < slidss.length; i++) {
//			list.add(slidss[i]);

			Test1 t = new Test1("201712281446");
//			Test1 t = new Test1("09-25","09-25");
//			Test1 t = new Test1("09-13");
			Thread thread = new Thread(t);
			thread.start();
//		}
	}
	
	@Override
	public void run() {
//		test(value);
		HttpUtils.post(value);
//		HttpUtils.postTzsbh(value);
//		HttpUtils.postfs1(value,value2);
//		HttpUtils.postTestThread(value);
	}

}
