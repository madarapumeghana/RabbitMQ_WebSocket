# RabbitMQ_WebSocket
WebSocket Implementation with RabbitMQ server

Install erlang: click on download windows installer
https://www.erlang.org/downloads

Install rabbitmq server: Under Direct Downloads:
https://www.rabbitmq.com/install-windows.html#installer

Once rabbitmq server starts, enable plugins using below command: Navigate to sbin folder
cd C:\Program Files\RabbitMQ Server\rabbitmq_server-3.11.2\sbin
rabbitmq-plugins enable rabbitmq_management

verify by opening http://localhost:15672 in browser and login using guest/guest(default RabbitMQ server credentials)

Application:
After running RabbitmqProducer application, type URL: http://localhost:8080/rabbitmq/producer?empName=User&empId=12 in browser and verify in rabbitmq queue for message.
Next run consumer application and check in console for the same message and also in the browser(client) http://localhost:8082/
