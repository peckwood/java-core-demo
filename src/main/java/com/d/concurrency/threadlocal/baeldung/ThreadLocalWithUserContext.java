package com.d.concurrency.threadlocal.baeldung;

public class ThreadLocalWithUserContext implements Runnable{
    private Integer userId;
    private UserRepository userRepository = new UserRepository();
    static ThreadLocal<String> usernameThreadLocal = new ThreadLocal<>();

    @Override
    public void run(){
        String username = userRepository.getUserNameForUserId(userId);
        usernameThreadLocal.set(username);
        System.out.println("userId " + userId + " username: " + usernameThreadLocal.get() );
    }

    ThreadLocalWithUserContext(Integer userId){
        this.userId = userId;
    }



}
