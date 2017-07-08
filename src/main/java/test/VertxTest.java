package test;

import io.vertx.core.AbstractVerticle;

/**
 * Created by xin on 2017/7/8.
 * 异步
 */
public class VertxTest extends AbstractVerticle{
    public void start() {
        vertx.createHttpServer().requestHandler(req -> {
            req.response()
                    .putHeader("content-type", "text/plain")
                    .end("Hello from Vert.x!");
        }).listen(8080);
    }


    public static void main(String[] args) {
        Runner.runExample(VertxTest.class);
    }
}
