package collection;

import java.util.ArrayList;
import java.util.List;

public class listinterface {
    public static void main(String[] args) {
        List <String> strList = new ArrayList<>(); // <> use for specific type declaration like int, String etc
        strList.add("prashant");
        strList.add("shanghai");


//      System.out.println(strList.get(0));
//      System.out.println(strList.get(1));


//        strList.add(1, "pradeep");
//        strList.remove("shanghai");
          //strList.add(54);


//        if (strList.contains("pradeep")) {
//            System.out.println("padeep exist");//pradeep exist nut PRadeep not exist
//        }
        if (strList.contains("shanghai")) {
            System.out.println(strList.indexOf("shanghai"));
        }


//            for (int i = 0; i < strList.size(); i++) {
//                System.out.println(strList.get(i));
//            }
        for (String str : strList) {
            System.out.println(str);
        }
        }
    }


