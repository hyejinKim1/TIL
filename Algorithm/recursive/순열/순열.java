package Algorithm.recursive.순열;

import java.util.Arrays;

// 순열
// 순서가 있는 조합
// n개 중 r개를 뽑아서 줄세우기

public class 순열{
  static int[] arr={1, 3, 5};
  static int[] sel=new int[2];
  static boolean[] v = new boolean[arr.length];

  public static void main(String[] args){
    recursive(0);
    System.out.println(cnt);
  }

  static int cnt = 0;

  private static void recursive(int idx){
    if(idx == sel.length){
      cnt++;
      System.out.println(Arrays.toString(sel));
      return;
    }

    for(int i=0; i<arr.length; i++){
      if(!v[i]){
        v[i] = true;
        sel[idx] = arr[i];
        recursive(idx+1);
        v[i] = false;
      }
    }
  }

}