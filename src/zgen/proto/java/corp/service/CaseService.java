package corp.service;

import io.quarkus.grpc.MutinyService;

@jakarta.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: case-service.proto")
public interface CaseService extends MutinyService {

    
    io.smallrye.mutiny.Uni<corp.model.Model.Case> get(corp.model.Model.ById request);
    
    io.smallrye.mutiny.Uni<corp.model.Model.Case> create(corp.model.Model.Case request);
    
    io.smallrye.mutiny.Uni<corp.model.Model.Case> update(corp.model.Model.Case request);
    /**
         * <pre>
         * google.protobuf.Empty
         * </pre>
         */
    io.smallrye.mutiny.Uni<corp.model.Model.CaseList> getAll(com.google.protobuf.Empty request);
    
    
    

}