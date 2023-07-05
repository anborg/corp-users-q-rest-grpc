package corp.service;

import static corp.service.PersonServiceGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;

@jakarta.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: person-service.proto")
public final class MutinyPersonServiceGrpc implements io.quarkus.grpc.MutinyGrpc {
    private MutinyPersonServiceGrpc() {}

    public static MutinyPersonServiceStub newMutinyStub(io.grpc.Channel channel) {
        return new MutinyPersonServiceStub(channel);
    }

    
    public static final class MutinyPersonServiceStub extends io.grpc.stub.AbstractStub<MutinyPersonServiceStub> implements io.quarkus.grpc.MutinyStub {
        private PersonServiceGrpc.PersonServiceStub delegateStub;

        private MutinyPersonServiceStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = PersonServiceGrpc.newStub(channel);
        }

        private MutinyPersonServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = PersonServiceGrpc.newStub(channel).build(channel, callOptions);
        }

        @Override
        protected MutinyPersonServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MutinyPersonServiceStub(channel, callOptions);
        }

        
        public io.smallrye.mutiny.Uni<corp.model.Model.Person> get(corp.model.Model.ById request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::get);
        }

        
        public io.smallrye.mutiny.Uni<corp.model.Model.Person> create(corp.model.Model.Person request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::create);
        }

        /**
         * <pre>
         *  if error, add detils?
         * </pre>
         */
        public io.smallrye.mutiny.Uni<corp.model.Model.Person> update(corp.model.Model.Person request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::update);
        }

        
        public io.smallrye.mutiny.Uni<corp.model.Model.Xref> xrefAdd(corp.model.Model.Xref request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::xrefAdd);
        }

        
        public io.smallrye.mutiny.Uni<corp.model.Model.Xref> xrefUpdate(corp.model.Model.Xref request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::xrefUpdate);
        }

        
        public io.smallrye.mutiny.Uni<corp.model.Model.Xref> xrefSync(corp.model.Model.Xref request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::xrefSync);
        }

        /**
         * <pre>
         * google.protobuf.Empty
         * </pre>
         */
        public io.smallrye.mutiny.Uni<corp.model.Model.PersonList> getAll(com.google.protobuf.Empty request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::getAll);
        }

        
        public io.smallrye.mutiny.Uni<corp.service.PersonServices.SearchRes> personsLike(corp.service.PersonServices.SearchReqPerson request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::personsLike);
        }

    }

    
    public static abstract class PersonServiceImplBase implements io.grpc.BindableService {

        private String compression;
        /**
        * Set whether the server will try to use a compressed response.
        *
        * @param compression the compression, e.g {@code gzip}
        */
        public PersonServiceImplBase withCompression(String compression) {
        this.compression = compression;
        return this;
        }


        
        public io.smallrye.mutiny.Uni<corp.model.Model.Person> get(corp.model.Model.ById request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<corp.model.Model.Person> create(corp.model.Model.Person request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  if error, add detils?
         * </pre>
         */
        public io.smallrye.mutiny.Uni<corp.model.Model.Person> update(corp.model.Model.Person request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<corp.model.Model.Xref> xrefAdd(corp.model.Model.Xref request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<corp.model.Model.Xref> xrefUpdate(corp.model.Model.Xref request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<corp.model.Model.Xref> xrefSync(corp.model.Model.Xref request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         * google.protobuf.Empty
         * </pre>
         */
        public io.smallrye.mutiny.Uni<corp.model.Model.PersonList> getAll(com.google.protobuf.Empty request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<corp.service.PersonServices.SearchRes> personsLike(corp.service.PersonServices.SearchReqPerson request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            corp.service.PersonServiceGrpc.getGetMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            corp.model.Model.ById,
                                            corp.model.Model.Person>(
                                            this, METHODID_GET, compression)))
                    .addMethod(
                            corp.service.PersonServiceGrpc.getCreateMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            corp.model.Model.Person,
                                            corp.model.Model.Person>(
                                            this, METHODID_CREATE, compression)))
                    .addMethod(
                            corp.service.PersonServiceGrpc.getUpdateMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            corp.model.Model.Person,
                                            corp.model.Model.Person>(
                                            this, METHODID_UPDATE, compression)))
                    .addMethod(
                            corp.service.PersonServiceGrpc.getXrefAddMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            corp.model.Model.Xref,
                                            corp.model.Model.Xref>(
                                            this, METHODID_XREF_ADD, compression)))
                    .addMethod(
                            corp.service.PersonServiceGrpc.getXrefUpdateMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            corp.model.Model.Xref,
                                            corp.model.Model.Xref>(
                                            this, METHODID_XREF_UPDATE, compression)))
                    .addMethod(
                            corp.service.PersonServiceGrpc.getXrefSyncMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            corp.model.Model.Xref,
                                            corp.model.Model.Xref>(
                                            this, METHODID_XREF_SYNC, compression)))
                    .addMethod(
                            corp.service.PersonServiceGrpc.getGetAllMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.google.protobuf.Empty,
                                            corp.model.Model.PersonList>(
                                            this, METHODID_GET_ALL, compression)))
                    .addMethod(
                            corp.service.PersonServiceGrpc.getPersonsLikeMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            corp.service.PersonServices.SearchReqPerson,
                                            corp.service.PersonServices.SearchRes>(
                                            this, METHODID_PERSONS_LIKE, compression)))
                    .build();
        }
    }

    private static final int METHODID_GET = 0;
    private static final int METHODID_CREATE = 1;
    private static final int METHODID_UPDATE = 2;
    private static final int METHODID_XREF_ADD = 3;
    private static final int METHODID_XREF_UPDATE = 4;
    private static final int METHODID_XREF_SYNC = 5;
    private static final int METHODID_GET_ALL = 6;
    private static final int METHODID_PERSONS_LIKE = 7;

    private static final class MethodHandlers<Req, Resp> implements
            io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
        private final PersonServiceImplBase serviceImpl;
        private final int methodId;
        private final String compression;

        MethodHandlers(PersonServiceImplBase serviceImpl, int methodId, String compression) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
            this.compression = compression;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_GET:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((corp.model.Model.ById) request,
                            (io.grpc.stub.StreamObserver<corp.model.Model.Person>) responseObserver,
                            compression,
                            serviceImpl::get);
                    break;
                case METHODID_CREATE:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((corp.model.Model.Person) request,
                            (io.grpc.stub.StreamObserver<corp.model.Model.Person>) responseObserver,
                            compression,
                            serviceImpl::create);
                    break;
                case METHODID_UPDATE:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((corp.model.Model.Person) request,
                            (io.grpc.stub.StreamObserver<corp.model.Model.Person>) responseObserver,
                            compression,
                            serviceImpl::update);
                    break;
                case METHODID_XREF_ADD:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((corp.model.Model.Xref) request,
                            (io.grpc.stub.StreamObserver<corp.model.Model.Xref>) responseObserver,
                            compression,
                            serviceImpl::xrefAdd);
                    break;
                case METHODID_XREF_UPDATE:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((corp.model.Model.Xref) request,
                            (io.grpc.stub.StreamObserver<corp.model.Model.Xref>) responseObserver,
                            compression,
                            serviceImpl::xrefUpdate);
                    break;
                case METHODID_XREF_SYNC:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((corp.model.Model.Xref) request,
                            (io.grpc.stub.StreamObserver<corp.model.Model.Xref>) responseObserver,
                            compression,
                            serviceImpl::xrefSync);
                    break;
                case METHODID_GET_ALL:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.google.protobuf.Empty) request,
                            (io.grpc.stub.StreamObserver<corp.model.Model.PersonList>) responseObserver,
                            compression,
                            serviceImpl::getAll);
                    break;
                case METHODID_PERSONS_LIKE:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((corp.service.PersonServices.SearchReqPerson) request,
                            (io.grpc.stub.StreamObserver<corp.service.PersonServices.SearchRes>) responseObserver,
                            compression,
                            serviceImpl::personsLike);
                    break;
                default:
                    throw new java.lang.AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                default:
                    throw new java.lang.AssertionError();
            }
        }
    }

}