import ylf.Base64;
import ylf.HttpClientUtil;
import ylf.JaxbUtil;
import ylf.JaxbUtil.CollectionWrapper;

public class Test {
 

    public String post(String base64){
    	base64 = "PD94bWwgdmVyc2lvbj0iMS4wIj8+PFlTWFg+PExPR0lOPjxVU0VSTkFNRT55eXl5PC9VU0VSTkFNRT48UEFTU1dPUkQ+eXl5eTAwMDA8L1BBU1NXT1JEPjwvTE9HSU4+PE9QRVJBVElPTj4xPC9PUEVSQVRJT04+PFVOSVRJTkZPPjxYWlFIPjQ0MDEwMDwvWFpRSD48RFdCTT40MTEwMDM8L0RXQk0+PC9VTklUSU5GTz48TElTVD48SktTPjxNQUlOPjxXWUJTPlRETEgwMDAwMTwvV1lCUz48UEpMWD4wMTk0PC9QSkxYPjxQSkhNPjAwMDAwMDAxWDwvUEpITT48WlNGUz4xPC9aU0ZTPjxKS0ZTPjAxPC9KS0ZTPjxKS1FDPrLiytQ8L0pLUUM+PC9NQUlOPjxERVRBSUw+PFNSWE0+PFhNQk0+MDE5NDwvWE1CTT48WE1TTD4xPC9YTVNMPjxYTUpFPjUwPC9YTUpFPjwvU1JYTT48L0RFVEFJTD48L0pLUz48L0xJU1Q+PC9ZU1hYPg==";
        String uri = "http://172.16.69.239:9001/egov/unitServlet?command=ysxx";
        String result = HttpClientUtil.postByZipStream(uri, base64);
        return result;
    }

    public static void main(String[] args) {
 
        User user = new User();
        user.setUserName("testUserName");
        user.setPassword("testPassword");
        //转xml
        JaxbUtil jaxbUtil = new JaxbUtil(User.class, CollectionWrapper.class);     
        String result = jaxbUtil.toXml(user, "UTF-8");
        System.out.println(result);
        //base64加密
        String encodeBase64 = Base64.encode(result);
        System.out.println(encodeBase64);
        // base64解密
        String decodeBase64 = Base64.decode(encodeBase64);
        System.out.println(decodeBase64);
       
    }
}
