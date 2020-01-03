package core.util;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class HttpUtils {
    /**
     * post 发送json数据
     * @param uri
     * @param param
     * @return
     */
    public static String httpPost(String uri, String param) {
        OutputStream out = null;
        InputStream in = null;
        StringBuffer sb = new StringBuffer();
        try {
            URL url = new URL(uri);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true); //设置允许输出
            conn.setDoInput(true); //设置允许输入
            conn.setUseCaches(false); //设置不使用缓存
            conn.setRequestMethod("POST"); //设置请求方式
            conn.setRequestProperty("Charact", "UTF-8"); //设置文件字符集
            conn.setRequestProperty("Connection", "Keep-Alive"); //设置维持长连接
            conn.setRequestProperty("Content-Type", "application/json; charset = UTF-8" );
            conn.setRequestProperty("accept", "application/json");
            conn.connect();

            out = new DataOutputStream(conn.getOutputStream());
            out.write(param.getBytes());
            out.flush();

            if (HttpURLConnection.HTTP_OK == conn.getResponseCode()) {
                in = conn.getInputStream();
                try {
                    String readLine = "";
                    BufferedReader responseLine = new BufferedReader(new InputStreamReader(in, "utf-8"));
                    while ((readLine = responseLine.readLine()) !=  null) {
                        sb.append(readLine);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            }
        } catch(Exception e){
            e.printStackTrace();
            return null;
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return sb.toString();
    }

    /**
     * get请求
     *
     * @param url
     * @param param
     * @return
     */
    public static String httpGet(String url, Map<String, Object> param) {
        StringBuilder builder=new StringBuilder();
        try {
            StringBuilder params=new StringBuilder();
            for(Map.Entry<String, Object> entry:param.entrySet()){
                params.append(entry.getKey());
                params.append("=");
                params.append(entry.getValue().toString());
                params.append("&");
            }
            if(params.length()>0){
                params.deleteCharAt(params.lastIndexOf("&"));
            }
            URL restServiceURL = new URL(url+(params.length()>0 ? "?"+params.toString() : ""));
            HttpURLConnection httpConnection = (HttpURLConnection) restServiceURL.openConnection();
            httpConnection.setRequestMethod("GET");
            httpConnection.setRequestProperty("Accept", "application/json");
            if (httpConnection.getResponseCode() != 200) {
                throw new RuntimeException("HTTP GET Request Failed with Error code : "
                        + httpConnection.getResponseCode());
            }
            InputStream in = httpConnection.getInputStream();
            byte []b=new byte[1024];
            int length=-1;
            while((length=in.read(b))!=-1){
                builder.append(new String(b,0,length));
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return builder.toString();
    }
}
