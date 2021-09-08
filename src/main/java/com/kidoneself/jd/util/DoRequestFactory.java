package com.kidoneself.jd.util;

import com.kidoneself.jd.po.JDUser;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.HttpClientUtils;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class DoRequestFactory {




    public String doGet(String url) {
        //1.生成httpclient，相当于该打开一个浏览器
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        try {
            //2.创建get请求，相当于在浏览器地址栏输入 网址
            HttpGet request = new HttpGet(url);
            request.addHeader("accept", "*/*");
            request.addHeader("accept-encoding", "gzip, deflate, br");
            request.addHeader("accept-language", "zh-CN,zh;q=0.9");
            request.addHeader("cache-control", "no-cache");
            request.addHeader("origin", "no-cache");
            request.addHeader("cache-control", "https://home.m.jd.com");
            request.addHeader("referer", "https://home.m.jd.com/myJd/newhome.action?sceneval=2&ufc=&");
            request.addHeader("sec-fetch-dest", "empty");
            request.addHeader("sec-fetch-mode", "cors");
            request.addHeader("sec-fetch-site", "same-site");
            request.addHeader("User-Agent", "dapp;android;10.0.2;6.0.1;3353932353030353031393232333-43D2833633165633334666666663;network/wifi;model/Nexus 5;addressid/0;aid/128de6e2076ea424;oaid/;osVer/23;appBuild/88569;partner/BS2020042200010;eufv/1;jdSupportDarkMode/0;Mozilla/5.0 (Linux; Android 6.0.1; Nexus 5 Build/M4B30Z; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/44.0.2403.117 Mobile Safari/537.36");
            request.addHeader("Content-Type", "application/x-www-form-urlencoded");
            request.addHeader("cookie", "pt_key=AAJhMQSFAEDpKABMNbc_OnIYLPXvxZJ742n5QPFXRtkm0c2Hi0DYHFN7VXDJX1IHNIITB-viic0sL5pk_UN3OUShqTOzCDxb;pt_pin=%E6%80%AA%E7%9B%97%E5%9F%BA%E5%BE%B78768611;");
            response = httpClient.execute(request);
            HttpEntity httpEntity = response.getEntity();
            return EntityUtils.toString(httpEntity, "utf-8");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //6.关闭
            HttpClientUtils.closeQuietly(response);
            HttpClientUtils.closeQuietly(httpClient);
        }
        return null;
    }
}
