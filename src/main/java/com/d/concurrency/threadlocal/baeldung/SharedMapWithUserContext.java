package com.d.concurrency.threadlocal.baeldung;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class SharedMapWithUserContext implements Runnable{
    static Map<Integer, Context> userContextPerUserId = new ConcurrentHashMap<>();
    private Integer userId;
    private UserRepository userRepository = new UserRepository();

    @Override
    public void run(){
        String username = userRepository.getUserNameForUserId(userId);
        userContextPerUserId.put(userId, new Context(username));
    }

    public SharedMapWithUserContext(Integer userId){
        this.userId = userId;
    }
}
