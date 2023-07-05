package corp.service;

import io.grpc.BindableService;
import io.quarkus.grpc.GrpcService;
import io.quarkus.grpc.MutinyBean;

@jakarta.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: case-service.proto")
public class CaseServiceBean extends MutinyCaseServiceGrpc.CaseServiceImplBase implements BindableService, MutinyBean {

    private final CaseService delegate;

    CaseServiceBean(@GrpcService CaseService delegate) {
       this.delegate = delegate;
    }

    @Override
    public io.smallrye.mutiny.Uni<corp.model.Model.Case> get(corp.model.Model.ById request) {
       try {
         return delegate.get(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<corp.model.Model.Case> create(corp.model.Model.Case request) {
       try {
         return delegate.create(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<corp.model.Model.Case> update(corp.model.Model.Case request) {
       try {
         return delegate.update(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<corp.model.Model.CaseList> getAll(com.google.protobuf.Empty request) {
       try {
         return delegate.getAll(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }

}