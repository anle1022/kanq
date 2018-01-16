package ylf;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;


public class HttpClientUtil {

    public static String postByZipStream(String uri,String xmlBase64){
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
            HttpPost httppost = new HttpPost(uri);
            //zip压缩流压缩到outputStream中
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            ZipOutputStream zipops = new ZipOutputStream(outputStream);
            zipops.putNextEntry(new ZipEntry("default"));
            zipops.write(xmlBase64.getBytes());
            zipops.closeEntry();
            //获得压缩流的byte数组
            byte[] compressed = outputStream.toByteArray();
            //将压缩流数据放入输入流中
            ByteArrayInputStream inputStream = new ByteArrayInputStream(compressed);
            //http post 流
            InputStreamEntity reqEntity = null;  
            reqEntity = new InputStreamEntity(inputStream);
            reqEntity.setContentType("binary/octet-stream");
            reqEntity.setChunked(true);
            httppost.setEntity(reqEntity);
            //System.out.println("executing request " + httppost.getRequestLine());
            CloseableHttpResponse response = httpclient.execute(httppost);
            try {
                //System.out.println("----------------------------------------");
                //System.out.println(response.getStatusLine());
                HttpEntity resEntity = response.getEntity();
                if (resEntity != null) {
                    InputStream in = resEntity.getContent();
                    
                    ZipInputStream zis = new ZipInputStream(in);
                    ZipEntry zipEntry = null;  
                    StringBuffer sb1 = new StringBuffer();
                    while((zipEntry=zis.getNextEntry())!=null){
                        System.out.println(zipEntry.getName());
                        if(!zipEntry.isDirectory()){ 
                            byte[] buf = new byte[2048];
                            int len = -1;
                            while ((len = zis.read(buf)) != -1) {  // 直到读到该条目的结尾
                                sb1.append(new String(buf,0,len));
                            }
                        }
                        zis.closeEntry();
                    } 
                    return sb1.toString();
                    
                }
                EntityUtils.consume(resEntity);
            } finally {
                response.close();
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                httpclient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "error!";
    }
}
