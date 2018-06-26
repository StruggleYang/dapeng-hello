# Dapeng-hello
以 [dapeng-soa](https://github.com/dapeng-soa/dapeng-soa) 构建的hello服务(Java实现)

## 项目目录树
```
|--dapeng-hello
|  |--hello-api
|  |  |--src
|  |  |  |--main
|  |  |  |  |--java
|  |  |  |  |--resources
|  |  |  |  |  |--thrifts
|  |  |--pom.xml
|  |--hello-service
|  |  |--src
|  |  |  |--main
|  |  |  |  |--java
|  |  |  |  |--resources
|  |  |  |  |  |--META-INF
|  |  |  |  |  |  |--spring
|  |  |  |  |  |  |  |--services.xml
|  |  |--pom.xml
|  |  |--logs
|  |  |--docker
|  |  |  |--Dockerfile
|  |--.gitignore
|  |--pom.xml
------------------------------------
```

## 本地启动
本地启动需要本地启动zookeeper,可使用docker启动一个zookeeper容器
```bash
docker pull zookeeper
docker run --name zookeeper -p 2181:2181 --restart always -d zookeeper
```
Dapeng插件启动服务

```bash
cd hello-service
mvn compile dapeng:run
或者
cd hello-service
mvn compile com.github.dapeng:dapeng-maven-plugin:2.0.2:run
```
服务默认注册端口:9090
默认在线测试文档端口:8080
打开浏览器 http://localhost:8080 访问在线文档进行测试

## 打包docker镜像

```bash
mvn clean package
```

## 使用docker-compose编排服务

```bash
待续
```







