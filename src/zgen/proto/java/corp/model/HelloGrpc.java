package corp.model;

import io.quarkus.grpc.MutinyService;

@jakarta.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: hello.proto")
public interface HelloGrpc extends MutinyService {

    
    io.smallrye.mutiny.Uni<corp.model.HelloReply> sayHello(corp.model.HelloRequest request);
    
    
    

}