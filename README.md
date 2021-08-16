# Programmers
알고리즘 문제풀이

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

K번째 수 (21. 08. 14)
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
    