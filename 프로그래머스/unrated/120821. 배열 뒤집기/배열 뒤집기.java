class Solution {
    public int[] solution(int[] num_list) {
        int max = num_list.length; // 배열의 길이 확인.
        int[] reverse = new int[max];
        //새로운 배열에 값을 넣을때 주어진 배열에 마지막 값부터 넣음.
        for(int i=0; i<max; i++){
            reverse[i]=num_list[(max-1)-i];
        }
        return reverse;
    }
}