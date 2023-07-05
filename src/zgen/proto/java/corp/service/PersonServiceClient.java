package corp.service;

import java.util.function.BiFunction;

import io.quarkus.grpc.MutinyClient;

@jakarta.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: person-service.proto")
public class PersonServiceClient implements PersonService, MutinyClient<MutinyPersonServiceGrpc.MutinyPersonServiceStub> {

    private final MutinyPersonServiceGrpc.MutinyPersonServiceStub stub;

    public PersonServiceClient(String name, io.grpc.Channel channel, BiFunction<String, MutinyPersonServiceGrpc.MutinyPersonServiceStub, MutinyPersonServiceGrpc.MutinyPersonServiceStub> stubConfigurator) {
       this.stub = stubConfigurator.apply(name,MutinyPersonServiceGrpc.newMutinyStub(channel));
    }

    private PersonServiceClient(MutinyPersonServiceGrpc.MutinyPersonServiceStub stub) {
       this.stub = stub;
    }

    public PersonServiceClient newInstanceWithStub(MutinyPersonServiceGrpc.MutinyPersonServiceStub stub) {
        return new PersonServiceClient(stub);
    }

    @Override
    public MutinyPersonServiceGrpc.MutinyPersonServiceStub getStub() {
       return stub;
    }

    @Override
    public io.smallrye.mutiny.Uni<corp.model.Model.Person> get(corp.model.Model.ById request) {
       return stub.get(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<corp.model.Model.Person> create(corp.model.Model.Person request) {
       return stub.create(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<corp.model.Model.Person> update(corp.model.Model.Person request) {
       return stub.update(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<corp.model.Model.Xref> xrefAdd(corp.model.Model.Xref request) {
       return stub.xrefAdd(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<corp.model.Model.Xref> xrefUpdate(corp.model.Model.Xref request) {
       return stub.xrefUpdate(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<corp.model.Model.Xref> xrefSync(corp.model.Model.Xref request) {
       return stub.xrefSync(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<corp.model.Model.PersonList> getAll(com.google.protobuf.Empty request) {
       return stub.getAll(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<corp.service.PersonServices.SearchRes> personsLike(corp.service.PersonServices.SearchReqPerson request) {
       return stub.personsLike(request);
    }

}