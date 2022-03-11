<div align="center">A. Playoff</div>
<div align="center">time limit per test : 2 seconds</div>
<div align="center">memory limit per test : 512 megabytes</div>
<div align="center">input : standard input</div>
<div align="center">output : standard output</div><br>



Consider a playoff tournament where  2n2n  athletes compete. The athletes are numbered from  11  to  2n2n.

The tournament is held in  nn  stages. In each stage, the athletes are split into pairs in such a way that each athlete belongs exactly to one pair. In each pair, the athletes compete against each other, and exactly one of them wins. The winner of each pair advances to the next stage, the athlete who was defeated gets eliminated from the tournament.

The pairs are formed as follows:

-   in the first stage, athlete  11  competes against athlete  22;  33  competes against  44;  55  competes against  66, and so on;
-   in the second stage, the winner of the match "11–22" competes against the winner of the match "33–44"; the winner of the match "55–66" competes against the winner of the match "77–88", and so on;
-   the next stages are held according to the same rules.

When athletes  xx  and  yy  compete, the winner is decided as follows:

-   if  x+yx+y  is odd, the athlete with the lower index wins (i. e. if  x<yx<y, then  xx  wins, otherwise  yy  wins);
-   if  x+yx+y  is even, the athlete with the higher index wins.

The following picture describes the way the tournament with  n=3n=3  goes.

![enter image description here](https://espresso.codeforces.com/b4d1f5820e5d7709f5ae5211412e5a2be30315c5.png)

Your task is the following one: given the integer  nn, determine the index of the athlete who wins the tournament.

<u> **Input**</u> 

The first line contains one integer  tt  (1≤t≤301≤t≤30) — the number of test cases.
Each test case consists of one line containing one integer  nn  (1≤n≤301≤n≤30).  

 <U>**Output**</u>

For each test case, print one integer — the index of the winner of the tournament.      
#

>**Input**  

2  

3  

1  


>**Output** 

7  

1
