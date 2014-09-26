package com.freedom.messagebus.common;

/**
 * User: yanghua
 * Date: 6/29/14
 * Time: 9:11 PM
 * Copyright (c) 2013 yanghua. All rights reserved.
 */
public class CONSTS {

    @Deprecated
    public static final String DEFAULT_QUEUE_NAME = "queue";

    @Deprecated
    public static final String ROUTER_NAME_PATTERN = "%s_ROUTER_%s";

    @Deprecated
    public static final String TRANSFER_CENTER_NAME_PATTERN = "%s_TRANSFER_CENTER_%s";

    public static final String PROXY_EXCHANGE_NAME = "exchange.proxy";

    public static final String DEFAULT_AUTH_QUEUE_NAME = "queue.proxy.message.sys.auth";

    public static final String DEFAULT_AUTH_ROUTING_KEY_NAME = "routingkey.proxy.message.sys.auth";

    public static final long AUTH_DEFAULT_TIMEOUT = 10000l;

    public static final String CONFIG_BASE_DIR = "/var/messagebus/";

    public static final String TOPOLOGY_FILE_NAME = "topology.xml";

    public static final String PATH_FILE_NAME = "path.xml";

    public static final Byte[] EMPTY_BYTE_ARRAY = new Byte[0];

    public static final byte[] EMPTY_PRIMITIVE_BYTE_ARRAY = new byte[0];

    public static final String META_EXCHANGE_NAME = "exchange.meta";

    public static int DEFAULT_AUTH_REQUEST_TIMEOUT_SECONDS = 30;


    //region server const
    public static String EXPORTED_NODE_FILE_PATH = "/tmp/messagebus_router_for_zookeeper.xml";

    public static String EXPORTED_NODE_CMD_STR = "mysqldump -uroot -ppassw0rd -X messagebus_sys_db NODE> ";

    public static String ZOOKEEPER_ROOT_PATH_FOR_ROUTER = "/router";

    public static String ZOOKEEPER_ROOT_PATH_FOR_CONFIG = "/config";

    public static String ZOOKEEPER_ROOT_PATH_FOR_EVENT = "/event";

    public static String DEFAULT_CONSOLE_QUEUE_NAME = "queue.proxy.log.console";

    public static long DEFAULT_DATACENTER_ID_FOR_UUID = 00001L;
    //endregion
}