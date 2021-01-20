package com.ls.aip.client;

import com.java.pro.Logger;
import com.ls.aip.util.LSAipClientConfiguration;

import java.util.Calendar;
import java.util.concurrent.atomic.AtomicBoolean;

public class LSBaseClient {
    //SELECT TABLE_NAME,PARTITION_NAME FROM USER_TAB_PARTITIONS WHERE TABLE_NAME='M_EPIDEMIC_STATISTICS';
    protected String appId;
    protected String aipKey;
    protected String aipToken;
    protected String accessToken;
    protected AtomicBoolean isAuthorized;
    protected AtomicBoolean isBceKey;
    protected Calendar expireDate;
    protected LSBaseClient.AuthState state;
    protected LSAipClientConfiguration config;
    protected static final Logger LOGGER = Logger

    class AuthState{
        private EAuthState state;

    }

}
