# koyama-spring-boot-tutorial

このレポジトリは下記のレポジトリを参考にしたRESTful APIのサンプルです。
https://spring.io/guides/gs/rest-service/

# 前提条件
- Java 11
- Dockerが利用できること

# 実行方法

## Dockerを利用しない場合

ターミナルを起動

`$ ./gradlew bootRun`

アプリケーションが起動したことを確認する。  
ログに「Started BuildingARestfulWebServiceApplication」と出るはず。

`$ curl 'http://localhost:8080/greeting'`  
※jqをいれて使ってみるとレスポンスが整形されてよきです

レスポンスに`{"id":1,"content":"Hello, World!"}%` が表示される。

`$ curl 'http://localhost:8080/greeting?name=Yamada'`

レスポンスに`{"id":1,"content":"Hello, Yamada!"}%` が表示される。

## Dockerを利用する場合

ターミナルを起動

`$ ./gradlew build`

`./build/libs`下に`building-a-restful-web-service-0.0.1-SNAPSHOT.jar`があることを確認

イメージをビルドする。  
`$ docker build -t raisetech/greeting-restful-api .`  

コンテナを起動する。  
`$ docker run -p 8080:8080 raisetech/greeting-restful-api`  

アプリケーションが起動したことを確認する。  
ログに「Started BuildingARestfulWebServiceApplication」と出るはず。    

`$ curl 'http://localhost:8080/greeting'`

レスポンスに`{"id":1,"content":"Hello, World!"}%` が表示される。

`$ curl 'http://localhost:8080/greeting?name=Yamada'`

レスポンスに`{"id":1,"content":"Hello, Yamada!"}%` が表示される。

