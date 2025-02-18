public class MergeSort {
    public static void main(String[] args) {
        sort s = new sort();
        int nums[] = {2,0,2,1,1,0};
        s.partition(nums,0,nums.length -1);
        for(int x : nums){
            System.out.print(x+" ");
        }
    }
}
class sort{
    public void partition(int nums[], int start, int end){
        if(start == end){
            return;
        } else {
            int middle = (start+end)/2;
            partition(nums,start,middle);
            partition(nums,middle+1,end);
            merge(nums,start,end, middle);
        }

    }
    private void merge(int nums[], int start, int end, int middle){
        int beg = start;
        int beg2 = middle + 1;
        while(beg<=middle && beg2 <= end){
            if(nums[beg] < nums[beg2]){
                beg++;
            } 
            else{
                int value = nums[beg2];
                int index = beg2;
                while (index != beg) {
                    nums[index] = nums[index - 1];
                    index--;
                }
                nums[beg] = value;
                beg++;
                middle++;
                beg2++;
            } 
        }
    }
}
