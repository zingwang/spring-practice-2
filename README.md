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


#### 스프링 부트 자동구성
- 스프링 부트가 제공하는 자동 구성 덕분에 복잡한 빈등록이나 추가 설정 없이 
단순하게 라이브러리 추가 만으로 프로젝트를 편리하게 구성
- @ConditionlOnXxx 덕분에 라이브러리 설정을 유연하게제공
- 스프링 부트는 수 많은 자동 구성을 제공

- @AutoConfiguration 에 자동 구성의 순서를 지정
- @AutoConfiguration 도 설정 파일 

#### 자동구성을 언제 사용하는가?
- 자동 구성을 알아야 하는 이유는 개발을 진행하다 보면 사용하는 특정 빈들이 어떻게 등록된 것인지 확인이 필요할 때 가 있으며
이때 자동 구성 코드를 읽을 수 있어야 문제가 발생했을 때 대처가 가능하다.


#### 외부설정
 dev.db.com(개발app.jar)
 prod.db.com(운영app.jar)

보통 빌드는 한번만 하고 각 환경에 맞추어 *실행 시점에 외부 설정값을 주입*

- 유지보수하기 좋은 애플리케이션 개발의 가장 기본원칙 "변하는 것과 변하지 않는 것을 분리"
- OS환경설정 / 자바 시스템 속성 / 자바 커맨드 라인 인수 / 외부 파일
- 외부설정 - 스프링통합 PropertySoruc: 커맨드 라인 옵션인수 / 자바 시스템 속성 / OS환경변수 / 설정데이터(파일)

- 외부설정: @Value, @ConfigurationProperties(묶음), @Validated(검증기) 
- YAML: 실무에서는 applications.yml 을 주로 사용
- @Profile: 각 환경마다 다른 Bean을 등록

#### 액츄에이터
- 프로덕션을 운영에 배포할 때 준비해야 하는 비 기능적인 요소들: 지표(metric), 추적(trace), 감사(auditing)

#### 마이크로미터, 프로메테우스, 그라파나
- 마이크로미터: 마이크로미터가 정한 표준방법으로 메트릭(측정 지표) 전달. 사용하는 모니터링 툴에 맞는 구현체 선택
- 프로메테우스: 애플리케이션 발생한 메트릭을 과거 이력과 함께 메트릭을 지속해서 수집하고 DB에 저장
- 그라파나: DB에 있는 데이터를 사용자가 편하게 볼 수 있도록 시각화 해주는 대시보드
- 그라파나 대시보드: 공유대시보드(https://grafana.com/grafana/dashboards)를 import하여 수정할 수 있음
