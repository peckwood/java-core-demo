package com.d.multithreading.threadlocal.baeldung;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ThreadLocalIntegrationTest{

    @Test
    void givenThreadThatStoresContextInAMap_whenStartThread_thenShouldSetContextForBothUsers() throws InterruptedException{
        SharedMapWithUserContext user1 = new SharedMapWithUserContext(1);
        SharedMapWithUserContext user2 = new SharedMapWithUserContext(2);
        new Thread(user1).start();
        new Thread(user2).start();

        Thread.sleep(1000);

        Assertions.assertEquals(2, SharedMapWithUserContext.userContextPerUserId.size());
    }

    @Test
    void givenThreadThatStoresContextInThreadLocal_whenStartThread_thenShouldStoreContextInThreadLocal(){
        ThreadLocalWithUserContext user1 = new ThreadLocalWithUserContext(1);
        ThreadLocalWithUserContext user2 = new ThreadLocalWithUserContext(2);

        new Thread(user1).start();
        new Thread(user2).start();


    }
}
