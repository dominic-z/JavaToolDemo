package advanced;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import domain.Student;
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

        return stu;
    }

    @Test
    public void toJsonString() {
        Student stu = getStudent();
        String jsonString = JSON.toJSONString(stu);
        System.out.println(jsonString);

        Student newStu = JSON.parseObject(jsonString, Student.class);
        System.out.println(newStu);

        String featureString = JSON.toJSONString(stu, SerializerFeature.WriteMapNullValue);
        System.out.println(featureString);
    }
}
