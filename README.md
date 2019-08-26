
# 사용자 서비스(Resource) 서버 
## 주요 내용

### Descrition: 실제서비스 자원 API서버
### 수정일 : 2019.08.26

* OAuth2.0 Resource Server 예제 

* 해당 Annotation 
- @EnableResourceServer
- @EnableGlobalMethodSecurity(prePostEnabled = true)

* Service URL : http://localhost:8090/api/list


### 1. 앱 실행
$ ./mvnw spring-boot:run

### 2. 앱 빌드&패키징
$ ./mvnw clean package 

### 3. Java Run Test
$ java -jar ./target/*.jar 

### 4. Postman 활용한 테스트 방법
1) Authorization Server 테스트 방법
> - 전송방식 "GET" 선택 후 Authorization 입력값<p>
> 1) URL : http://localhost:8090/api/list
> 2) Access Token : AuthorizationServer의 값 입력 [여기](Get.Key.md)

2) 입력 후 SEND <p>