package basic;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import domain.Student;
import domain.enums.Gender;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author dominiczhu
 * @version 1.0
 * @title BasicUse
 * @date 2021/2/23 下午5:28
 */
public class BasicUse {

    public Student getStudent() {
        Student stu = new Student();
        stu.setAge(10);
//        stu.setName("dom");
        stu.setGender(Gender.MALE);

        return stu;
    }

    @Test
    public void toStringMap(){
        String jsonString = "{\"name\":\"jacky\",\"time\":1563957295755,\"age\":23}";
        Map<String, String> map = JSON.parseObject(jsonString, new TypeReference<Map<String, String>>(){});

        System.out.println(map);
        System.out.println(map.get("name"));

        JSONObject json=new JSONObject();
        json.put("abc","");
        System.out.println(json.toJSONString());
        System.out.println(json.getString("dcf"));
    }


    @Test
    public void toJsonStringAndParseArr() {
        List<Student> students = new ArrayList<>();
        students.add(getStudent());
        students.add(getStudent());
        String jsonString = JSON.toJSONString(students);
        System.out.println(jsonString);


        List<Student> stuArr = JSON.parseArray(jsonString, Student.class);
        System.out.println(stuArr);
        List<Student> stuList = JSON.parseObject(jsonString, new TypeReference<List<Student>>() {
        });
        System.out.println(stuList);

    }
}
