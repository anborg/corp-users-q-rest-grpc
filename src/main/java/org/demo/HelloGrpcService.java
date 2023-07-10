package org.demo;

import corp.model.HelloReply;
import corp.model.HelloRequest;
import io.quarkus.grpc.GrpcService;

import io.smallrye.mutiny.Uni;
import corp.model.HelloGrpc;

@GrpcService
public class HelloGrpcService implements HelloGrpc {

    @Override
    public Uni<HelloReply> sayHello(HelloRequest request) {
        return Uni.createFrom().item("Hello " + request.getName() + "!")
                .map(msg -> HelloReply.newBuilder().setMessage(msg).build());
    }

}
