package org.demo;

import io.quarkus.grpc.MutinyService;

@jakarta.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: hello.proto")
public interface HelloGrpc extends MutinyService {

    
    io.smallrye.mutiny.Uni<org.demo.HelloReply> sayHello(org.demo.HelloRequest request);
    
    
    

}