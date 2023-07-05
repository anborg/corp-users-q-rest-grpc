package corp.service;

import io.quarkus.grpc.MutinyService;

@jakarta.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: person-service.proto")
public interface PersonService extends MutinyService {

    
    io.smallrye.mutiny.Uni<corp.model.Model.Person> get(corp.model.Model.ById request);
    
    io.smallrye.mutiny.Uni<corp.model.Model.Person> create(corp.model.Model.Person request);
    /**
         * <pre>
         *  if error, add detils?
         * </pre>
         */
    io.smallrye.mutiny.Uni<corp.model.Model.Person> update(corp.model.Model.Person request);
    
    io.smallrye.mutiny.Uni<corp.model.Model.Xref> xrefAdd(corp.model.Model.Xref request);
    
    io.smallrye.mutiny.Uni<corp.model.Model.Xref> xrefUpdate(corp.model.Model.Xref request);
    
    io.smallrye.mutiny.Uni<corp.model.Model.Xref> xrefSync(corp.model.Model.Xref request);
    /**
         * <pre>
         * google.protobuf.Empty
         * </pre>
         */
    io.smallrye.mutiny.Uni<corp.model.Model.PersonList> getAll(com.google.protobuf.Empty request);
    
    io.smallrye.mutiny.Uni<corp.service.PersonServices.SearchRes> personsLike(corp.service.PersonServices.SearchReqPerson request);
    
    
    

}