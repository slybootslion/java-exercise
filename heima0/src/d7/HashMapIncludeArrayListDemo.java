package d7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapIncludeArrayListDemo {
    public static void main(String[] args) {
        HashMap<String, ArrayList> hm = new HashMap<>();

        ArrayList<String> sgyy = new ArrayList<>();
        sgyy.add("诸葛亮");
        sgyy.add("赵云");
        hm.put("三国演义", sgyy);

        ArrayList<String> shz = new ArrayList<>();
        shz.add("武松");
        shz.add("鲁智深");
        hm.put("水浒传", shz);

        ArrayList<String> xyj = new ArrayList<>();
        xyj.add("唐僧");
        xyj.add("孙悟空");
        hm.put("西游记", xyj);


        Set<String> shuArr = hm.keySet();
        for (String shu : shuArr) {
            System.out.println(shu);
            ArrayList<String> al = hm.get(shu);
            for (String s : al) {
                System.out.println("\t" + s);
            }
        }
    }
}
