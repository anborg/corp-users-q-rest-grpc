package org.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;
import corp.model.HelloGrpc;
import corp.model.HelloReply;
import corp.model.HelloRequest;

import io.quarkus.grpc.GrpcClient;
import io.quarkus.test.junit.QuarkusTest;

import org.junit.jupiter.api.Test;


@QuarkusTest
public class HelloGrpcServiceTest {


    @GrpcClient("hello")
    HelloGrpc helloGrpc;

    @Test
    public void testHello() {
        HelloReply reply = helloGrpc
                .sayHello(HelloRequest.newBuilder().setName("Neo").build()).await().atMost(Duration.ofSeconds(5));
        assertEquals("Hello Neo!", reply.getMessage());
    }

}
