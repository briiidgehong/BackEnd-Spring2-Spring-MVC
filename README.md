# BackEnd-Spring2-Spring-MVC -> 완료

BackEnd 개발의 큰 흐름 : Servlet -> JSP -> JSP MVC -> SPRING -> SPRING BOOT

뒷단으로 갈수록 편의기능은 많아지나, 많은것이 wrapping 되있어 그 의미를 파악하기 힘든경우가 발생

각각의 구현과 함께 바뀌어가는 과정을 한 cycle 정리할 예정

Servlet 편의 개발환경은 다음과 같습니다. 
* IDE : IntelliJ IDEA
* Git Tools : GitHub Desktop
* OS : Window 10
* Java Enterprise Edition 
* Java 11 JDK
* Tomcat 9
* build tool : maven
* springFramework-spring MVC
* ojdbc-oracle / jstl

※ 출처: 이 정리는 youtube newLecture 님의 강좌를 기반으로 작성되었습니다.

## 주요 commmit 내역☑️
### 1. maven 초기 환경 세팅:   
[spring MVC initial](https://github.com/mangozzelli/BackEnd-Spring2-Spring-MVC/commit/d5943a4ae09d1559ad62111480d41cbaa740a0e8)  
  
### 2. frontController(dispatcher-servlet.xml) 
[frontController Test(dispatcher-servlet.xml) + module root recreate / add java ee dependency](https://github.com/mangozzelli/BackEnd-Spring2-Spring-MVC/commit/405c8449ffb31bf06a3b3b8f8a21828f276d4f30)  
[import resource(static) file & dispatcher-static-mapping-setting](https://github.com/mangozzelli/BackEnd-Spring2-Spring-MVC/commit/bdec7635b05d15c2380888b575e9ce2459624dde)  
  
### 3. Create Controller, Service  
[create list/detail view page & controller](https://github.com/mangozzelli/BackEnd-Spring2-Spring-MVC/commit/c4569fe332dc7e9658ee5ad6bfb3f74740fed39e)  
[add noticeService class & ojdbc8 dependency](https://github.com/mangozzelli/BackEnd-Spring2-Spring-MVC/commit/7f48934eccfccbbe998b73e821aa945585c850fa)  
  
### 4. DI  
[service 객체의 사용(IoC 컨테이너에 담아 ListController에 DI](https://github.com/mangozzelli/BackEnd-Spring2-Spring-MVC/commit/7417c5307ccb9eac702bbfee1a136a2eb25f0a92)  
[서비스 클래스를 interfaceService-implService로 분리하기(DI 쉽게 갈아끼우기 위해서)](https://github.com/mangozzelli/BackEnd-Spring2-Spring-MVC/commit/ab98404b992dd9321d08d6bad56ba3aca07463d9)  
  
### 5. XML -> Annotation
[xml->annotation 설정 변경: 1. DI 부](https://github.com/mangozzelli/BackEnd-Spring2-Spring-MVC/commit/4886c45fe119b0bc0bafd078b6f8cb672cf092df)  
[xml->annotation 설정 변경: 2.bean 객체 선언부](https://github.com/mangozzelli/BackEnd-Spring2-Spring-MVC/commit/0b1790464cbac8668b2809183db7f4194ae30158)  
[xml->annotation 설정 변경: 3. bean 객체 선언부 & url mapping](https://github.com/mangozzelli/BackEnd-Spring2-Spring-MVC/commit/90baaf464d0712b7d725b784775a98d274441e65)  
 

