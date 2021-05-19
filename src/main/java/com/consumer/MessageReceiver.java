package com.consumer;

import javax.jms.*;

import com.test1.Test1;
import com.test1.Test1.func1Response;
import com.test1.Test1.func1Request ;
import com.test1.test1serviceGrpc;
import com.test1.test1serviceGrpc.test1serviceBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.log4j.BasicConfigurator;

public class MessageReceiver {

    // URL of the JMS server
    private static String url = ActiveMQConnection.DEFAULT_BROKER_URL;
    // default broker URL is : tcp://localhost:61616"

    // Name of the queue we will receive messages from
    private static String subject = "protoAMQ";



    public static void handle_gRPC(Message AMQ_Message) throws JMSException {

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();

        MapMessage message = (MapMessage) AMQ_Message;
        String serviceName = message.getString("serviceName");
        String methodName = message.getString("methodName");
        String name = message.getString("name");
        String dob = message.getString("dob");

        // Parameters for gRPC build
        func1Request data = func1Request.newBuilder().setName(name).setDob(dob).build();
        //now make stub
        test1serviceBlockingStub stub =  test1serviceGrpc.newBlockingStub(channel);

        // now call gRPC
        func1Response response = stub.fun1(data);

        System.out.println(response.getSentence());


    }

    public static void main(String[] args) throws JMSException {
        //IMP LINE
        BasicConfigurator.configure();

        // Getting JMS connection from the server
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(url);
        Connection connection = connectionFactory.createConnection();
        connection.start();

        // Creating session for sending messages
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

        // Getting the queue 'protoAMQ'
        Destination destination = session.createQueue(subject);

        // MessageConsumer is used for receiving (consuming) messages
        MessageConsumer consumer = session.createConsumer(destination);

        // Here we receive the message.
        Message message = consumer.receive();

        handle_gRPC(message);


        connection.close();
    }
}