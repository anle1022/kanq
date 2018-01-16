import java.util.ArrayList;
import java.util.List;

import ylf.DateUtil;
import ylf.HttpClientUtil;
import ylf.HttpUtils;


public class Test2 implements Runnable{
	
	private String value;
	
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public Test2(){}
	public Test2(String value){
		this.value = value;
	}
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
//		for(String v : list){
			Test1 t = new Test1("201711161357");
			Thread thread = new Thread(t);
			thread.start();
//		}
	}
	
	@Override
	public void run() {
		HttpUtils.postSearch(value);
	}

}
