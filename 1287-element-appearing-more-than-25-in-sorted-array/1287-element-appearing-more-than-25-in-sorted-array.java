class Solution {
    public int findSpecialInteger(int[] arr) {
        
        int size = arr.length;
        if(size == 1){
            return 1;
        }
        int number = (size * 25)/100;
        
        for(int i=0;i<size-1;i++){
            int count =1;
            for(int j =i+1;j<size;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
                if(count> number){
                    return arr[j];
                }
            }
        }
        return 0;
    }
}