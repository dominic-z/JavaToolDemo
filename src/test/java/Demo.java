import domain.Banana;
import org.junit.Test;

import java.util.ArrayList;

/**
 * @title Demo
 * @Author dominiczhu
 * @Date 2020/12/22 上午9:18
 * @Version 1.0
 */
public class Demo {

    class Base{

        Base(int i){
            this.name=i;
        }
        public int name;

        public void display(){
            System.out.println("Base"+name);
        }
    }

    class Derive extends Base{
        public int name;

        Derive(int i) {
            super(0);
            this.name=20;
        }

        @Override
        public void display() {
            System.out.println("derive"+name);
        }
    }

    @Test
    public void test(){

    }


}
