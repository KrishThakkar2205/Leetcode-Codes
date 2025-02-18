public class maxAreaFromArray {
    public static void main(String[] args) {
        int arr[]={1,8,6,2,5,4,8,3,7};
        MaxArea.find(arr);
    }
}
class MaxArea{
    public static void find(int arr[])
    {
        int maxArea=0;
        int front=0;
        int last=arr.length-1;
        while(front!=last){
            if(arr[front]<arr[last]){
                if(maxArea<arr[front]*(last-front)){
                    maxArea=arr[front]*(last-front);
                }
                front++;
            }
            else{
                if(maxArea<arr[last]*(last-front)){
                    maxArea=arr[last]*(last-front);
                }
                last--;
            }
        }
        System.out.println(maxArea);
    }
}
