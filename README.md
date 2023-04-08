# springboot-core-utilization-study
스프링부트 - 핵심 원리와 활용 학습

#### 웹서버와 스프링 부트 
- 전통적인 방식 톰캣설치
- 최근방식 스프링 부트가 내장 톰캣 포함

#### 스프링 부트와 내장톰캣
- WAR 배포 방식 단점 : 톰캣같은 WAS 별도 설치, 환경 설정 복잡, 배포과정 복잡 
- 내장톰캣 : WAR 배포 방식 단점을 해결


#### 스프링 부트 스타터와 라이브러리 관리
- 외부 라이브러리 버전 관리
- 스프링 부트 스타터 제공
- 라이브러리 직접 선택 시 문제 : 호환이 잘되는지 확인이 필요
- 스프링 부트 라이브러리 버전관리 : dependency-management 로 버전관리

#### 스프링 부트 스타터 스프링 부트 스타터 - 자주 사용하는 것 위주
>  spring-boot-starter : 핵심 스타터, 자동 구성, 로깅, YAML <br>
>  spring-boot-starter-jdbc : JDBC, HikariCP 커넥션풀 <br>
>  spring-boot-starter-data-jpa : 스프링 데이터 JPA, 하이버네이트 <br>
>  spring-boot-starter-data-mongodb : 스프링 데이터 몽고 <br> 
>  spring-boot-starter-data-redis : 스프링 데이터 Redis, Lettuce 클라이언트 <br>
>  spring-boot-starter-thymeleaf : 타임리프 뷰와 웹 MVC <br>
>  spring-boot-starter-web : 웹 구축을 위한 스타터, RESTful, 스프링 MVC, 내장 톰캣 <br>
>  spring-boot-starter-validation : 자바 빈 검증기(하이버네이트 Validator) <br>
>  spring-boot-starter-batch : 스프링 배치를 위한 스타터 <br>

- 스프링 부트 스타터 전체 목록 공식 매뉴얼 <br>
https://docs.spring.io/spring-boot/docs/current/reference/html/using.html#using.build-systems.starters

- 라이브러리 버전 변경: 다음과 같은 형식으로 변경 가능 <br>
ext['tomcat.version'] = '10.1.4' 
