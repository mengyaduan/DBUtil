/**
 * Created by Duan on 2017/11/8.
 * 尝试解析Json格式的文本
 */

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.Objects;

public class analysisJsonTest {

    public static void main(String[] args) {
        JSONObject jo = getJson();
        int a = jo.getJSONArray("classes").size();
        String b = jo.getJSONArray("classes").getJSONObject(0).getJSONArray("cases1").getJSONObject(0).getString("api");
        System.out.println(a);
        System.out.println(b);
    }

    public static JSONObject getJson() {
        String text = "{\n" +
                "        \"classes\": [\n" +
                "            {\n" +
                "                \"cases1\": [\n" +
                "                    {\n" +
                "                        \"api\": \"fucku\",\n" +
                "                        \"desc\": \"µ±end¸ñÊ½ÎÞÐ§\",\n" +
                "                        \"enableStatus\": true,\n" +
                "                        \"groups\": \"\",\n" +
                "                        \"name\": \"testRecord_EndFormatInvalid\",\n" +
                "                        \"owner\": \"\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"desc\": \"\",\n" +
                "                \"enabledCases\": [],\n" +
                "                \"name\": \"com.autonavi.test.framework.aos.autosns.checkin.RecordTest\",\n" +
                "                \"total\": 13\n" +
                "            },\n" +
                "            {\n" +
                "                \"cases2\": [\n" +
                "                    {\n" +
                "                        \"api\": \"\",\n" +
                "                        \"desc\": \"Tid=null\",\n" +
                "                        \"enableStatus\": true,\n" +
                "                        \"groups\": \"\",\n" +
                "                        \"name\": \"testAdd_TidNull\",\n" +
                "                        \"owner\": \"\"\n" +
                "                    },\n" +
                "                ],\n" +
                "                \"desc\": \"\",\n" +
                "                \"enabledCases\": [],\n" +
                "                \"name\": \"com.autonavi.test.framework.aos.autosns.checkin.AddTest\",\n" +
                "                \"total\": 10\n" +
                "            }\n" +
                "        ],\n" +
                "        \"name\": \"com.autonavi.test.framework.aos.autosns.checkin\",\n" +
                "        \"total\": 23\n" +
                "    }";

        JSONObject jo = JSON.parseObject(text);
        return jo;
    }


}


