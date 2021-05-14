package advanced;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import domain.Student;
import domain.enums.Gender;
import org.junit.Test;

/**
 * @author dominiczhu
 * @version 1.0
 * @title SerializerFeatureDemo
 * @date 2021/2/23 下午5:28
 */
public class SerializerFeatureDemo {

    public Student getStudent() {
        Student stu = new Student();
        stu.setAge(10);
//        stu.setName("dom");
        stu.setGender(Gender.MALE);

        return stu;
    }

    @Test
    public void singleQuotesDemo() {
        Student stu = getStudent();

        String singleQuotesStu = JSON.toJSONString(stu, SerializerFeature.UseSingleQuotes);
        System.out.println(singleQuotesStu);

        // 支持直接对单引号进行转换
        JSONObject stuJsonObj = JSON.parseObject(singleQuotesStu);
        System.out.println(stuJsonObj);

    }

}
