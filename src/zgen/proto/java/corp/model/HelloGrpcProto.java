// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hello.proto

package corp.model;

public final class HelloGrpcProto {
  private HelloGrpcProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_corp_model_HelloRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_corp_model_HelloRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_corp_model_HelloReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_corp_model_HelloReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013hello.proto\022\ncorp.model\"\034\n\014HelloReques" +
      "t\022\014\n\004name\030\001 \001(\t\"\035\n\nHelloReply\022\017\n\007message" +
      "\030\001 \001(\t2K\n\tHelloGrpc\022>\n\010SayHello\022\030.corp.m" +
      "odel.HelloRequest\032\026.corp.model.HelloRepl" +
      "y\"\000B\022B\016HelloGrpcProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_corp_model_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_corp_model_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_corp_model_HelloRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_corp_model_HelloReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_corp_model_HelloReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_corp_model_HelloReply_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
