import domain.Banana;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @title Demo
 * @Author dominiczhu
 * @Date 2020/12/22 上午9:18
 * @Version 1.0
 */
public class Demo {

    @Test
    public void demo(){

        Banana banana = new Banana();
        if(banana.i==1){
            System.out.println(banana.i);
        }

        if(banana!=null){

        }

        try {
            throw new Exception("temp");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


}
