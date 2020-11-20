import com.example.tutorial.AddressBookProtos;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import examples.AddPerson;
import org.junit.Test;
import pkg1.S1;
import pkg2.S2;

import java.util.Arrays;



/**
 * @author dominiczhu
 * @date 2020/11/20 下午7:43
 */
public class Example {
    @Test
    public void serialization() throws InvalidProtocolBufferException {
        AddressBookProtos.Person person=AddPerson.PromptForAddress();
        System.out.println(person.toByteString());
        System.out.println(Arrays.toString(person.toByteArray()));
        System.out.println(person);

        AddressBookProtos.Person newPerson=AddressBookProtos.Person.parseFrom(person.toByteString());
        System.out.println(newPerson);
    }

    @Test
    public void serializationDiffProto() throws InvalidProtocolBufferException {
//        只要message一样，就可以成功反序列化
        S1.Student.Builder s1Builder=S1.Student.newBuilder().setName("abc").setAge(20).addBook("c").addBook("sha");
        ByteString bytesStr=s1Builder.build().toByteString();

        S2.Student s2=S2.Student.parseFrom(bytesStr);
    }
}
