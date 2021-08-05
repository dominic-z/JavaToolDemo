package demo;

import org.junit.Test;

import java.nio.charset.Charset;
import java.util.Arrays;

/**
 * @author dominiczhu
 * @version 1.0
 * @title StringDemo
 * @date 2021/8/5 下午6:22
 */
public class StringDemo {

    @Test
    public void testCharset() {
        String s = "你好";
        System.out.println("系统默认编码：" + System.getProperty("file.encoding"));
        System.out.println(Arrays.toString(s.getBytes(Charset.forName("unicode"))));
        System.out.println(Arrays.toString(s.getBytes(Charset.forName("utf8"))));
        System.out.println(Arrays.toString(s.getBytes()));

        showString(s, "gbk");
        showString(s, "utf8");
        showString(s, "utf16");
        showString(s, "unicode");
        showString(s, "ascii");
    }

    private void showString(String s, String charSet) {
        System.out.println("==========" + charSet + "========");
        byte[] bytes = s.getBytes();
        String ss = new String(bytes, 0, bytes.length, Charset.forName(charSet));

        System.out.println(ss);
        System.out.println(Arrays.toString(ss.toCharArray()));
        System.out.println(Arrays.toString(ss.getBytes()));
    }

}
