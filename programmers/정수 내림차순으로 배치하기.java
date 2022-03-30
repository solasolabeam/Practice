import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = Long.toString(n);   // longŸ�� -> string���� ��ȯ
        String[] arr = str.split("");    // �� �ڸ��� ������ ������ arr�迭�� ����
        Arrays.sort(arr,Collections.reverseOrder()); // arr�迭�� ������������ ����
        String temp =String.join("",arr);  // arr�迭�� ����Ǿ��� ������ ��ĭ���� temp�� ����
        answer = Long.parseLong(temp);  
        return answer;
    }
}