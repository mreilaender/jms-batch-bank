package com.accenture.reikratei;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * @author manuel
 * @version 12/1/16
 */
public class Producer {
    private static String brokerUrl = "tcp://localhost:61616";
    public static void main(String[] args) {
        try {
            new Producer(brokerUrl, "test");
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }

    public Producer(String brokerUrl, String queue) throws JMSException {
        ActiveMQConnectionFactory mqConnectionFactory = new ActiveMQConnectionFactory(brokerUrl);
        Connection connection = mqConnectionFactory.createConnection();
        connection.start();

        // Create Session
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

        // Create destination
        Destination destination = session.createQueue(queue);
        MessageProducer messageProducer = session.createProducer(destination);

        TextMessage message = session.createTextMessage("Hallo Alina!");
        messageProducer.send(message);

        session.close();
        connection.close();
    }
}
