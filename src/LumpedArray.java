public class LumpedArray {
    public static void main(String[] args) {
        int[] arr1=new int[4];
        int[]arr2=new int[5];
        int[]arr=new int[arr1.length+arr2.length];
        for (int i=0;i<4;i++) {
            arr1[i]=i+1;
            arr[i]=arr1[i];

        }
        for (int j=0;j<5;j++) {
            arr2[j]=j+5;
            arr[j+4]=arr2[j];


        }
        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);

        }

    }
}
