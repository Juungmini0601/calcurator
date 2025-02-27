<h1 style="color: #f73620"> NBC 계산기 과제 제출 저장소 </h1>

> 내일배움 캠프 2주차 개인 계산기 과제 제출용 저장소입니다.  
> 과제는 총 3단계로 나뉘어 있으며 최종 결과물은 디렉토리 별로 분류하였습니다.
>
> basic(1단계), middle(2단계), advanced(3단계)

<h2 style="color: #f73620"> 전체 요구 사항 </h2>

[링크](https://teamsparta.notion.site/Spring-6-CH-2-1a52dc3ef514802088c5ece6f84d4de5) 참고

<h2 style="color: #f73620"> ✅ 1단계 - 하나의 클래스에서 계산기 로직 구현 </h2>

### Overall Class Diagram

<img width="508" alt="1단계 다이어 그램" src="https://github.com/user-attachments/assets/27b66ecd-08e4-4912-9f02-7578f65b3087" />

- 별도의 메소드를 나눠 구현 [코드 링크](https://github.com/Juungmini0601/calcurator/blob/main/src/main/java/com/raon/basic/App.java)

<h2 style="color: #f73620"> ✅ 2단계 - 클래스를 이용한 계산기 구현 </h2>

### Overall Class Diagram

<img width="718" alt="2단계 클래스 다이어그램" src="https://github.com/user-attachments/assets/90c6c286-3c12-4594-8428-807ba0ffee36" />

- **정리**
    - App: 어플리케이션 진입점
    - Reader, Writer: 입출력
    - 상수 클래스: 연산자, 명령어 등의 상수 표현
    - [코드 링크](https://github.com/Juungmini0601/calcurator/blob/main/src/main/java/com/raon/advanced/App.java)

<h2 style="color: #f73620"> ✅ 3단계 - Enum, 제네릭, 람다를 활용한 구현 </h2>

### Overall Class Diagram

<img width="716" alt="Image" src="https://github.com/user-attachments/assets/53d879ef-07aa-4760-ac2f-58e5bf630afc" />

- Enum 및 제네릭 도입 완료
- Stream, Lambda를 활용한 검색 로직 구현 완료

<h2 style="color: #f73620"> TODO 4단계 - 스택을 활용한 계산기 구현 </h2>

> 3단계 까지의 과제가 일찍 끝나서 학습을 위해 별도의 요구사항을 추가하여 구현 하였습니다.  
> 재미와 학습을 위한 구현이며 코드는 맘대로 사용하셔도 됩니다.

### 요구사항

- 현재 계산기는 2개의 피연산자와 1개의 연산자로 이루어진 수식만 지원
- 일반적인 형태의 수식을 지원 하도록 개선
- **구현시 반드시 Parser와, Stack이 포함 되어 있어야 함**

<h2 style="color: #f73620"> TODO 5단계 - 넌 아직도 콘솔 쓰니? </h2>

> 최종적으로 구현하고 싶은 모습은 맥북의 기본 계산기를 구현하는 것  
> 상남자는 콘솔을 쓴다고 하지만 GUI 한번 해보고 싶어서 일단 적어둔다.  
> 시간 모자라면 못할 수 도 있음

- 콘솔 계산기를 맥북의 기본 계산기 앱처럼 GUI로 구현 하시오