import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> examScores = new HashMap<String , Integer>();

        examScores.put("OS" , 15);
        examScores.put("Math" , 17);
        examScores.put("Web dev" , 10);
        examScores.put("Culture G" , 5);

        examScores.replace("Math", 18);
        examScores.putIfAbsent("Math", 10);
        examScores.remove("OS");
        examScores.forEach((k ,v)  -> System.out.println(k + " : " + v));
        
        System.out.println(examScores.get("Math"));
        System.out.println(examScores.getOrDefault("religion" , -1));
        System.out.println(examScores.toString());
        System.out.println(examScores.containsKey("OS"));
        System.out.println(examScores.containsValue(18));




        examScores.clear();
        System.out.println("CLearing the Hashmap....");
        System.out.println(examScores.isEmpty());
        System.out.println(examScores.toString());

    }
}
