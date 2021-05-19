import io.grpc.Server;
import io.grpc.ServerBuilder;
import test1Service.test1service;

import java.io.IOException;

public class gRPCServer {
    public static void main(String args[]) throws IOException, InterruptedException {

        System.out.println("starting GRPC Server");
        Server server = ServerBuilder.forPort(9090)
                .addService(new test1service())
                .build();

        server.start();
        System.out.println("server started at "+ server.getPort());
        server.awaitTermination();
    }
}
