package remindprogrammers;

/*문제 설명
Finn은 요즘 수학공부에 빠져 있습니다. 수학 공부를 하던 Finn은 자연수 n을 연속한 자연수들로 표현 하는 방법이 여러개라는 사실을 알게 되었습니다.
예를들어 15는 다음과 같이 4가지로 표현 할 수 있습니다.

1 + 2 + 3 + 4 + 5 = 15
4 + 5 + 6 = 15
7 + 8 = 15
15 = 15
자연수 n이 매개변수로 주어질 때, 연속된 자연수들로 n을 표현하는 방법의 수를 return하는 solution를 완성해주세요.

제한사항
n은 10,000 이하의 자연수 입니다.*/
public class MathStudy {

    //순열 ? , 재귀 ?
    public int solution(int n) {
        int answer = 0;
        int sum = 0;

        //n 보다 크면 더 할 필요없음
        //연속되어야함
        //시간 초과
        for(int i=1; i<n; i++){
            sum = i;
            for(int j=i+1; j<=n; j++){
                sum = sum + j;

                if (sum == n){
                    answer++;
                    break;
                }else if (sum > n){

                    break;
                }

            }
        }


        return answer+1;
    }

    public static void main(String[] args) {
        MathStudy m = new MathStudy();
        System.out.println(m.solution(15));
    }
}
