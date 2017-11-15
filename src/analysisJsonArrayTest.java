/**
 * Created by Duan on 2017/11/8.
 * 尝试解析Json格式的文本
 */

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class analysisJsonArrayTest {


    public static JSONArray getJsonarray() {
        String file = "resource/file1.txt";
        String text = readFileByLines(file);
//        System.out.println(text);
        JSONArray jo = JSON.parseArray(text);

        return jo;
    }

    public static void main(String[] args) throws SQLException {
        JSONArray jo = getJsonarray();
        ArrayList<String> namelist = new ArrayList<String>();
        ArrayList<String> casenumlist = new ArrayList<String>();
        for (int i = 0; i < jo.size(); ++i) {
            namelist.add(jo.getJSONObject(i).getString("name"));
            casenumlist.add(jo.getJSONObject(i).getString("total"));
        }

        for (int i = 0;i<namelist.size();i++){
            CRUD.read();
//            CRUD.create(namelist.get(i), casenumlist.get(i));
            CRUD.read();
        }


    }

    public static String readFileByLines(String fileName) {
        FileInputStream file = null;
        BufferedReader reader = null;
        InputStreamReader inputFileReader = null;
        String content = "";
        String tempString = null;
        try {
            file = new FileInputStream(fileName);
            inputFileReader = new InputStreamReader(file, "utf-8");
            reader = new BufferedReader(inputFileReader);
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                content += tempString;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
        return content;
    }

}


