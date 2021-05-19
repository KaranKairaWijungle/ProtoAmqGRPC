package com.producer;

import javax.jms.*;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.log4j.BasicConfigurator;

public class MessageSender {

    //URL of the JMS server. DEFAULT_BROKER_URL will just mean that JMS server is on localhost
    private static String url = ActiveMQConnection.DEFAULT_BROKER_URL;

    // default broker URL is : tcp://localhost:61616"
    private static String subject = "protoAMQ"; // Queue Name.You can create any/many queue names as per your requirement.

    public static void main(String[] args) throws JMSException {
        //IMP LINE
        BasicConfigurator.configure();
        // Getting JMS connection from the server and starting it
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(url);
        Connection connection = connectionFactory.createConnection();
        connection.start();
        //Creating a non transactional session to send/receive JMS message.
        Session session = connection.createSession(false,Session.AUTO_ACKNOWLEDGE);
        //Destination represents here our queue 'protoAMQ' on the JMS server.
        //The queue will be created automatically on the server.
        Destination destination = session.createQueue(subject);
        // MessageProducer is used for sending messages to the queue.
        MessageProducer producer = session.createProducer(destination);

        String name = "Karan";
        String dob = "24,Oct,1999";
        String serviceName = "test1service";
        String methodName = "func1";
        MapMessage message = session.createMapMessage();
        message.setString("name" , name);
        message.setString("dob" , dob);
        message.setString("serviceName" , serviceName);
        message.setString("methodName" , methodName);

        producer.send(message);

        System.out.println("Sent " );

        connection.close();
    }
}
