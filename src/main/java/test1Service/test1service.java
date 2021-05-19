package test1Service;

import com.test1.Test1;
import com.test1.Test1.func1Response;
import com.test1.test1serviceGrpc;
import com.test1.test1serviceGrpc.test1serviceImplBase;
import io.grpc.stub.StreamObserver;

public class test1service extends test1serviceImplBase {
    @Override
    public void fun1(Test1.func1Request request, StreamObserver<Test1.func1Response> responseObserver) {

        String name = request.getName();
        String dob = request.getDob();
        func1Response response = func1Response.newBuilder().setSentence("Your name is " + name  + " and your dob is " + dob).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
