package Experiment2;

public class Array {
    public static void main(String[] args) {
//        int myArray[] = new int[]{ 1, 2, 3, 4, 5, 6 };
////        int yourArray[] = new int[]{ 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
//////		public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
//////		代码解释:
//////		　　Object src : 原数组
//////		  	  int srcPos : 从元数据的起始位置开始
//////		　　Object dest : 目标数组
//////		　　int destPos : 目标数组的开始起始位置
//////		　　int length  : 要copy的数组的长度
////        System.arraycopy(myArray, 0, yourArray, 0,myArray.length);
////        for(int i=0;i<yourArray.length;i++) {
////            System.out.println(yourArray[i]);
////        }

//-------------------------------------------------------------------------------------


//        // TODO Auto-generated method stub
//        int arr[] = new int[] {10,7,9,2,4,5,1,3,6,8};
//        Arrays.sort(arr);
//        for(int i=0;i<arr.length;i++) {
//            System.out.println(arr[i]);
//        }
//
////-------------------------------------------------------------------------------------
//
        int arr1[][] = {{1,2},{3,4}};
        int arr2[][] =  {{5,6},{7,8}};
        int result1[][] = new int[2][2];
        int result2[][] = new int[2][2];
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                result1[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                result2[i][j] = arr1[i][j] * arr2[i][j];
            }
        }

    }
}

