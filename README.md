# Franc-OAuth API

## 1. Description
> <b>OAuth 인증 서비스 - API 파트</b>
- 회원 풀 관리와 토큰발급/인증을 대신 해주는 서비스
- 해당 서비스의 API에 관련된 내용을 관리
1. 클라이언트는 본 서비스에 자사 서비스 정보를 등록 (serviceURL, callbackURL ...)
1. 클라이언트의 고객은 본 서비스로 로그인 (팝업제공)
1. 로그인 시 본 서비스는 callbackURL로 인증토큰을 비롯한 여러 정보를 제공한다.

### v1
- 필수기능 구현 (로그인/회원가입/인증/토큰발급 등..)
<br/><br/>
  
## 2. Environment
- Java 1.8, JUnit, Lombok, Gradle 7.1
- Spring Boot 2.x, JPA, Security 5.x
- MySql, H2
- JWT, Redis
