# Baseball Game (TDD 실습)

## [TDD소개](https://github.com/cleancodeclass/prime-factors/wiki/TDD-%EC%86%8C%EA%B0%9C)

## Baseball Game 실습 소개

### Baseball Game 규칙
* 세자리 숫자를 맞추는 야구게임
  * 세자리 수를 입력받아 결과를 리턴한다.
* 답에 대한 return은 아래 속성을 가지는 객체로 한다. 
  * boolean solved
  * int strikes
  * int balls
* 아래의 경우 예외처리 후 게임을 종료한다.
  * 입력값이 없을 경우
  * 자리수가 세 자리가 아닐 경우
  * 숫자 외의 문자가 입력될 경우
  * 중복된 숫자가 입력될 경우
* Example : question이 "123"일 경우
  * guess(“123”) -> solved=true, strikes=3, balls=0
  * guess(“456”) -> solved=false, strikes=0, balls=0
  * guess(“129”) -> solved=false, strikes=2, balls=0
  * guess(“240”) -> solved=false, strikes=0, balls=1
  * guess(“321”) -> solved=false, strikes=1, balls=2


## 실습방법
1. 가장 쉽게 구현할 수 있는 테스트부터 시작한다.
2. 실패하는 테스트 케이스를 만든다. (Red)
3. 실패하는 테스트 케이스를 성공하도록 최소한의 소스를 수정한다. (Green)
필요하다면 하드코딩 한다.
4. 리팩토링이 필요하다면 수행한다. (Refactoring)
  * 중복을 제거한다. 비슷한 중복을 완전한 중복으로 바꾼다.
  * Extract method, Extract to local variable, Inline local variable….
5. 새로운 실패하는 테스트 케이스를 만든다
6. 1~5 반복을 통해 구체화되는 테스트케이스를 이용하여 일반화되는 소스코드를 작성한다.

## Pair Programming
#### 드라이버/네이게이터
* 드라이버 - 소스코드를 타이핑 한다.
* 네비게이터 - 실시간으로 코드를 리뷰하면서 드라이버를 가이드 한다.

#### 핑퐁
* 한명은 실패하는 테스트 케이스를 작성하고, 나머지 한명은 테스트를 구현하기 위한 성공코드를 작성한다.

