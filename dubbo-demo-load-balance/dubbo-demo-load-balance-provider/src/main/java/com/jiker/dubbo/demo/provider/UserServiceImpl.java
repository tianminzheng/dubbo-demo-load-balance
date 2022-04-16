package com.jiker.dubbo.demo.provider;

import org.apache.dubbo.rpc.RpcContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jiker.dubbo.demo.User;
import com.jiker.dubbo.demo.UserService;

public class UserServiceImpl implements UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public User getUserByUserName(String userName) {
        logger.info("getUserByUserName: " + userName + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());

        return new User(1L, "jiker, response from provider:" + RpcContext.getContext().getLocalAddress(), "123456");
    }
}
