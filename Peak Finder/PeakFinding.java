public class PeakFinding {
    public boolean isPeak(int[] arr,int index)
    {
        if(index==0)
        {
            if(arr[1]<arr[0])
                return true;
            return false;
        }
        if(index==arr.length-1)
        {
            if(arr[index-1]<arr[index])
                return true;
            return false;
        }
        if(arr[index-1]<arr[index])
        {
            if(arr[index+1]<arr[index])
                return true;
            return false;
        }
        return false;
    }

    public static void main(String args[])
    {
        int[] array={1,0,3,2,5,6,4,3,8,9};
        PeakFinding peakFinding=new PeakFinding();

        for(int index=0;index<10;index++)
        {
            if(peakFinding.isPeak(array,index))
            {
                System.out.println(array[index]);
            }
        }

    }
}
