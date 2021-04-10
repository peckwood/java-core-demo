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
}
