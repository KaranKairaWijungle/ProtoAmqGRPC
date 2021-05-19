package com.test1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: test1.proto")
public final class test1serviceGrpc {

  private test1serviceGrpc() {}

  public static final String SERVICE_NAME = "test1service";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.test1.Test1.func1Request,
      com.test1.Test1.func1Response> getFun1Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "fun1",
      requestType = com.test1.Test1.func1Request.class,
      responseType = com.test1.Test1.func1Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.test1.Test1.func1Request,
      com.test1.Test1.func1Response> getFun1Method() {
    io.grpc.MethodDescriptor<com.test1.Test1.func1Request, com.test1.Test1.func1Response> getFun1Method;
    if ((getFun1Method = test1serviceGrpc.getFun1Method) == null) {
      synchronized (test1serviceGrpc.class) {
        if ((getFun1Method = test1serviceGrpc.getFun1Method) == null) {
          test1serviceGrpc.getFun1Method = getFun1Method = 
              io.grpc.MethodDescriptor.<com.test1.Test1.func1Request, com.test1.Test1.func1Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "test1service", "fun1"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.test1.Test1.func1Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.test1.Test1.func1Response.getDefaultInstance()))
                  .setSchemaDescriptor(new test1serviceMethodDescriptorSupplier("fun1"))
                  .build();
          }
        }
     }
     return getFun1Method;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static test1serviceStub newStub(io.grpc.Channel channel) {
    return new test1serviceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static test1serviceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new test1serviceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static test1serviceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new test1serviceFutureStub(channel);
  }

  /**
   */
  public static abstract class test1serviceImplBase implements io.grpc.BindableService {

    /**
     */
    public void fun1(com.test1.Test1.func1Request request,
        io.grpc.stub.StreamObserver<com.test1.Test1.func1Response> responseObserver) {
      asyncUnimplementedUnaryCall(getFun1Method(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFun1Method(),
            asyncUnaryCall(
              new MethodHandlers<
                com.test1.Test1.func1Request,
                com.test1.Test1.func1Response>(
                  this, METHODID_FUN1)))
          .build();
    }
  }

  /**
   */
  public static final class test1serviceStub extends io.grpc.stub.AbstractStub<test1serviceStub> {
    private test1serviceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private test1serviceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected test1serviceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new test1serviceStub(channel, callOptions);
    }

    /**
     */
    public void fun1(com.test1.Test1.func1Request request,
        io.grpc.stub.StreamObserver<com.test1.Test1.func1Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFun1Method(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class test1serviceBlockingStub extends io.grpc.stub.AbstractStub<test1serviceBlockingStub> {
    private test1serviceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private test1serviceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected test1serviceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new test1serviceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.test1.Test1.func1Response fun1(com.test1.Test1.func1Request request) {
      return blockingUnaryCall(
          getChannel(), getFun1Method(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class test1serviceFutureStub extends io.grpc.stub.AbstractStub<test1serviceFutureStub> {
    private test1serviceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private test1serviceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected test1serviceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new test1serviceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.test1.Test1.func1Response> fun1(
        com.test1.Test1.func1Request request) {
      return futureUnaryCall(
          getChannel().newCall(getFun1Method(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FUN1 = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final test1serviceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(test1serviceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FUN1:
          serviceImpl.fun1((com.test1.Test1.func1Request) request,
              (io.grpc.stub.StreamObserver<com.test1.Test1.func1Response>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class test1serviceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    test1serviceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.test1.Test1.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("test1service");
    }
  }

  private static final class test1serviceFileDescriptorSupplier
      extends test1serviceBaseDescriptorSupplier {
    test1serviceFileDescriptorSupplier() {}
  }

  private static final class test1serviceMethodDescriptorSupplier
      extends test1serviceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    test1serviceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (test1serviceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new test1serviceFileDescriptorSupplier())
              .addMethod(getFun1Method())
              .build();
        }
      }
    }
    return result;
  }
}
