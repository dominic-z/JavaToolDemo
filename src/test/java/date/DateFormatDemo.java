package date;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author dominiczhu
 * @version 1.0
 * @title DateFormatDemo
 * @date 2021/5/13 下午2:22
 */
public class DateFormatDemo {

    @Test
    public void date2Str(){
        Date date=new Date();

        // mm代表分钟至少占两位，例如0x
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("mm:ss:S");
        System.out.println(simpleDateFormat.format(date));
    }
}
