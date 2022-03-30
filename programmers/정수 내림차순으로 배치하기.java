import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = Long.toString(n);   // long타입 -> string으로 변환
        String[] arr = str.split("");    // 한 자릿수 단위로 나눠서 arr배열에 저장
        Arrays.sort(arr,Collections.reverseOrder()); // arr배열을 내림차순으로 정렬
        String temp =String.join("",arr);  // arr배열에 저장되었던 수들을 빈칸없이 temp에 대입
        answer = Long.parseLong(temp);  
        return answer;
    }
}