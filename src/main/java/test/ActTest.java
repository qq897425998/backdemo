package test;

import act.Act;
import org.osgl.mvc.annotation.GetAction;

/**
 * Created by xin on 2017/7/8.
 * 页面可实时更新
 */
public class ActTest {
    @GetAction("/abc")
    public String abc()  {
        return "Hello abc";
    }

    @GetAction("/abd")
    public String abd()  {

        return "Hello abd!";
    }

    public static void main(String[] args) throws Exception {
        Act.start("Hello World Demo");
    }
}
