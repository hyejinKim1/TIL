package Algorithm.recursive.조합;

import java.util.Arrays;
public class 조합 {

  static int [] arr = {1, 2, 3, 4, 5};
  static int [] sel = new int [3];

  public static void main(String [] args){
    comb(0, 0);
  }

  public static void comb(int idx, int k){
    if(k == sel.length){
      System.out.println(Arrays.toString(sel));
      return;
    }
    for(int i=idx; i<arr.length; i++){
      sel[k] = arr[i];
      comb(i+1, k+1);
    }
  }
}
