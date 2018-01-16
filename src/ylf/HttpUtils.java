package ylf;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class HttpUtils {
	
	public static void post(String value){

		// 创建默认的httpClient实例.    
		CloseableHttpClient httpclient = HttpClients.createDefault(); HttpPost httppost =null; 
		// 创建httppost    
//		HttpPost httppost = new HttpPost("http://172.21.11.20:9090/springmvc4/sendPlPayNote");  
//		HttpPost httppost = new HttpPost("http://172.21.11.20:9090/springmvc4/sendPayNote");  
		if(value.contains("、")){
			httppost = new HttpPost("http://localhost:8080/springmvc4/sendPlPayNote");  
		}else{
			httppost = new HttpPost("http://localhost:8080/springmvc4/sendPayNote");  
		}
		// 创建参数队列    
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();  
		formparams.add(new BasicNameValuePair("slid", value));  
//		formparams.add(new BasicNameValuePair("password", "123456"));  
		UrlEncodedFormEntity uefEntity = null;  
		try {
			uefEntity = new UrlEncodedFormEntity(formparams, "UTF-8");  
			httppost.setEntity(uefEntity);  
			System.out.println("executing request " + httppost.getURI());  
			CloseableHttpResponse response = httpclient.execute(httppost);  
			try {  
				HttpEntity entity = response.getEntity();  
				if (entity != null) {  
					System.out.println("--------------------------------------");  
					System.out.println("Response content: \n" + EntityUtils.toString(entity, "UTF-8"));  
					System.out.println("--------------------------------------");  
				}  
			} finally {  
				response.close();  
			}  
		} catch (ClientProtocolException e) {  
			e.printStackTrace();  
		} catch (UnsupportedEncodingException e1) {  
			e1.printStackTrace();  
		} catch (IOException e2) {  
			e2.printStackTrace();  
		} finally {  
			// 关闭连接,释放资源    
			try {  
				httpclient.close();  
			} catch (IOException e) {  
				e.printStackTrace();  
			}  
		}  
	
	}
	public static void post20(String value){
		
		// 创建默认的httpClient实例.    
		CloseableHttpClient httpclient = HttpClients.createDefault(); HttpPost httppost =null; 
		// 创建httppost    
//		HttpPost httppost = new HttpPost("http://172.21.11.20:9090/springmvc4/sendPlPayNote");  
//		HttpPost httppost = new HttpPost("http://172.21.11.20:9090/springmvc4/sendPayNote");  
		if(value.contains("、")){
			httppost = new HttpPost("http://172.21.11.22:8080/springmvc4/sendPlPayNote");  
		}else{
			httppost = new HttpPost("http://172.21.11.22:8080/springmvc4/sendPayNote");  
		}
		// 创建参数队列    
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();  
		formparams.add(new BasicNameValuePair("slid", value));  
//		formparams.add(new BasicNameValuePair("password", "123456"));  
		UrlEncodedFormEntity uefEntity = null;  
		try {
			uefEntity = new UrlEncodedFormEntity(formparams, "UTF-8");  
			httppost.setEntity(uefEntity);  
			System.out.println("executing request " + httppost.getURI());  
			CloseableHttpResponse response = httpclient.execute(httppost);  
			try {  
				HttpEntity entity = response.getEntity();  
				if (entity != null) {  
					System.out.println("--------------------------------------");  
					System.out.println("Response content: \n" + EntityUtils.toString(entity, "UTF-8"));  
					System.out.println("--------------------------------------");  
				}  
			} finally {  
				response.close();  
			}  
		} catch (ClientProtocolException e) {  
			e.printStackTrace();  
		} catch (UnsupportedEncodingException e1) {  
			e1.printStackTrace();  
		} catch (IOException e2) {  
			e2.printStackTrace();  
		} finally {  
			// 关闭连接,释放资源    
			try {  
				httpclient.close();  
			} catch (IOException e) {  
				e.printStackTrace();  
			}  
		}  
		
	}
	public static void postywr(String value){
		
		// 创建默认的httpClient实例.    
		CloseableHttpClient httpclient = HttpClients.createDefault();  
		// 创建httppost    
//		HttpPost httppost = new HttpPost("http://172.21.11.22:8080/springmvc4/sendywr");  
		HttpPost httppost = new HttpPost("http://localhost:8080/springmvc4/sendywr");  
		// 创建参数队列    
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();  
		formparams.add(new BasicNameValuePair("slid", value));  
//		formparams.add(new BasicNameValuePair("password", "123456"));  
		UrlEncodedFormEntity uefEntity = null;  
		try {  
			uefEntity = new UrlEncodedFormEntity(formparams, "UTF-8");  
			httppost.setEntity(uefEntity);  
			System.out.println("executing request " + httppost.getURI());  
			CloseableHttpResponse response = httpclient.execute(httppost);  
			try {  
				HttpEntity entity = response.getEntity();  
				if (entity != null) {  
					System.out.println("--------------------------------------");  
					System.out.println("Response content: \n" + EntityUtils.toString(entity, "UTF-8"));  
					System.out.println("--------------------------------------");  
				}  
			} finally {  
				response.close();  
			}  
		} catch (ClientProtocolException e) {  
			e.printStackTrace();  
		} catch (UnsupportedEncodingException e1) {  
			e1.printStackTrace();  
		} catch (IOException e2) {  
			e2.printStackTrace();  
		} finally {  
			// 关闭连接,释放资源    
			try {  
				httpclient.close();  
			} catch (IOException e) {  
				e.printStackTrace();  
			}  
		}  
		
	}
	
	public static void postnojk(String value){

		// 创建默认的httpClient实例.    
		CloseableHttpClient httpclient = HttpClients.createDefault();  
		// 创建httppost    
//		HttpPost httppost = new HttpPost("http://172.21.11.20:9090/springmvc4/findNoJktzsbh");  
		HttpPost httppost = new HttpPost("http://172.21.11.22:8080/springmvc4/findNoJktzsbh");  
		// 创建参数队列    
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();  
//		formparams.add(new BasicNameValuePair("slid", value));  
//		formparams.add(new BasicNameValuePair("password", "123456"));  
		UrlEncodedFormEntity uefEntity = null;  
		try {  
			uefEntity = new UrlEncodedFormEntity(formparams, "UTF-8");  
			httppost.setEntity(uefEntity);  
			System.out.println("executing request " + httppost.getURI());  
			CloseableHttpResponse response = httpclient.execute(httppost);  
			try {  
				HttpEntity entity = response.getEntity();  
				if (entity != null) {  
					System.out.println("--------------------------------------");  
					System.out.println("Response content: \n" + EntityUtils.toString(entity, "UTF-8"));  
					System.out.println("--------------------------------------");  
				}  
			} finally {  
				response.close();  
			}  
		} catch (ClientProtocolException e) {  
			e.printStackTrace();  
		} catch (UnsupportedEncodingException e1) {  
			e1.printStackTrace();  
		} catch (IOException e2) {  
			e2.printStackTrace();  
		} finally {  
			// 关闭连接,释放资源    
			try {  
				httpclient.close();  
			} catch (IOException e) {  
				e.printStackTrace();  
			}  
		}  
	
	}
	
	public static void postWT(String value){

		// 创建默认的httpClient实例.    
		CloseableHttpClient httpclient = HttpClients.createDefault();  
		// 创建httppost    
//		HttpPost httppost = new HttpPost("http://172.21.11.20:9090/springmvc4/sendPayNote");  
		HttpPost httppost = new HttpPost("http://localhost:8080/springmvc4/sendWTdata");  
		// 创建参数队列    
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();  
		formparams.add(new BasicNameValuePair("startTime","2017/10/11 2:00:00"));  
		formparams.add(new BasicNameValuePair("endTime","2017/10/12 2:00:00"));  
//		formparams.add(new BasicNameValuePair("slid",value));  
		UrlEncodedFormEntity uefEntity = null;  
		try {  
			uefEntity = new UrlEncodedFormEntity(formparams, "UTF-8");  
			httppost.setEntity(uefEntity);  
			System.out.println("executing request " + httppost.getURI());  
			CloseableHttpResponse response = httpclient.execute(httppost);  
			try {  
				HttpEntity entity = response.getEntity();  
				if (entity != null) {  
					System.out.println("--------------------------------------");  
					System.out.println("Response content: \n" + EntityUtils.toString(entity, "UTF-8"));  
					System.out.println("--------------------------------------");  
				}  
			} finally {  
				response.close();  
			}  
		} catch (ClientProtocolException e) {  
			e.printStackTrace();  
		} catch (UnsupportedEncodingException e1) {  
			e1.printStackTrace();  
		} catch (IOException e2) {  
			e2.printStackTrace();  
		} finally {  
			// 关闭连接,释放资源    
			try {  
				httpclient.close();  
			} catch (IOException e) {  
				e.printStackTrace();  
			}  
		}  
	
	}
	
	public static void postSearch(String value){

		// 创建默认的httpClient实例.    
		CloseableHttpClient httpclient = HttpClients.createDefault();  
		// 创建httppost    
//		HttpPost httppost = new HttpPost("http://172.21.11.20:9090/springmvc4/searchPayNote");  
		HttpPost httppost = new HttpPost("http://localhost:8080/springmvc4/searchPayNote");  
		// 创建参数队列    
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();  
		formparams.add(new BasicNameValuePair("slid", value));  
//		formparams.add(new BasicNameValuePair("password", "123456"));  
		UrlEncodedFormEntity uefEntity = null;  
		try {  
			uefEntity = new UrlEncodedFormEntity(formparams, "UTF-8");  
			httppost.setEntity(uefEntity);  
			System.out.println("executing request " + httppost.getURI());  
			CloseableHttpResponse response = httpclient.execute(httppost);  
			try {  
				HttpEntity entity = response.getEntity();  
				if (entity != null) {  
					System.out.println("--------------------------------------");  
					System.out.println("Response content: \n" + EntityUtils.toString(entity, "UTF-8"));  
					System.out.println("--------------------------------------");  
				}  
			} finally {  
				response.close();  
			}  
		} catch (ClientProtocolException e) {  
			e.printStackTrace();  
		} catch (UnsupportedEncodingException e1) {  
			e1.printStackTrace();  
		} catch (IOException e2) {  
			e2.printStackTrace();  
		} finally {  
			// 关闭连接,释放资源    
			try {  
				httpclient.close();  
			} catch (IOException e) {  
				e.printStackTrace();  
			}  
		}  
	}
	
	public static void postTestThread(String value){

		// 创建默认的httpClient实例.    
		CloseableHttpClient httpclient = HttpClients.createDefault();  
		// 创建httppost    
//		HttpPost httppost = new HttpPost("http://172.21.11.20:9090/springmvc4/sendPayNote");  
//		HttpPost httppost = new HttpPost("http://localhost:8080/springmvc4/sendPayNoteTest");  
		HttpPost httppost = new HttpPost("http://localhost:8080/springmvc4/sendtest");  
		// 创建参数队列    
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();  
		formparams.add(new BasicNameValuePair("slid", value));  
//		formparams.add(new BasicNameValuePair("password", "123456"));  
		UrlEncodedFormEntity uefEntity = null;  
		try {
			uefEntity = new UrlEncodedFormEntity(formparams, "UTF-8");  
			httppost.setEntity(uefEntity);  
			System.out.println("executing request " + httppost.getURI());  
			CloseableHttpResponse response = httpclient.execute(httppost);  
			try {  
				HttpEntity entity = response.getEntity();  
				if (entity != null) {  
					System.out.println("--------------------------------------");  
					System.out.println("Response content: \n" + EntityUtils.toString(entity, "UTF-8"));  
					System.out.println("--------------------------------------");  
				}  
			} finally {  
				response.close();  
			}  
		} catch (ClientProtocolException e) {  
			e.printStackTrace();  
		} catch (UnsupportedEncodingException e1) {  
			e1.printStackTrace();  
		} catch (IOException e2) {  
			e2.printStackTrace();  
		} finally {  
			// 关闭连接,释放资源    
			try {  
				httpclient.close();  
			} catch (IOException e) {  
				e.printStackTrace();  
			}  
		}  
	
	}
	
	public static void postlocal(String value){
		HttpPost httppost = null;
		// 创建默认的httpClient实例.    
		CloseableHttpClient httpclient = HttpClients.createDefault();  
		// 创建httppost    
//		HttpPost httppost = new HttpPost("http://172.21.11.20:9090/springmvc4/sendPayNote");  
//		HttpPost httppost = new HttpPost("http://localhost:8080/springmvc4/sendPayNoteTest");  
		if(value.contains("、")){
			httppost = new HttpPost("http://localhost:8080/springmvc4/sendPlPayNote");  
		}else{
			httppost = new HttpPost("http://localhost:8080/springmvc4/sendPayNote"); 
		}
		// 创建参数队列    
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();  
		formparams.add(new BasicNameValuePair("slid", value));  
//		formparams.add(new BasicNameValuePair("password", "123456"));  
		UrlEncodedFormEntity uefEntity = null;  
		try {
			uefEntity = new UrlEncodedFormEntity(formparams, "UTF-8");  
			httppost.setEntity(uefEntity);  
			System.out.println("executing request " + httppost.getURI());  
			CloseableHttpResponse response = httpclient.execute(httppost);  
			try {  
				HttpEntity entity = response.getEntity();  
				if (entity != null) {  
					System.out.println("--------------------------------------");  
					System.out.println("Response content: \n" + EntityUtils.toString(entity, "UTF-8"));  
					System.out.println("--------------------------------------");  
				}  
			} finally {  
				response.close();  
			}  
		} catch (ClientProtocolException e) {  
			e.printStackTrace();  
		} catch (UnsupportedEncodingException e1) {  
			e1.printStackTrace();  
		} catch (IOException e2) {  
			e2.printStackTrace();  
		} finally {  
			// 关闭连接,释放资源    
			try {  
				httpclient.close();  
			} catch (IOException e) {  
				e.printStackTrace();  
			}  
		}  
	
	}
	public static void postywrdata(String value){
		HttpPost httppost = null;
		// 创建默认的httpClient实例.    
		CloseableHttpClient httpclient = HttpClients.createDefault();  
		// 创建httppost    
//		HttpPost httppost = new HttpPost("http://172.21.11.20:9090/springmvc4/sendPayNote");  
//		HttpPost httppost = new HttpPost("http://localhost:8080/springmvc4/sendPayNoteTest");  
		httppost = new HttpPost("http://localhost:8080/springmvc4/sendywrData"); 
		// 创建参数队列    
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();  
//		formparams.add(new BasicNameValuePair("slid", value));  
//		formparams.add(new BasicNameValuePair("password", "123456"));  
		UrlEncodedFormEntity uefEntity = null;  
		try {
			uefEntity = new UrlEncodedFormEntity(formparams, "UTF-8");  
			httppost.setEntity(uefEntity);  
			System.out.println("executing request " + httppost.getURI());  
			CloseableHttpResponse response = httpclient.execute(httppost);  
			try {  
				HttpEntity entity = response.getEntity();  
				if (entity != null) {  
					System.out.println("--------------------------------------");  
					System.out.println("Response content: \n" + EntityUtils.toString(entity, "UTF-8"));  
					System.out.println("--------------------------------------");  
				}  
			} finally {  
				response.close();  
			}  
		} catch (ClientProtocolException e) {  
			e.printStackTrace();  
		} catch (UnsupportedEncodingException e1) {  
			e1.printStackTrace();  
		} catch (IOException e2) {  
			e2.printStackTrace();  
		} finally {  
			// 关闭连接,释放资源    
			try {  
				httpclient.close();  
			} catch (IOException e) {  
				e.printStackTrace();  
			}  
		}  
		
	}
	public static void postfs1(String value,String value2){
		HttpPost httppost = null;
		// 创建默认的httpClient实例.    
		CloseableHttpClient httpclient = HttpClients.createDefault();  
		// 创建httppost    
//		HttpPost httppost = new HttpPost("http://172.21.11.20:9090/springmvc4/sendPayNote");  
//		HttpPost httppost = new HttpPost("http://localhost:8080/springmvc4/sendPayNoteTest");  
		httppost = new HttpPost("http://localhost:8080/springmvc4/fs1"); 
		// 创建参数队列    
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();  
		formparams.add(new BasicNameValuePair("start", value));  
		formparams.add(new BasicNameValuePair("end", value2));  
//		formparams.add(new BasicNameValuePair("password", "123456"));  
		UrlEncodedFormEntity uefEntity = null;  
		try {
			uefEntity = new UrlEncodedFormEntity(formparams, "UTF-8");  
			httppost.setEntity(uefEntity);  
			System.out.println("executing request " + httppost.getURI());  
			CloseableHttpResponse response = httpclient.execute(httppost);  
			try {  
				HttpEntity entity = response.getEntity();  
				if (entity != null) {  
					System.out.println("--------------------------------------");  
					System.out.println("Response content: \n" + EntityUtils.toString(entity, "UTF-8"));  
					System.out.println("--------------------------------------");  
				}  
			} finally {  
				response.close();  
			}  
		} catch (ClientProtocolException e) {  
			e.printStackTrace();  
		} catch (UnsupportedEncodingException e1) {  
			e1.printStackTrace();  
		} catch (IOException e2) {  
			e2.printStackTrace();  
		} finally {  
			// 关闭连接,释放资源    
			try {  
				httpclient.close();  
			} catch (IOException e) {  
				e.printStackTrace();  
			}  
		}  
		
	}
	public static void postTzsbh(String value){
		HttpPost httppost = null;
		// 创建默认的httpClient实例.    
		CloseableHttpClient httpclient = HttpClients.createDefault();  
		// 创建httppost    
//		HttpPost httppost = new HttpPost("http://172.21.11.20:9090/springmvc4/sendPayNote");  
		httppost = new HttpPost("http://localhost:8080/springmvc4/sendByJktzsbh");  
//		httppost = new HttpPost("http://172.21.11.20:9090/springmvc4/sendByJktzsbh"); 
		// 创建参数队列    
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();  
		formparams.add(new BasicNameValuePair("tzsbh", value));  
//		formparams.add(new BasicNameValuePair("password", "123456"));  
		UrlEncodedFormEntity uefEntity = null;  
		try {
			uefEntity = new UrlEncodedFormEntity(formparams, "UTF-8");  
			httppost.setEntity(uefEntity);  
			System.out.println("executing request " + httppost.getURI());  
			CloseableHttpResponse response = httpclient.execute(httppost);  
			try {  
				HttpEntity entity = response.getEntity();  
				if (entity != null) {  
					System.out.println("--------------------------------------");  
					System.out.println("Response content: \n" + EntityUtils.toString(entity, "UTF-8"));  
					System.out.println("--------------------------------------");  
				}  
			} finally {  
				response.close();  
			}  
		} catch (ClientProtocolException e) {  
			e.printStackTrace();  
		} catch (UnsupportedEncodingException e1) {  
			e1.printStackTrace();  
		} catch (IOException e2) {  
			e2.printStackTrace();  
		} finally {  
			// 关闭连接,释放资源    
			try {  
				httpclient.close();  
			} catch (IOException e) {  
				e.printStackTrace();  
			}  
		}  
		
	}
	public static void postcjf(String value){

		// 创建默认的httpClient实例.    
		CloseableHttpClient httpclient = HttpClients.createDefault();  
		// 创建httppost    
		HttpPost httppost = new HttpPost("http://172.21.11.20:9090/springmvc4/sendCJF");  
//		HttpPost httppost = new HttpPost("http://localhost:8080/springmvc4/sendCJF");  
		// 创建参数队列    
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();  
		formparams.add(new BasicNameValuePair("slid", value));  
//		formparams.add(new BasicNameValuePair("password", "123456"));  
		UrlEncodedFormEntity uefEntity = null;  
		try {
			uefEntity = new UrlEncodedFormEntity(formparams, "UTF-8");  
			httppost.setEntity(uefEntity);  
			System.out.println("executing request " + httppost.getURI());  
			CloseableHttpResponse response = httpclient.execute(httppost);  
			try {  
				HttpEntity entity = response.getEntity();  
				if (entity != null) {  
					System.out.println("--------------------------------------");  
					System.out.println("Response content: \n" + EntityUtils.toString(entity, "UTF-8"));  
					System.out.println("--------------------------------------");  
				}  
			} finally {  
				response.close();  
			}  
		} catch (ClientProtocolException e) {  
			e.printStackTrace();  
		} catch (UnsupportedEncodingException e1) {  
			e1.printStackTrace();  
		} catch (IOException e2) {  
			e2.printStackTrace();  
		} finally {  
			// 关闭连接,释放资源    
			try {  
				httpclient.close();  
			} catch (IOException e) {  
				e.printStackTrace();  
			}  
		}  
	
	}
	
	public static void postdx(String value){

		// 创建默认的httpClient实例.    
		CloseableHttpClient httpclient = HttpClients.createDefault();  
		// 创建httppost    
		HttpPost httppost = new HttpPost("http://localhost:8080/springmvc4/dx/sendmessages");  
		// 创建参数队列    
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();  
		formparams.add(new BasicNameValuePair("slid", value));  
//		formparams.add(new BasicNameValuePair("password", "123456"));  
		UrlEncodedFormEntity uefEntity = null;  
		try {
			uefEntity = new UrlEncodedFormEntity(formparams, "UTF-8");  
			httppost.setEntity(uefEntity);  
			System.out.println("executing request " + httppost.getURI());  
			CloseableHttpResponse response = httpclient.execute(httppost);  
			try {  
				HttpEntity entity = response.getEntity();  
				if (entity != null) {  
					System.out.println("--------------------------------------");  
					System.out.println("Response content: \n" + EntityUtils.toString(entity, "UTF-8"));  
					System.out.println("--------------------------------------");  
				}  
			} finally {  
				response.close();  
			}  
		} catch (ClientProtocolException e) {  
			e.printStackTrace();  
		} catch (UnsupportedEncodingException e1) {  
			e1.printStackTrace();  
		} catch (IOException e2) {  
			e2.printStackTrace();  
		} finally {  
			// 关闭连接,释放资源    
			try {  
				httpclient.close();  
			} catch (IOException e) {  
				e.printStackTrace();  
			}  
		}  
	
	}
	
}

