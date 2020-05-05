# 秒杀系统  
 本项目实现了一个商品秒杀系统,实现大量用户抢购商品功能。系统使用Spring Boot,MyBatis框架开发,使用MySQL数据库,通过使用Redis缓存和RabbitMQ消息队列优化商品秒杀过程, 减轻数据库压力，提升系统并发处理能力。


## 商品秒杀流程
    1.初始化,加载商品库存到Redis
    2.收到秒杀请求,Redis预减库存.如果库存不足则直接返回秒杀失败,否则进入第3步
    3.将成功秒杀的消息存入RabbitMQ消息队列
    4.异步下单,消息出队,生成订单,更新库存
    5.客户端轮询秒杀结果
