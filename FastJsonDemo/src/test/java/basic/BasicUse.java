package basic;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import org.junit.Test;

import java.util.Map;

/**
 * @author dominiczhu
 * @version 1.0
 * @title BasicUse
 * @date 2021/2/23 下午5:28
 */
public class BasicUse {

    @Test
    public void toStringMap(){
        String jsonString = "{\"name\":\"jacky\",\"time\":1563957295755,\"age\":23}";
        Map<String, String> map = JSON.parseObject(jsonString, new TypeReference<Map<String, String>>(){});

        System.out.println(map);
        System.out.println(map.get("name"));

        JSONObject json=new JSONObject();
        json.put("abc","");
        System.out.println(json.toJSONString());
    }
}
