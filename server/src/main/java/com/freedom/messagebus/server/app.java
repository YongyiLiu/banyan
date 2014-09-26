package com.freedom.messagebus.server;

import com.freedom.messagebus.common.CONSTS;
import com.freedom.messagebus.server.bootstrap.RabbitmqInitializer;
import com.freedom.messagebus.server.bootstrap.ZookeeperInitializer;
import com.freedom.messagebus.server.daemon.ServiceLoader;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class App {

    private static final Log logger = LogFactory.getLog(App.class);

    public static void main(String[] args) {
        //TODO: test
        String host = "115.29.96.85";
        int port = 2181;

        //invoke bootstrap service
        RabbitmqInitializer rabbitmqInitializer = RabbitmqInitializer.getInstance();
        rabbitmqInitializer.launch();

        ZookeeperInitializer zookeeperInitializer = ZookeeperInitializer.getInstance(host, port);
        try {
            zookeeperInitializer.launch();
        } catch (IOException e) {
            logger.error("[main] occurs a IOException : " + e.getMessage());
        } catch (InterruptedException e) {
            logger.error("[main] occurs a InterruptedException : " + e.getMessage());
        }

        //load and start daemon service
        Map<String, Object> context = new ConcurrentHashMap<>();
        context.put("host", host);
        ServiceLoader serviceLoader = ServiceLoader.getInstance(context);
        serviceLoader.launch();

        App app = new App();

        synchronized (app) {
            try {
                //block
                app.wait(0);
            } catch (InterruptedException e) {
                logger.info("[main] occurs a InterruptedException . the server has be quited!");
            }
        }
    }

}