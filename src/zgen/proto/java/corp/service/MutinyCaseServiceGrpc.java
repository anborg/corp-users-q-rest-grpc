package corp.service;

import static corp.service.CaseServiceGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;

@jakarta.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: case-service.proto")
public final class MutinyCaseServiceGrpc implements io.quarkus.grpc.MutinyGrpc {
    private MutinyCaseServiceGrpc() {}

    public static MutinyCaseServiceStub newMutinyStub(io.grpc.Channel channel) {
        return new MutinyCaseServiceStub(channel);
    }

    
    public static final class MutinyCaseServiceStub extends io.grpc.stub.AbstractStub<MutinyCaseServiceStub> implements io.quarkus.grpc.MutinyStub {
        private CaseServiceGrpc.CaseServiceStub delegateStub;

        private MutinyCaseServiceStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = CaseServiceGrpc.newStub(channel);
        }

        private MutinyCaseServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = CaseServiceGrpc.newStub(channel).build(channel, callOptions);
        }

        @Override
        protected MutinyCaseServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MutinyCaseServiceStub(channel, callOptions);
        }

        
        public io.smallrye.mutiny.Uni<corp.model.Model.Case> get(corp.model.Model.ById request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::get);
        }

        
        public io.smallrye.mutiny.Uni<corp.model.Model.Case> create(corp.model.Model.Case request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::create);
        }

        
        public io.smallrye.mutiny.Uni<corp.model.Model.Case> update(corp.model.Model.Case request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::update);
        }

        /**
         * <pre>
         * google.protobuf.Empty
         * </pre>
         */
        public io.smallrye.mutiny.Uni<corp.model.Model.CaseList> getAll(com.google.protobuf.Empty request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::getAll);
        }

    }

    
    public static abstract class CaseServiceImplBase implements io.grpc.BindableService {

        private String compression;
        /**
        * Set whether the server will try to use a compressed response.
        *
        * @param compression the compression, e.g {@code gzip}
        */
        public CaseServiceImplBase withCompression(String compression) {
        this.compression = compression;
        return this;
        }


        
        public io.smallrye.mutiny.Uni<corp.model.Model.Case> get(corp.model.Model.ById request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<corp.model.Model.Case> create(corp.model.Model.Case request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<corp.model.Model.Case> update(corp.model.Model.Case request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         * google.protobuf.Empty
         * </pre>
         */
        public io.smallrye.mutiny.Uni<corp.model.Model.CaseList> getAll(com.google.protobuf.Empty request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            corp.service.CaseServiceGrpc.getGetMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            corp.model.Model.ById,
                                            corp.model.Model.Case>(
                                            this, METHODID_GET, compression)))
                    .addMethod(
                            corp.service.CaseServiceGrpc.getCreateMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            corp.model.Model.Case,
                                            corp.model.Model.Case>(
                                            this, METHODID_CREATE, compression)))
                    .addMethod(
                            corp.service.CaseServiceGrpc.getUpdateMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            corp.model.Model.Case,
                                            corp.model.Model.Case>(
                                            this, METHODID_UPDATE, compression)))
                    .addMethod(
                            corp.service.CaseServiceGrpc.getGetAllMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.google.protobuf.Empty,
                                            corp.model.Model.CaseList>(
                                            this, METHODID_GET_ALL, compression)))
                    .build();
        }
    }

    private static final int METHODID_GET = 0;
    private static final int METHODID_CREATE = 1;
    private static final int METHODID_UPDATE = 2;
    private static final int METHODID_GET_ALL = 3;

    private static final class MethodHandlers<Req, Resp> implements
            io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
        private final CaseServiceImplBase serviceImpl;
        private final int methodId;
        private final String compression;

        MethodHandlers(CaseServiceImplBase serviceImpl, int methodId, String compression) {
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
                            (io.grpc.stub.StreamObserver<corp.model.Model.Case>) responseObserver,
                            compression,
                            serviceImpl::get);
                    break;
                case METHODID_CREATE:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((corp.model.Model.Case) request,
                            (io.grpc.stub.StreamObserver<corp.model.Model.Case>) responseObserver,
                            compression,
                            serviceImpl::create);
                    break;
                case METHODID_UPDATE:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((corp.model.Model.Case) request,
                            (io.grpc.stub.StreamObserver<corp.model.Model.Case>) responseObserver,
                            compression,
                            serviceImpl::update);
                    break;
                case METHODID_GET_ALL:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.google.protobuf.Empty) request,
                            (io.grpc.stub.StreamObserver<corp.model.Model.CaseList>) responseObserver,
                            compression,
                            serviceImpl::getAll);
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