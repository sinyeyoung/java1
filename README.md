# 사칙연산 컴포넌트 (Calculator)와 JUnit4 테스트

## 프로젝트 개요
- 정수 중심의 사칙연산 컴포넌트를 구현하고 JUnit4를 사용하여 단위 테스트를 수행합니다.
- 개발 환경: VS Code, JDK 17, Maven, JUnit4


##  기능 요구사항
- `Calculator` 클래스
  - `int add(int a, int b)`
  - `int subtract(int a, int b)`
  - `int multiply(int a, int b)`
  - `int divide(int a, int b)` → `b == 0` 이면 `IllegalArgumentException` 발생

---

##  테스트 요구사항
- 각 연산의 정상 케이스 + 경계/특수 케이스(0, 음수 포함)
- 예외 테스트: `divide(?, 0)` → `IllegalArgumentException`
- 테스트 메서드 8개 이상 작성

---

##  실행 방법
## 1) 로컬에서 테스트 실행

mvn test
