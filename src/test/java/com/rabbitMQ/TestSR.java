package com.rabbitMQ;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.TimeoutException;

import org.junit.Test;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.AMQP.Queue.DeclareOk;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Consumer;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;

public class TestSR {
	public final static String QUEUE_NAME = "rabbitMQ.test";

	@Test
	public void tests() {
		ConnectionFactory factory = new ConnectionFactory();
		// 设置RabbitMQ相关信息
		factory.setHost("localhost");
		//factory.setUsername("guest");
		//factory.setPassword("guest1");
		// factory.setPort(2088);
		// 创建一个新的连接
		try {
			Connection connection = factory.newConnection();
			// 创建一个通道
			Channel channel = connection.createChannel();
			// 声明一个队列 channel.queueDeclare(QUEUE_NAME, false, false, false,
			// null);
			String message = "Hello RabbitMQ";
			// 发送消息到队列中
			channel.basicPublish("", QUEUE_NAME, null, message.getBytes("UTF-8"));
			System.out.println("Producer Send +'" + message + "'");
			// 关闭通道和连接
			channel.close();
			connection.close();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testr() throws IOException, TimeoutException {
		ConnectionFactory factory = new ConnectionFactory();
		// 设置RabbitMQ地址
		factory.setHost("localhost");
		factory.setUsername("guest");
		//factory.setPassword("guest1");
		// 创建一个新的连接
		Connection connection = factory.newConnection();
		// 创建一个通道
		Channel channel = connection.createChannel();
		// 声明要关注的队列
		DeclareOk dOk = channel.queueDeclare(QUEUE_NAME, false, false, false, null);
		System.out.println("Customer Waiting Received messages " + dOk.getMessageCount());
		// DefaultConsumer类实现了Consumer接口，通过传入一个频道，
		// 告诉服务器我们需要那个频道的消息，如果频道中有消息，就会执行回调函数handleDelivery
		Consumer consumer = new DefaultConsumer(channel) {
			@Override
			public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
				String message = new String(body, "UTF-8");
				System.out.println("Customer Received '" + message + "'");
			}
		};
		// 自动回复队列应答 -- RabbitMQ中的消息确认机制
		channel.basicConsume(QUEUE_NAME, true, consumer);

	}

}
