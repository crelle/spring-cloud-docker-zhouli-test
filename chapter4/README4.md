####microservice-provider-user
    用途：用户服务提供者
####microservice-consumer-movie
    用途：电影消费者
####microservice-discovery-eureka
    用途：注册中心
####microservice-discovery-eureka-authenticating
    用途：添加http basic认证的注册中心
####microservice-discovery-eureka-ha
    用途：高可用注册中心
    启动：
        java -jar microservice-discovery-eureka-ha-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer1
        java -jar microservice-discovery-eureka-ha-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer2