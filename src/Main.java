public class Main {

//1
   /* public boolean firstLast6(int[] nums){
        if (nums[0] ==6 || nums[nums.length-1] == 6)
            return  true;
        else return false;

    }

    */


    //2

    /*public boolean commonEnd(int[] a, int[] b) {
if (a[0] == b[0] || a[a.length-1] == b[b.length-1])
    return true;
else return false;
    }

     */


    //3

    /*public int sum3(int[] nums) {
  return nums[0] + nums[1] + nums[2]
    }

     */

    public int[] reverse3(int[] nums) {
int[] array2 = new [3];

array2[0]  = nums[2];
array2 [1] = nums[1];
array2 [2] = nums[0];
return array2

    }







    public int[] middleWay(int[] a, int[] b) {

        int [] array = new int[2];
        array[0] = a[1];
        array[1] = b[1];

        return array;
    }


    public int[] makeEnds(int[] nums) {
int[]  array  = new int[2];
array[0] = nums[0];
array[1] = nums[nums.length-1];
return array;
    }


    public boolean has23(int[] nums) {
if (nums[0]==2 || nums[1] ==2 || nums[0] ==3 || nums[1]==3)
    return true;
else return false;


    }



}
