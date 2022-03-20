### 기본 리팩토링
> 가장 많이 사용되는 리팩토링 기술
* 함수 추출하기 (2-4)
* 함수 인라인하기 (8-28)
* 변수 추출하기
* 변수 인라인하기 
* 함수 선언 변경하기 (1-1)
* 함수 캡슐화하기 (5-17)
* 변수 이름 바꾸기 (1-2)
* 매개변수 객체만들기 (3-8)
* 여러 함수를 클래스로 묶기 (4-16)
* 여러 함수를 변환함수로 묶기 (6-22)
* 단계 쪼개기 (7-24)

<hr>

### 캡슐화
> 모듈에서 외부 시스템으로 공개하지 않아도 되는 데이터를 숨기는 기술
* 레코드 캡슐화하기 (22-42)
* 컬렉션 캡슐화하기
* 기본형을 객체로 바꾸기 (11-30)
* 임시 변수를 질의함수로 바꾸기 (3-7)
* 클래스 추출하기 (7-26)
* 클래스 인라인하기 (8-29)
* 위임 숨기기 (17-37)
* 중재자 제거하기 (18-38)
* 알고리즘(어떠한 계산로직) 교체하기

<hr>

### 기능 옮기기
> 함수나 필드 또는 문장을 적절한 위치로 옮기는 기술
* 함수 옮기기 (7-25)
* 필드 옮기기 (8-27)
* 문장을 함수로 옮기기
* 문장을 호출한 곳으로 옮기기
* 인라인 코드를 함수 호출로 바꾸기
* 문장 슬라이드 하기 (코드 정리하기 2-5)
* 반복문 쪼개기 (3-12)
* 반복문을 파이프라인으로 바꾸기 (13-33)
* 죽은 코드 제거하기 (15-35)

<hr>

### 데이터 조직화
> 데이터 구조를 다루는 기술
* 변수 쪼개기 (6-18)
* 필드 이름 바꾸기 (1-3)
* 파생 변수를 질의함수로 바꾸기 (6-21)
* 참조를 값으로 바꾸기 (6-23)
* 값을 참조로 바구기

<hr>

### 조건부 로직 간소화
> 복잡한 조건문을 다루는 기술
* 조건문 분해하기 (3-11)
* 조건식 통합하기
* 중첩 조건문을 보호 구문으로 바꾸기
* 조건문 로직을 다형성으로 바꾸기 (11-32)
* 특이 케이스 추가하기 (16-36)
* 어서션 추가하기 (24-43)

<hr>

### API 리팩토링
> 쉽게 이해하고 사용할 수 있는 API를 만드는 기술
* 질의 함수와 변경 함수 분리하기 (6-19)
* 함수 매개변수화하기 (함수의 동작이 매개변수에 따라 달라진다)
* 플래그 인수 제거하기 (4-15)
* 객체 통째로 넘기기 (3-9)
* 매개변수를 질의 함수로 바꾸기 (4-14)
* 질의 함수를 매개변수로 바꾸기
* 세터 제거하기 (6-20)
* 생성자를 팩토리 함수로 바꾸기
* 함수를 명령으로 바꾸기 (3-10)
* 명령을 함수로 바꾸기

<hr>

### 상속 다루기
> 상속을 제대로 사용하는 기술
* 메소드 올리기 (2-6)
* 필드 올리기 
* 생성자 본문 올리기
* 메서드 내리기
* 필드 내리기
* 타입 코드를 서브클래스로 바꾸기 (11-31)
* 서브클래스 제거하기
* 슈퍼클래스 추출하기 (20-41)
* 계층 합치기
* 서브클래스를 위임으로 바꾸기 (18-39)
* 슈퍼클래스를 위임으로 바꾸기 (18-40)