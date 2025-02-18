# 자동차 경주 게임
## 기능 목록
1. 자동차 생성
   - 이름은 5자이하 가능
   - 이름은 쉽표(,)를 기준으로 구분
2. 사용자에게 이름 콘솔 입력 받기
   - 경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)
3. 사용자에게 이동 횟수 콘솔 입력 받기
   - 시도할 회수는 몇회인가요?
4. 전진 조건
   - 0-9 사이 랜덤값 생성 후 4이상일 경우 전진, 3이하의 값이면 멈춤
5. 전진 시 자동차 주행거리 기록
   - 전진시 (-)기호를 추가하여 저장한다
6. 게임 완료시 실행 결과 출력
   - 아래 프로그램 실행 결과 참조
5. 게임 완료시 우승자 판단
   - 우승자가 한명 이상일 경우 쉼표(,)로 이름을 구분해 출력


## 기능 요구사항
- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
- 각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
- 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.
- 사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
- 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4 이상일 경우 전진하고, 3 이 하의 값이면 멈춘다.
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다.
- 우승자가 한 명 이상일 경우, 쉼표(,)로 이름을 구분해 출력한다.
- 사용자가 잘못된 값을 입력할 경우 “[ERROR]”로 시작하는 에러 메시지를 출력 후 입력을 다시 받는다.


## 프로그램 실행 결과
```
경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)
pobi,crong,honux
시도할 회수는 몇회인가요?
5

실행 결과
pobi:-
crong:
honux:-

pobi:--
crong:-
honux:--

pobi:---
crong:--
honux:---

pobi:----
crong:---
honux:----

pobi:-----
crong:----
honux:-----

최종 우승자는 pobi,honux 입니다.
...
```