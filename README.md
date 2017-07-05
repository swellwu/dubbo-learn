# spring boot 整合 dubbo 学习
## hello world
1. 创建dubbo-api工程，定义好接口，并mvn install。
2. 创建dubbo-provider工程作为服务提供者，实现接口，在dubbo-provider.xml中暴露服务
```
    <dubbo:service interface="com.swellwu.service.HelloWorldService"
                   ref="helloWorldServiceImpl" retries="0" timeout="6000" />
```
3. 创建dubbo-comsumer工程作为消费者，使用接口，在dubbo-comsumer.xml中引用接口。
```
    <dubbo:reference id="helloWorldService"
                     interface="com.swellwu.service.HelloWorldService" />
```
4. 设置好zookkeeper的地址、协议等，先启动zookeeper，再启动provider即可提供服务。