# 24523번: 내 뒤에 나와 다른 수 - <img src="https://static.solved.ac/tier_small/9.svg" style="height:20px" /> Silver II

<!-- performance -->
### 성능 요약
메모리: 219484 KB, 시간: 704 ms
<!-- end -->

## 문제

[문제 링크](https://boj.kr/24523)


<p>길이가 $N$인 수열 $A_1 \ A_2 \ \cdots&nbsp;\ A_N$이 주어진다. $1\le i \le N$인 정수&nbsp;$i$마다 $i &lt; j \le N$이고 $A_i \ne A_j$인 정수 $j$중 최솟값을 출력하라. 만약 이러한 $j$가 없다면 $-1$을 출력하라.</p>



## 입력


<p>첫째 줄에 수열 $A$의 크기 $N$이 주어진다. 둘째 줄에는 $A_1 \ A_2 \ \cdots&nbsp;\ A_N$이 공백으로 구분되어 주어진다. $(1 \le N \le 10^6$, $-10^9 \le A_i \le 10^9 )$</p>

<p>입력으로 주어지는 모든 수는 정수이다.</p>



## 출력


<p>각 $i$마다 조건을 만족하는 최솟값 $j$를 출력하라. 만약 이러한 $j$가 없다면 $-1$을 출력하라.</p>



## 소스코드

[소스코드 보기](Main.java)