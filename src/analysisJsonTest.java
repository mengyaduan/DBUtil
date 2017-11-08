/**
 * Created by Duan on 2017/11/8.
 * 尝试解析Json格式的文本
 */

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import jdk.nashorn.api.scripting.JSObject;

public class analysisJsonTest {

    public static void main(String[] args) {
        JSONObject jo = getJson();
    }

    public static JSONObject getJson(){
        String text = "{\n" +
                "        \"classes\": [\n" +
                "            {\n" +
                "                \"cases\": [\n" +
                "                    {\n" +
                "                        \"api\": \"\",\n" +
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
                "                \"cases\": [\n" +
                "                    {\n" +
                "                        \"api\": \"\",\n" +
                "                        \"desc\": \"Tid=null\",\n" +
                "                        \"enableStatus\": true,\n" +
                "                        \"groups\": \"\",\n" +
                "                        \"name\": \"testAdd_TidNull\",\n" +
                "                        \"owner\": \"\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"api\": \"\",\n" +
                "                        \"desc\": \"Î´µÇÂ¼ÓÃ»§\",\n" +
                "                        \"enableStatus\": true,\n" +
                "                        \"groups\": \"\",\n" +
                "                        \"name\": \"testAdd_Notlogin\",\n" +
                "                        \"owner\": \"\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"api\": \"\",\n" +
                "                        \"desc\": \"Tid=''\",\n" +
                "                        \"enableStatus\": true,\n" +
                "                        \"groups\": \"\",\n" +
                "                        \"name\": \"testAdd_TidEmpty\",\n" +
                "                        \"owner\": \"\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"api\": \"\",\n" +
                "                        \"desc\": \"µÇÂ¼ÓÃ»§\",\n" +
                "                        \"enableStatus\": true,\n" +
                "                        \"groups\": \"\",\n" +
                "                        \"name\": \"testAdd\",\n" +
                "                        \"owner\": \"\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"api\": \"\",\n" +
                "                        \"desc\": \"²¢·¢Ïß³ÌÇ©µ½£¬Ö»ÄÜÇ©µ½Ò»´Î²Å¶Ô\",\n" +
                "                        \"enableStatus\": true,\n" +
                "                        \"groups\": \"\",\n" +
                "                        \"name\": \"testAdd_Parallel\",\n" +
                "                        \"owner\": \"\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"api\": \"\",\n" +
                "                        \"desc\": \"µÇÂ¼ÓÃ»§,ÐÂ°æÇ©µ½½Ó¿ÚÔö¼Ó·µ»Ø½ð±ÒºÍ¾\u00ADÑé×Ö¶Î\",\n" +
                "                        \"enableStatus\": true,\n" +
                "                        \"groups\": \"\",\n" +
                "                        \"name\": \"testAdd_new\",\n" +
                "                        \"owner\": \"\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"api\": \"\",\n" +
                "                        \"desc\": \"µÇÂ¼ÓÃ»§,µÇÂ¼³É¹¦ºóÖ»ÄÜÁìÈ¡Ò»´Î½ð±Ò£¬Ö»ÓÐÒ»´ÎÀúÊ·¼ÇÂ¼\",\n" +
                "                        \"enableStatus\": false,\n" +
                "                        \"groups\": \"\",\n" +
                "                        \"name\": \"testAdd_Record\",\n" +
                "                        \"owner\": \"\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"api\": \"\",\n" +
                "                        \"desc\": \"ÓÃ»§ÒÑÁ¬ÐøÇ©µ½½±Àø´ïµ½×î´óÌìÊýºó£¬Ç©µ½ÌìÊý¼ÆÊý´Ó0¿ªÊ¼\",\n" +
                "                        \"enableStatus\": true,\n" +
                "                        \"groups\": \"\",\n" +
                "                        \"name\": \"testAdd_MaxRecord\",\n" +
                "                        \"owner\": \"\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"api\": \"\",\n" +
                "                        \"desc\": \"ÓÃ»§ÒÑ¾\u00ADÇ©µ½¹ý\",\n" +
                "                        \"enableStatus\": true,\n" +
                "                        \"groups\": \"\",\n" +
                "                        \"name\": \"testAdd_AlreadySigned\",\n" +
                "                        \"owner\": \"\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"api\": \"\",\n" +
                "                        \"desc\": \"²¢·¢Ïß³ÌÇ©µ½£¬Ö»ÄÜÇ©µ½Ò»´Î²Å¶Ô\",\n" +
                "                        \"enableStatus\": true,\n" +
                "                        \"groups\": \"\",\n" +
                "                        \"name\": \"testAdd_ParallelResult\",\n" +
                "                        \"owner\": \"\"\n" +
                "                    }\n" +
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


