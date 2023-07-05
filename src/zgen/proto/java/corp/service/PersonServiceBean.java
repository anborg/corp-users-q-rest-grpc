package corp.service;

import io.grpc.BindableService;
import io.quarkus.grpc.GrpcService;
import io.quarkus.grpc.MutinyBean;

@jakarta.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: person-service.proto")
public class PersonServiceBean extends MutinyPersonServiceGrpc.PersonServiceImplBase implements BindableService, MutinyBean {

    private final PersonService delegate;

    PersonServiceBean(@GrpcService PersonService delegate) {
       this.delegate = delegate;
    }

    @Override
    public io.smallrye.mutiny.Uni<corp.model.Model.Person> get(corp.model.Model.ById request) {
       try {
         return delegate.get(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<corp.model.Model.Person> create(corp.model.Model.Person request) {
       try {
         return delegate.create(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<corp.model.Model.Person> update(corp.model.Model.Person request) {
       try {
         return delegate.update(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<corp.model.Model.Xref> xrefAdd(corp.model.Model.Xref request) {
       try {
         return delegate.xrefAdd(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<corp.model.Model.Xref> xrefUpdate(corp.model.Model.Xref request) {
       try {
         return delegate.xrefUpdate(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<corp.model.Model.Xref> xrefSync(corp.model.Model.Xref request) {
       try {
         return delegate.xrefSync(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<corp.model.Model.PersonList> getAll(com.google.protobuf.Empty request) {
       try {
         return delegate.getAll(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<corp.service.PersonServices.SearchRes> personsLike(corp.service.PersonServices.SearchReqPerson request) {
       try {
         return delegate.personsLike(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }

}