# Programmers
알고리즘 문제풀이

# LEVEL 1
신규아이디추천 (21. 07. 13)
https://github.com/banjjak2/Programmers/blob/main/Level1/%EC%8B%A0%EA%B7%9C%EC%95%84%EC%9D%B4%EB%94%94%EC%B6%94%EC%B2%9C.java
  - 정규표현식 이용해서 각 스텝별로 구현
    (https://banjjak1.tistory.com/8)

------------------------------------------------------------------------------------------

키패드누르기 (21. 07. 18)
https://github.com/banjjak2/Programmers/blob/main/Level1/%ED%82%A4%ED%8C%A8%EB%93%9C%EB%88%84%EB%A5%B4%EA%B8%B0.java
  - 키패드 위치를 class로 추출하여 관리 및 알기 쉽게 작성
  - 두 점 사이의 거리 구하기 공식을 이용하여 최단거리 구현
    (https://banjjak1.tistory.com/9)

------------------------------------------------------------------------------------------

음양더하기 (21. 07. 25)
https://github.com/banjjak2/Programmers/blob/main/Level1/%EC%9D%8C%EC%96%91%EB%8D%94%ED%95%98%EA%B8%B0.java
  - 음수의 경우 절대값을 취해 결과값 반환

------------------------------------------------------------------------------------------

완주하지못한선수 (21. 07. 31)
https://banjjak1.tistory.com/12

sort 메소드 이용 : https://github.com/banjjak2/Programmers/blob/main/Level1/%EC%99%84%EC%A3%BC%ED%95%98%EC%A7%80%EB%AA%BB%ED%95%9C%EC%84%A0%EC%88%98_sort.java
  - Arrays.sort 메소드를 이용해 String 배열을 정렬 후 비교
  - Arrays.sort 메소드에서 String 정렬 시 알파벳 순으로 정렬하기 때문


HashMap 이용 : https://github.com/banjjak2/Programmers/blob/main/Level1/%EC%99%84%EC%A3%BC%ED%95%98%EC%A7%80%EB%AA%BB%ED%95%9C%EC%84%A0%EC%88%98_hash.java
  - sort 메소드를 이용했을 때 속도가 느려진 관계로 hash로 구현해서 테스트 진행
  - HashMap을 이용하여 각 선수들의 이름을 Key로 두고 참가자라면 +1, 참가자 중 완주자라면 -1을 하여
    0이 아닌 선수가 있을 경우 entrySet 메소드를 이용해 해당 (미완주자)Key 값을 반환

sort 메소드의 경우 내부적으로 TimSort 알고리즘을 사용하는데 Merge Sort 알고리즘을 기반으로 작성되었고, 
Insertion Sort와 merge Sort 알고리즘의 결합 형태라고 한다.
HashMap의 경우 키 값을 알면 바로 Value 값을 알 수 있기 때문에 속도면에서 빠르다.

------------------------------------------------------------------------------------------

위클리챌린지_1주차 (21. 08. 03)
https://github.com/banjjak2/Programmers/blob/main/Level1/%EC%9C%84%ED%81%B4%EB%A6%AC%EC%B1%8C%EB%A6%B0%EC%A7%80_1%EC%A3%BC%EC%B0%A8.java
  - 모자른 돈을 구하는 문제인데, 결과값이 음수가 나올 경우 모자른 돈이 되므로 *-1 을 취해 양수로 만들어 반환

------------------------------------------------------------------------------------------

위클리챌린지_2주차 (21. 08. 10)
https://github.com/banjjak2/Programmers/blob/main/Level1/%EC%9C%84%ED%81%B4%EB%A6%AC%EC%B1%8C%EB%A6%B0%EC%A7%80_2%EC%A3%BC%EC%B0%A8.java
  - 학점을 계산하는 문제로, 유일한 값인지 판별 후 점수 계산 및 학점 계산
  - String을 이용하여 단순히 연결했지만 성능상 문제가 있어 StringBuilder로 변경 후 테스트 진행
  - 빈번한 문자열 연결시 StringBuilder나 StringBuffer를 이용해야 함
  https://banjjak1.tistory.com/15

------------------------------------------------------------------------------------------

체육복 (21. 08. 14)
https://github.com/banjjak2/Programmers/blob/main/Level1/%EC%B2%B4%EC%9C%A1%EB%B3%B5.java
  - 탐욕 알고리즘을 이용한 문제 (현재 상황에서 제일 최선의 선택을 하는 알고리즘)
  - 도난당한 사람의 번호와 여분을 가지고 있는 사람의 번호를 정렬
  - 여벌 체육복을 가져온 학생이 도난당할 경우를 먼저 계산
  - 여분 체육복을 가지고 있는 사람의 앞/뒤 번호가 도난당했는지 확인 후 계산

------------------------------------------------------------------------------------------

<span style="color:red">K번째 수 (21. 08. 14) - 재풀이</span>
sort 메소드 사용 : https://github.com/banjjak2/Programmers/blob/main/Level1/K%EB%B2%88%EC%A7%B8%EC%88%98_sort%EB%A9%94%EC%86%8C%EB%93%9C%EC%9D%B4%EC%9A%A9.java

sort 메소드 구현 : X

Arrays.sort 메소드 사용 시 성능이 저하되는 문제가 있음. sort 방법을 변경해서 테스트 예정

------------------------------------------------------------------------------------------

숫자 문자열과 영단어 (21. 08. 14)
https://github.com/banjjak2/Programmers/blob/main/Level1/%EC%88%AB%EC%9E%90_%EB%AC%B8%EC%9E%90%EC%97%B4%EA%B3%BC_%EC%98%81%EB%8B%A8%EC%96%B4.java
  - HashMap을 이용하여 Key, Value로 문제풀이 진행

------------------------------------------------------------------------------------------

로또의 최고 순위와 최저 순위 (21. 08. 15)
https://github.com/banjjak2/Programmers/blob/main/Level1/%EB%A1%9C%EB%98%90%EC%9D%98_%EC%B5%9C%EA%B3%A0_%EC%88%9C%EC%9C%84%EC%99%80_%EC%B5%9C%EC%A0%80_%EC%88%9C%EC%9C%84.java
  - 전달받은 lottos 배열에서 0(알 수 없는 번호)일 경우 카운트 증가
  - win_nums 배열에 있는 값이 lottos 배열에 있다면 correctCount 증가
  - 최고 순위는 알 수 없는 번호 모두 당첨번호일 때 이므로 correctCount 값에 + 0일 경우의 카운트 값
  - 최저 순위는 알 수 없느 번호 모두 낙첨번호일 때 이므로 correctCount 값
  - correctCount 값으로 순위 반환

------------------------------------------------------------------------------------------

크레인 인형뽑기 게임 (21. 08. 16)
https://github.com/banjjak2/Programmers/blob/main/Level1/%ED%81%AC%EB%A0%88%EC%9D%B8_%EC%9D%B8%ED%98%95%EB%BD%91%EA%B8%B0_%EA%B2%8C%EC%9E%84.java
  - 크레인이 잡아서 뽑을 경우 Stack에 데이터 push
  - 방금 뽑은 카카오 캐릭터가 제일 마지막에 뽑은 캐릭터 값과 같을 경우 pop
  - 동일 캐릭터가 2개일 때 터지므로 pop 할때마다 +2씩 증가

------------------------------------------------------------------------------------------

폰켓몬 (21. 08. 16)
https://github.com/banjjak2/Programmers/blob/main/Level1/%ED%8F%B0%EC%BC%93%EB%AA%AC.java
  - HashSet을 이용하여 nums 중복 제거
  - 중복제거한 데이터의 길이가 nums 개수의 반절보다 작을 경우 최대 선택 가능한 종류 개수이므로
    중복제거한 데이터의 길이를 반환
  - nums 데이터 길이의 절반이 중복제거한 데이터의 길이보다 더 클 경우 최대 선택 가능한 종류 개수가 데이터 반절의 길이이므로
    데이터 반절의 길이를 반환

소수 만들기 (21. 08. 22)
https://github.com/banjjak2/Programmers/blob/main/Level1/%EC%86%8C%EC%88%98_%EB%A7%8C%EB%93%A4%EA%B8%B0.java
  - 조합을 이용하여 구현

모의고사 (21. 08. 24)
https://github.com/banjjak2/Programmers/blob/main/Level1/%EB%AA%A8%EC%9D%98%EA%B3%A0%EC%82%AC.java
  - 수포자 1, 2, 3이 맞은 정답 개수를 correctCount 배열에 넣고 배열 중 최대값을 구하여 동일한 값이 몇 개인지 판별 후 해당 수포자 번호 반환

<span style="color:red">실패율 (21. 08. 24) - 재풀이</span>
https://github.com/banjjak2/Programmers/blob/main/Level1/%EC%8B%A4%ED%8C%A8%EC%9C%A8.java
  - HashMap을 이용해서 풀이
  - 다른 풀이에 비해 속도면에서 성능이 안좋음. 원인파악 후 재풀이 예정

3진법 뒤집기 (21. 08. 25)
https://github.com/banjjak2/Programmers/blob/main/Level1/_3%EC%A7%84%EB%B2%95_%EB%92%A4%EC%A7%91%EA%B8%B0.java
  - StringBuilder와 거듭제곱 기능으로 해결

두 개 뽑아서 더하기 (21. 08. 25)
https://github.com/banjjak2/Programmers/blob/main/Level1/%EB%91%90_%EA%B0%9C_%EB%BD%91%EC%95%84%EC%84%9C_%EB%8D%94%ED%95%98%EA%B8%B0.java
  - 조합을 이용해 해결

약수의 개수와 덧셈 (21. 08. 25)
https://github.com/banjjak2/Programmers/blob/main/Level1/%EC%95%BD%EC%88%98%EC%9D%98_%EA%B0%9C%EC%88%98%EC%99%80_%EB%8D%A7%EC%85%88.java
  - 약수의 개수를 구한 후 더함

예산 (21. 08. 25)
https://github.com/banjjak2/Programmers/blob/main/Level1/%EC%98%88%EC%82%B0.java
  - 신청금액을 sort 한 후 신청금액 배열의 앞에서부터 빼서 해결

1차 비밀지도 (21. 08. 27)
https://github.com/banjjak2/Programmers/blob/main/Level1/%EB%B9%84%EB%B0%80%EC%A7%80%EB%8F%84_1%EC%B0%A8.java
  - arr1과 arr2의 각 데이터들을 비트연산(OR) 후 결과값을 가지고 2진화하여 0이면 " ", 1이면 "#"으로 추가

가운데 글자 가져오기 (21. 08. 27)
https://github.com/banjjak2/Programmers/blob/main/Level1/%EA%B0%80%EC%9A%B4%EB%8D%B0_%EA%B8%80%EC%9E%90_%EA%B0%80%EC%A0%B8%EC%98%A4%EA%B8%B0.java
  - substring 메소드 이용

다트게임 1차 (21. 08. 28)
https://github.com/banjjak2/Programmers/blob/main/Level1/%EB%8B%A4%ED%8A%B8%EA%B2%8C%EC%9E%84_1%EC%B0%A8.java
  - 문자열에서 char값을 하나씩 가져오면서 switch 문으로 값 판단

같은 숫자는 싫어 (21. 08. 29)
https://github.com/banjjak2/Programmers/blob/main/Level1/%EA%B0%99%EC%9D%80_%EC%88%AB%EC%9E%90%EB%8A%94_%EC%8B%AB%EC%96%B4.java
  - 현재값과 이전값을 비교하여 다르면 List에 추가
  - 완성된 List를 배열로 변환

나누어 떨어지는 숫자 배열 (21. 08. 29)
https://github.com/banjjak2/Programmers/blob/main/Level1/%EB%82%98%EB%88%84%EC%96%B4_%EB%96%A8%EC%96%B4%EC%A7%80%EB%8A%94_%EC%88%AB%EC%9E%90_%EB%B0%B0%EC%97%B4.java
  - divisor로 나누어지는 값을 리스트에 저장
  - 리스트값을 하나씩 가져와 Collections.sort 메소드로 정렬 후 다시 배열로 반환

두 정수 사이의 합 (21. 08. 29)
https://github.com/banjjak2/Programmers/blob/main/Level1/%EB%91%90_%EC%A0%95%EC%88%98_%EC%82%AC%EC%9D%B4%EC%9D%98_%ED%95%A9.java
  - 전달받을 a, b에는 대소관계가 정해지지 않아 대소판단 후 사이값들의 총합을 구함

문자열 내 마음대로 정렬하기 (21. 08. 30)
https://github.com/banjjak2/Programmers/blob/main/Level1/%EB%AC%B8%EC%9E%90%EC%97%B4_%EB%82%B4_%EB%A7%88%EC%9D%8C%EB%8C%80%EB%A1%9C_%EC%A0%95%EB%A0%AC%ED%95%98%EA%B8%B0.java
  - 먼저 사전순으로 정렬한 후 특정 문자를 기준으로 정렬
  - 사전순으로 먼저 정렬하면 특정 문자를 기준으로 정렬할 때 동일한 문자가 있어도 사전순으로 정렬됨

문자열 내 p와 y의 개수 (21. 08. 30)
https://github.com/banjjak2/Programmers/blob/main/Level1/%EB%AC%B8%EC%9E%90%EC%97%B4_%EB%82%B4_p%EC%99%80_y%EC%9D%98_%EA%B0%9C%EC%88%98.java
  - 문자열을 소문자로 변환 후 p, y 비교

문자열 내림차순으로 배치하기 (21. 08. 30)
https://github.com/banjjak2/Programmers/blob/main/Level1/%EB%AC%B8%EC%9E%90%EC%97%B4_%EB%82%B4%EB%A6%BC%EC%B0%A8%EC%88%9C%EC%9C%BC%EB%A1%9C_%EB%B0%B0%EC%B9%98%ED%95%98%EA%B8%B0.java
  - String을 char배열로 변환 후 StringBuilder를 이용해 문자열을 붙여넣어 반환

문자열 다루기 기본 (21. 08. 30)
https://github.com/banjjak2/Programmers/blob/main/Level1/%EB%AC%B8%EC%9E%90%EC%97%B4_%EB%8B%A4%EB%A3%A8%EA%B8%B0_%EA%B8%B0%EB%B3%B8.java
  - 정규표현식으로 문제풀이 진행

서울에서 김서방 찾기 (21. 08. 30)
https://github.com/banjjak2/Programmers/blob/main/Level1/%EC%84%9C%EC%9A%B8%EC%97%90%EC%84%9C_%EA%B9%80%EC%84%9C%EB%B0%A9_%EC%B0%BE%EA%B8%B0.java
  - 배열을 하나씩 돌면서 Kim을 찾은 후 인덱스를 반환

소수 찾기 (21. 08. 30)
https://github.com/banjjak2/Programmers/blob/main/Level1/%EC%86%8C%EC%88%98_%EC%B0%BE%EA%B8%B0.java
https://banjjak1.tistory.com/17
  - "에라토스테네스의 체"를 이용하여 소수 판별
  - 큰 수가 소수인지 판별하는 방법으로, 2의 배수부터 지우고(자기자신 제외) 다음 숫자 3의 배수를 지우며(자기자신 제외) 이미 지워진 숫자에 접근한 경우 다음 숫자로 넘어가도록 함

수박수박수박수박수박수 (21. 08. 31)
https://github.com/banjjak2/Programmers/blob/main/Level1/%EC%88%98%EB%B0%95%EC%88%98%EB%B0%95%EC%88%98%EB%B0%95%EC%88%98%EB%B0%95%EC%88%98%EB%B0%95%EC%88%98.java
  - 나머지 연산으로 판단 후 문자열 조합하여 리턴

문자열을 정수로 바꾸기 (21. 08. 31)
https://github.com/banjjak2/Programmers/blob/main/Level1/%EB%AC%B8%EC%9E%90%EC%97%B4%EC%9D%84_%EC%A0%95%EC%88%98%EB%A1%9C_%EB%B0%94%EA%BE%B8%EA%B8%B0.java
  - Integer.parseInt 메소드로 숫자 리턴
  - 웬만하면 java에서 제공하는 메소드보단 직접 구현해서 해보기

시저암호 (21. 08. 31)
https://github.com/banjjak2/Programmers/blob/main/Level1/%EC%8B%9C%EC%A0%80_%EC%95%94%ED%98%B8.java
  - String에서 문자를 하나씩 가져와 n만큼 이동한 값이 'z'보다 크면 문자+n 에서 'z'를 뺀다.
    그럼 'a'에서 얼만큼 더 가야하는지에 대한 값이 나오므로 문자'a'에 앞서 구한 값을 더하고 -1을 해주면 n만큼 이동한 값이 나온다.
    대문자 'Z'도 마찬가지로 가능하다.

약수의 합 (21. 09. 01)
https://github.com/banjjak2/Programmers/blob/main/Level1/%EC%95%BD%EC%88%98%EC%9D%98_%ED%95%A9.java
https://banjjak1.tistory.com/18
  - 약수는 전달받은 숫자/2 보다 클 수 없으므로 for문 조건에 n/2를 해주어야 함
  - 위 생각을 못하고 단순하게 작성..

이상한 문자 만들기 (21. 09. 01)
https://github.com/banjjak2/Programmers/blob/main/Level1/%EC%9D%B4%EC%83%81%ED%95%9C_%EB%AC%B8%EC%9E%90_%EB%A7%8C%EB%93%A4%EA%B8%B0.java
  - 짝수번째인 경우 대문자로 변환
  - 홀수번째인 경우 소문자로 변환
  - toLowerCase(), toUpperCase() 메소드 이용하지 않고 알파벳 범위 정해서 구현

자릿수 더하기 (21. 09. 01)
https://github.com/banjjak2/Programmers/blob/main/Level1/%EC%9E%90%EB%A6%BF%EC%88%98_%EB%8D%94%ED%95%98%EA%B8%B0.java
  - 단순히 각 자리수를 더하는 것이기 때문에 나머지 연산과 나누기 연산을 이용해서 빠르게 풀 수 있었으나
    생각하지 못해서 문자열로 변환 후 다시 숫자로 반환..
  - 반성하자

자연수 뒤집어 배열로 만들기 (21. 09. 01)
https://github.com/banjjak2/Programmers/blob/main/Level1/%EC%9E%90%EC%97%B0%EC%88%98_%EB%92%A4%EC%A7%91%EC%96%B4_%EB%B0%B0%EC%97%B4%EB%A1%9C_%EB%A7%8C%EB%93%A4%EA%B8%B0.java
  - answer의 배열 길이를 정해주고 반복문을 통해 나머지 연산과 나누기 연산을 이용해 배열에 저장

최대공약수와 최소공배수 (21. 09. 02)
https://github.com/banjjak2/Programmers/blob/main/Level1/%EC%B5%9C%EB%8C%80%EA%B3%B5%EC%95%BD%EC%88%98%EC%99%80_%EC%B5%9C%EC%86%8C%EA%B3%B5%EB%B0%B0%EC%88%98.java
  - 소인수분해를 이용한 풀이와 유클리드 호제법을 이용한 풀이 둘 다 작성

콜라츠 추측 (21. 09. 02)
https://github.com/banjjak2/Programmers/blob/main/Level1/%EC%BD%9C%EB%9D%BC%EC%B8%A0_%EC%B6%94%EC%B8%A1.java
  - 짝수면 /2, 홀수면 *3 후 + 1

평균 구하기 (21. 09. 02)
https://github.com/banjjak2/Programmers/blob/main/Level1/%ED%8F%89%EA%B7%A0_%EA%B5%AC%ED%95%98%EA%B8%B0.java
  - 배열의 모든값을 더해서 평균을 반환

하샤드 수 (21. 09. 02)
https://github.com/banjjak2/Programmers/blob/main/Level1/%ED%95%98%EC%83%A4%EB%93%9C_%EC%88%98.java
  - 나머지 연산을 통해 각 자리의 숫자를 더해주고 하샤드 수인지 계산

핸드폰 번호 가리기 (21. 09. 02)
https://github.com/banjjak2/Programmers/blob/main/Level1/%ED%95%B8%EB%93%9C%ED%8F%B0_%EB%B2%88%ED%98%B8_%EA%B0%80%EB%A6%AC%EA%B8%B0.java
  - StringBuilder로 변환 후 끝 4자리를 제외하고 '*' 처리

행렬의 덧셈 (21. 09. 02)
https://github.com/banjjak2/Programmers/blob/main/Level1/%ED%96%89%EB%A0%AC%EC%9D%98_%EB%8D%A7%EC%85%88.java
  - 이중 for문으로 2차원 배열 arr1, arr2에 접근 후 더하여 answer에 저장

x만큼 간격이 있는 n개의 숫자 (21. 09. 02)
https://github.com/banjjak2/Programmers/blob/main/Level1/x%EB%A7%8C%ED%81%BC_%EA%B0%84%EA%B2%A9%EC%9D%B4_%EC%9E%88%EB%8A%94_n%EA%B0%9C%EC%9D%98_%EC%88%AB%EC%9E%90.java
  - int + long 의 경우 결과값이 long으로 연산결과가 나온다.
    int + int 의 경우 결과값이 long으로 연산결과가 나온다.
    따라서 인자값을 int형에서 long으로 바꿔주면 해결 가능하다.

직사각형 별찍기 (21. 09. 02)
https://github.com/banjjak2/Programmers/blob/main/Level1/%EC%A7%81%EC%82%AC%EA%B0%81%ED%98%95_%EB%B3%84%EC%B0%8D%EA%B8%B0.java
  - 구구단과 비슷한 이중포문 반복문제

위클리챌린지 4주차 (21. 09. 02)
https://github.com/banjjak2/Programmers/blob/main/Level1/%EC%9C%84%ED%81%B4%EB%A6%AC%EC%B1%8C%EB%A6%B0%EC%A7%80_4%EC%A3%BC%EC%B0%A8.java
  - 직업을 class화 해서 풀이했으나 다른 풀이보다 성능 및 코드길이가 좋지않음..ㅠㅠ

정수 내림차순으로 배치하기 (21. 09. 03)
https://github.com/banjjak2/Programmers/blob/main/Level1/%EC%A0%95%EC%88%98_%EB%82%B4%EB%A6%BC%EC%B0%A8%EC%88%9C%EC%9C%BC%EB%A1%9C_%EB%B0%B0%EC%B9%98%ED%95%98%EA%B8%B0.java
  - 숫자를 문자열로 변환 후 split으로 잘라 각 숫자들을 내림차순으로 정렬하고 split으로 자른 배열을 숫자 형태로 변환

정수 제곱근 판별 (21. 09. 03)
https://github.com/banjjak2/Programmers/blob/main/Level1/%EC%A0%95%EC%88%98_%EC%A0%9C%EA%B3%B1%EA%B7%BC_%ED%8C%90%EB%B3%84.java
  - 전달받은 숫자를 Math.sqrt 메소드를 이용해 루트연산하고 1로 나눈 나머지가 0보다 크면 제곱근이 아니라 판단하여 -1 반환, 0이면 제곱근으로 판단하고 결과값 반환

짝수와 홀수 (21. 09. 03)
https://github.com/banjjak2/Programmers/blob/main/Level1/%EC%A7%9D%EC%88%98%EC%99%80_%ED%99%80%EC%88%98.java
  - 단순히 나머지 연산을 통해 짝수인지 홀수인지 판단하는 문제
