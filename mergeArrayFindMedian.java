class mergeArrayFindMedian{
    public static void main(String[] args) {
        int nums1[]={1,3,5};
        int nums2[]={2,4,6,7};
        Main.merge(nums1,nums2);
    }
}
class Main{
    public static void merge(int nums1[],int nums2[])
    {
        int m=nums1.length;
        int n=nums2.length;
        int arr[]=new int[m+n];
        int i=0,j=0,k=0;
        while(i<m&&j<n)
        {
            if(nums1[i]<nums2[j])
            {
                arr[k]=nums1[i];
                i++;
                k++;
            }
            else{
                arr[k]=nums2[j];
                j++;
                k++;
            }
        }
        if(i<m)
        {
            while(i<m)
            {
                arr[k]=nums1[i];
                i++;k++;
            }
        }
        else{
            while(j<n)
            {
                arr[k]=nums2[j];
                j++;k++;
            }
        }
        for(int l=0;l<k;l++)
        {
            System.out.println(arr[l]);
        }
        if(arr.length%2==0)
        {
            System.out.println((double)(arr[arr.length/2]+arr[arr.length/2-1])/2);
        }
        else{
            System.out.println((double)(arr[(arr.length-1)/2]));
        }
    }
}