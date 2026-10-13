package collection;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args) {
      List strList = new ArrayList();
      strList.add("prashant");
      strList.add("shanghai");
//      System.out.println(strList.get(0));
//      System.out.println(strList.get(1));
      strList.add(1,"pradeep");
      for  (int i = 0; i < strList.size(); i++) {
          System.out.println(strList.get(i));
      }
     }
   }

