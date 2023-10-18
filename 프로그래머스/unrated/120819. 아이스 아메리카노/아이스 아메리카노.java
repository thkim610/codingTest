class Solution {
    public int[] solution(int money) {
        int coffees = money/5500; //커피의 수
        int balance = money%5500; //잔액
        int[] answer = {coffees, balance};
        return answer;
    }
}