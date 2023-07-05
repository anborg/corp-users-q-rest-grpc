package corp.service;

import java.util.function.BiFunction;

import io.quarkus.grpc.MutinyClient;

@jakarta.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: case-service.proto")
public class CaseServiceClient implements CaseService, MutinyClient<MutinyCaseServiceGrpc.MutinyCaseServiceStub> {

    private final MutinyCaseServiceGrpc.MutinyCaseServiceStub stub;

    public CaseServiceClient(String name, io.grpc.Channel channel, BiFunction<String, MutinyCaseServiceGrpc.MutinyCaseServiceStub, MutinyCaseServiceGrpc.MutinyCaseServiceStub> stubConfigurator) {
       this.stub = stubConfigurator.apply(name,MutinyCaseServiceGrpc.newMutinyStub(channel));
    }

    private CaseServiceClient(MutinyCaseServiceGrpc.MutinyCaseServiceStub stub) {
       this.stub = stub;
    }

    public CaseServiceClient newInstanceWithStub(MutinyCaseServiceGrpc.MutinyCaseServiceStub stub) {
        return new CaseServiceClient(stub);
    }

    @Override
    public MutinyCaseServiceGrpc.MutinyCaseServiceStub getStub() {
       return stub;
    }

    @Override
    public io.smallrye.mutiny.Uni<corp.model.Model.Case> get(corp.model.Model.ById request) {
       return stub.get(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<corp.model.Model.Case> create(corp.model.Model.Case request) {
       return stub.create(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<corp.model.Model.Case> update(corp.model.Model.Case request) {
       return stub.update(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<corp.model.Model.CaseList> getAll(com.google.protobuf.Empty request) {
       return stub.getAll(request);
    }

}