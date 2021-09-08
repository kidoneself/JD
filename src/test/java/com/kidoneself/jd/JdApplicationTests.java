package com.kidoneself.jd;

import com.alibaba.fastjson.JSONObject;
import com.kidoneself.jd.Factory.HttpInstanceFactory;
import com.kidoneself.jd.po.JDUser;
import com.kidoneself.jd.util.HttpClientTool;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.HttpClientUtils;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EntityUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

@SpringBootTest
class JdApplicationTests {

    /**
     * 获取用户信息
     */
    @Test
    void getUserInfo() throws UnsupportedEncodingException {
        Header[] selfHeaders = {
//                new BasicHeader("cookie", "pt_key=AAJhMQSFAEDpKABMNbc_OnIYLPXvxZJ742n5QPFXRtkm0c2Hi0DYHFN7VXDJX1IHNIITB-viic0sL5pk_UN3OUShqTOzCDxb;pt_pin=%E6%80%AA%E7%9B%97%E5%9F%BA%E5%BE%B78768611;"),
//                new BasicHeader("cookie", "pt_key=AAJhMjvJADCPtNcnXO-PewkiuqdAU6rTZrshmCYTPOZeX7dNmqCZZ54otfR0STiU2O_vjs9MiDk;pt_pin=jd_511851479ac61;"),
//                new BasicHeader("cookie", "pt_key=AAJhMZy6ADB2W7xRfeTHfOY3vM9J7q7VzgdZYObxTGDYsBxR7YV2A8RzJrwnGRwCGnH1eK9W9oA;pt_pin=jd_PUDaNSWCqtZp;"),
                new BasicHeader("cookie", "pt_key=AAJhMoazADDzGgTvjoaytT-Ibu0KB4X58qdZwuAZo44PygrREezoKubrGzKMXlm7OS1-VnAbuhM;pt_pin=jd_trbybgrVjMqE;"),
                new BasicHeader("User-Agent", "" +
                        "jdapp;android;10.0.2;10;network/wifi;Mozilla/5.0 (Linux; Android 10; GM1910 Build/QKQ1.190716.003; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/77.0.3865.120 MQQBrowser/6.2 TBS/045230 Mobile Safari/537.36")
                //
        };
        HttpInstanceFactory.HttpInstance instance = HttpInstanceFactory.getInstance();
        instance.setSelfHeaders(selfHeaders);
        JDUser userInfo = instance.getUserInfo();
        System.out.println(userInfo);
//        Header[] initForFarmHeaders = {
//                new BasicHeader("Host", "api.m.jd.com"),
//                new BasicHeader("Connection", "eep-alive"),
//                new BasicHeader("Host", "api.m.jd.com"),
//                new BasicHeader("Origin", "https://carry.m.jd.com"),
//                new BasicHeader("Origin", "https://carry.m.jd.com"),
//                new BasicHeader("Accept", "*/*"),
////                new BasicHeader("Referer", "https://carry.m.jd.com/babelDiy/Zeus/3KSjXqQabiTuD1cJ28QskrpWoBKT/index.html?babelChannel=121&lng=121.425238&lat=31.137729&sid=b744610e2598cc9614c386057428fc5w&un_area=2_2813_61130_0"),
//                new BasicHeader("content-type", "application/json"),
////                new BasicHeader("X-Requested-With", "com.jingdong.app.mall"),
//                new BasicHeader("cookie", "pt_key=AAJhMQSFAEDpKABMNbc_OnIYLPXvxZJ742n5QPFXRtkm0c2Hi0DYHFN7VXDJX1IHNIITB-viic0sL5pk_UN3OUShqTOzCDxb;pt_pin=%E6%80%AA%E7%9B%97%E5%9F%BA%E5%BE%B78768611;"),
//                new BasicHeader("User-Agent", "dapp;android;10.0.2;6.0.1;3353932353030353031393232333-43D2833633165633334666666663;network/wifi;model/Nexus 5;addressid/0;aid/128de6e2076ea424;oaid/;osVer/23;appBuild/88569;partner/BS2020042200010;eufv/1;jdSupportDarkMode/0;Mozilla/5.0 (Linux; Android 6.0.1; Nexus 5 Build/M4B30Z; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/44.0.2403.117 Mobile Safari/537.36")
//        };


//        GET /client.action? Host: api.m.jd.com
//        Connection: keep-alive
//        Cookie: buildtime=20210906;wxapp_type=1;wxapp_version=7.9.60;wxapp_scene=1036;cid=5;visitkey=65665112084541631034883907;gender=1;province=Guangdong;city=Shenzhen;country=China;nickName=%E4%BA%AC%E4%B8%9C%E7%94%A8%E6%88%B7;avatarUrl=https%3A%2F%2Fimg11.360buyimg.com%2Fjdphoto%2Fs120x120_jfs%2Ft1%2F82031%2F9%2F5133%2F19337%2F5d36bcadE9cdb240c%2Fccc58f73b721ec2d.png;wxNickName=%E4%BA%AC%E4%B8%9C%E7%94%A8%E6%88%B7;wxAvatarUrl=https%3A%2F%2Fimg11.360buyimg.com%2Fjdphoto%2Fs120x120_jfs%2Ft1%2F82031%2F9%2F5133%2F19337%2F5d36bcadE9cdb240c%2Fccc58f73b721ec2d.png;__jda=122270672.09f749ae4d702dc455ecf59693b6cb8a.1631034884594.1631034884594.1631034884594.1;network=wifi;__wga=1631035202756.1631034884814.1631034884814.1631034884814.12.1;__jdv=122270672%7Candroidapp%7Ct_335139774%7Cappshare%7CWxfriends%7C1631035202756;PPRD_P=EA.17078.26.1-LOGID.1631035161361.2007862294;shshshfpa=49f36431-12ce-562c-b9ee-0efe0ed1d4a2-1631034885;shshshfp=8ef1052498d8c579b6e16b0a06aeb4fc;shshshsID=0345eb7f21e5581f12a22891a18361f8_6_1631035202544;shshshfpb=nOkMT5jwi%2BqZVyvljizUjkA%3D%3D;hf_time=1631034885172;jdpin=jd_64e40afd28100;mcossmd=1499f4f3181410674226e2b4eaae0c00;open_id=oTGnpnOAC8RQwEoCPCrb6uHxgDq8;pin=jd_64e40afd28100;pinStatus=4;unionid=oCwKwuMOHb-8GZaGnyvO5T4IjXwk;wid=4010720157;wq_uin=4010720157;wq_unionid=oCwKwuMOHb-8GZaGnyvO5T4IjXwk;wxapp_openid=oA1P50IEgd1NwQLgnPJkXZOCOPOk;skey=zw1CB0C04D3ABD6D86AD7F10AF95E44E89121EB85EE5D27CE05CEB583E4089A962C25121606D3C873E13C7D48ADBEFBA0D152E06A994CD698C32933726871435B1B31391D52AC1BC9A256575156A4CC56289B9B039C8ABD87776A91852CCF033F9;wq_skey=zw1CB0C04D3ABD6D86AD7F10AF95E44E89121EB85EE5D27CE05CEB583E4089A962C25121606D3C873E13C7D48ADBEFBA0D152E06A994CD698C32933726871435B1B31391D52AC1BC9A256575156A4CC56289B9B039C8ABD87776A91852CCF033F9;ou=1758F4BF79338553CD775F59B13AB7C4AE404C2E1C7B5546F806A098806665F8F9911FA61E0ACC84109128DADBBD248DCCBA13A4ECEF72C9BB244027375EBE8A081F2237B08E0A2B2DC1D1B606276690;wq_auth_token=317D360D2C531EFAD381CF9D5BF11DD0674F4F5EA1701E794D85563F510ABF60
//        User-Agent: Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36 MicroMessenger/7.0.9.501 NetType/WIFI MiniProgramEnv/Windows WindowsWechat
//        content-type: application/json
//        Referer: https://servicewechat.com/wx91d27dbf599dff74/560/page-frame.html
//        Accept-Encoding: gzip, deflate, br


//        {"babelChannel":"121","lng":"121.425238","lat":"31.137729","sid":"b744610e2598cc9614c386057428fc5w","un_area":"2_2813_61130_0","version":14,"channel":1}
        instance.setSelfHeaders(selfHeaders);
        /**
         * body={
         * "ad_od":"share",
         * "mpin":"",
         * "shareCode":"81f8c0f0ea554b2385d4f866d4b2203f",
         * "utm_campaign":"t_335139774",
         * "utm_medium":"appshare",
         * "utm_source":"androidapp",
         * "utm_term":"Wxfriends",
         * "imageUrl":"https://thirdwx.qlogo.cn/mmopen/vi_32/DYAIOgq83eq1FhE1nHUy5xsWPibria86m0rfgg3DndcaLsqY1MuuicdJJuIZuGKJXorQ47s4Zkc2YRiczMQeFYIurg/132",
         * "nickName":"8787@wwl",
         * "version":14,
         * "channel":2,
         * "babelChannel":0
         * }&appid=wh5&loginType=1&loginWQBiz=ddnc
         */
        /**
         * https://api.m.jd.com/client.action?functionId=initForFarm&appid=wh5&body=
         * {"imageUrl":"",
         * "nickName":"",
         * "shareCode":"0a74407df5df4fa99672a037eec61f7e",
         * "babelChannel":"3",
         * "version":2,
         * "channel":1}
         *
         */
        String s = instance.doGet("https://api.m.jd.com/client.action?functionId=initForFarm&appid=wh5&body=%7B%22imageUrl%22%3A%22%22%2C%22nickName%22%3A%22%22%2C%22shareCode%22%3A%2281f8c0f0ea554b2385d4f866d4b2203f%22%2C%22babelChannel%22%3A%223%22%2C%22version%22%3A2%2C%22channel%22%3A1%7D");
        JSONObject result = JSONObject.parseObject(s);
        JSONObject o = result.getJSONObject("data").getJSONObject("userInfo").getJSONObject("baseInfo");
//        HttpEntity httpEntity = new UrlEncodedFormEntity(params, "UTF-8");
//        GET /&body=%7B%22babelChannel%22%3A%22121%22%2C%22lng%22%3A%22121.425238%22%2C%22lat%22%3A%2231.137729%22%2C%22sid%22%3A%22b744610e2598cc9614c386057428fc5w%22%2C%22un_area%22%3A%222_2813_61130_0%22%2C%22version%22%3A14%2C%22channel%22%3A1%7D&appid=wh5 HTTP/1.1

    }


    private String getResponse(String url) {
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


    @Test
    public void test01() {
        HashMap<String, String> params = new HashMap<>();
        params.put("functionId", "initForFarm");
        params.put("appid", "wh5");
        JSONObject body = new JSONObject();
        body.put("imageUrl", "");
        body.put("nickName", "");
        body.put("shareCode", "81f8c0f0ea554b2385d4f866d4b2203f");
        body.put("babelChannel", "3");
        body.put("version", "2");
        body.put("channel", "1");
        params.put("body", body.toString());
        String url = "https://api.m.jd.com/client.action";
        String s = HttpClientTool.doGet(url, params);
        Object parse = JSONObject.parse(s);
    }


}
