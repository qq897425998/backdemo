package test;

import com.jfinal.config.*;
import com.jfinal.core.JFinal;
import com.jfinal.kit.PathKit;
import com.jfinal.template.Engine;
import ctl.TestCtl;

/**
 * Created by xin on 2017/7/8.
 * Jfinal是可以拿到tomcat中跑的 遵循J2EE标准
 *
 * Act Vertx 是自己的标准不能拿到Tomact中跑的
 *
 * 三大框架总是没有main方法的 由xml配置告诉servalte去跑
 *
 *
 * Jfinal实现servlet标准是 用Jetty当servlet容器(启动器)
 *
 * 同样是支持J2EE标准 比Spring简单的多
 */
public class JfinalTest extends JFinalConfig {

    public static void main(String[] args) {
        /**
         * 特别注意：Eclipse 之下建议的启动方式
         */
        JFinal.start(String.format("%s/src/main/webapp",PathKit.getWebRootPath()), 8081, "/");

        /**
         * 特别注意：IDEA 之下建议的启动方式，仅比 eclipse 之下少了最后一个参数
         */
        // JFinal.start("WebRoot", 80, "/");
    }

    @Override
    public void configConstant(Constants constants) {

    }

    @Override
    public void configRoute(Routes routes) {
        routes.add("/main", TestCtl.class);
    }


    @Override
    public void configEngine(Engine engine) {
    }

    @Override
    public void configPlugin(Plugins plugins) {

    }

    @Override
    public void configInterceptor(Interceptors interceptors) {

    }

    @Override
    public void configHandler(Handlers handlers) {

    }
}
