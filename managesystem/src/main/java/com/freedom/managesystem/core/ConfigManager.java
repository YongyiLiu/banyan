package com.freedom.managesystem.core;

import com.freedom.messagebus.common.model.AuthInfo;

public class ConfigManager {

    public static final String HOST = "115.29.96.85";
    public static final int    PORT = 15672;

    public static final String HTTP_API_QUEUES   = "/api/queues";
    public static final String HTTP_API_OVERVIEW = "/api/overview";
    public static final String HTTP_API_NODES    = "/api/nodes";
    public static final String HTTP_API_EXCHANGE = "/api/exchanges";
    public static final String HTTP_API_CHANNEL  = "/api/channels";

    public static final AuthInfo DEFAULT_AUTH_INFO = new AuthInfo("guest", "guest");

}