# 📋 board-project

Java Spring 기반의 게시판 웹 애플리케이션입니다.  
JPA, QueryDSL, Spring Security, Thymeleaf 등 다양한 스프링 기술 스택을 활용하여 구현하였습니다.

## 💡 프로젝트 소개

- 회원가입 및 로그인
- 게시글 CRUD
- 댓글 기능
- 권한 기반 접근 제어
- QueryDSL 기반 동적 검색
- Spring Data REST + HAL Explorer 연동

> 실무 스타일의 게시판을 구현하며 Spring 생태계 전반을 학습하고, 포트폴리오로 활용하기 위한 프로젝트입니다.

---

## 🛠️ 사용 기술 스택

| 구분       | 기술                                                |
|------------|-----------------------------------------------------|
| Language   | Java 17                                             |
| Build Tool | Gradle                                              |
| Framework  | Spring Boot 3.3.x                                   |
| ORM        | Spring Data JPA, Hibernate                          |
| DB         | H2 (개발), MySQL (운영)                              |
| Template   | Thymeleaf                                           |
| Security   | Spring Security 6                                   |
| QueryDSL   | querydsl-jpa:5.1.0 (jakarta)                        |
| REST       | Spring Data REST, HAL Explorer                      |
| Test       | JUnit 5, Spring Security Test                       |
| 기타       | Lombok, DevTools, Actuator                          |

---

## 📂 프로젝트 구조

```
board-project/ 
├─ src/ 
│  ├─ main/ 
│  │  ├─ java/com/projectboard/       # 비즈니스 로직 (도메인, 서비스, 컨트롤러 등)
│  │  ├─ resources/
│  │  │  ├─ static/                   # 정적 리소스 (CSS, JS 등)
│  │  │  ├─ templates/                # Thymeleaf 템플릿
│  │  │  └─ application.yml           # 환경 설정
│  ├─ test/                           # 테스트 코드
├─ build.gradle                       # 빌드 설정
└─ README.md
```

---

## ⚙️ 실행 방법

### 1. 프로젝트 클론

```bash
git clone https://github.com/yjin0034/board-project.git
cd board-project
```

### 2. 빌드 및 실행

```bash
./gradlew clean build
./gradlew bootRun
```

### 3. H2 Console 접속 (개발용 DB)

- 접속 URL: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
- JDBC URL: `jdbc:h2:mem:testdb`

### 4. HAL Explorer 접속

- URL: [http://localhost:8080/api](http://localhost:8080/api)
- Spring Data REST로 자동 생성된 API 탐색 가능

---

## 🔍 QueryDSL 설정 요약

- **Q 클래스 생성 위치**: `src/main/generated`

- **build.gradle 설정 예시**:

```groovy
tasks.withType(JavaCompile) {
    options.getGeneratedSourceOutputDirectory().set((file("src/main/generated")))
    options.compilerArgs += ["-parameters"]
}
```

- `./gradlew clean` 시 Q 클래스 디렉토리가 삭제되므로 재생성 필요

---

## 🧪 테스트

- 테스트 프레임워크: JUnit 5
- 실행 명령어:

```bash
./gradlew test
```

- `spring-security-test`를 활용한 인증/인가 테스트 포함

---

## ✨ 향후 추가 예정 기능

- 사용자 역할/권한 세분화
- 게시글 정렬 및 검색 기능 고도화
- 공지사항 게시판 기능 추가 (상단 고정, 작성자 권한 등)
- Docker 기반 개발/배포 환경 구성
- 대용량 트래픽을 고려한 아키텍처 개선 및 비동기 처리 적용
- 데이터베이스 성능 개선을 위한 쿼리 최적화 및 인덱싱 전략 도입

---

## 📊 문서 및 다이어그램

| 항목 | 설명 | 링크 |
|------|------|------|
| API 명세 | RESTful API의 엔드포인트, 요청/응답 형식 정리 (Google Sheet) | [📌 보기](https://docs.google.com/spreadsheets/d/1gTkQ_zNivxrIftm8P9eVVoDfquKKJoOnvQW0kEC8Aog/edit?gid=0) |
| 유즈케이스 다이어그램 | 주요 사용자의 행위와 시스템 간 상호작용 흐름 시각화 (draw.io) | [📌 보기](https://app.diagrams.net/#Hyjin0034%2Fboard-project%2Fmain%2Fdocument%2Fuse-case.drawio.svg#%7B%22pageId%22%3A%223V77mpNW_ooGbhKyOeYU%22%7D) |
| ERD | 게시판 도메인 설계를 기반으로 한 테이블 관계도 (draw.io) | [📌 보기](https://app.diagrams.net/#Hyjin0034%2Fboard-project%2Fmain%2Fdocument%2Fboard-project-erd.drawio.svg#%7B%22pageId%22%3A%22R2lEEEUBdFMjLlhIrx00%22%7D) |

---

## 📌 기타 참고사항

- Spring Boot 3.x 기반으로 Jakarta 패키지 체계에 맞추어 구성

---

## 📎 라이선스

이 프로젝트는 MIT 라이선스 하에 배포됩니다.  
자유롭게 사용 및 수정이 가능하며, 출처를 명시해 주세요.
