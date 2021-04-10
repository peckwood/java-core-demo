package com.d.multithreading.threadlocal.baeldung;

import java.util.UUID;

class UserRepository{
    String getUserNameForUserId(Integer userId){
        return UUID.randomUUID().toString();
    }
}
