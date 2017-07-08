package ctl;

import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;

/**
 * Created by xin on 2017/7/8.
 */
public class RfCtl extends Controller{
    @ActionKey("/main/aaa")
    public void index2(){
        super.renderText("this is hahha");

    }
}
