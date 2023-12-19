// Написать метод, который переведет число из римского формата записи в арабский.
// Например, MMXXII = 2022



import java.util.*;

public class Main3_Sem_5 {
    public static void main(String[] args) {
        Map<Integer, List<String>> map = new TreeMap<>(Comparator.reverseOrder());
        String s = "РњРѕСЂРѕР· Рё СЃРѕР»РЅС†Рµ РґРµРЅСЊ С‡СѓРґРµСЃРЅС‹Р№\n" +
                "Р•С‰Рµ С‚С‹ РґСЂРµРјР»РµС€СЊ РґСЂСѓРі РїСЂРµР»РµСЃС‚РЅС‹Р№\n" +
                "РџРѕСЂР° РєСЂР°СЃР°РІРёС†Р° РїСЂРѕСЃРЅРёСЃСЊ.";
        s = s.replace("\n", " ");
        s = s.replace(".", "");
        String[] words = s.split(" ");
        for (String word: words){
            int len = word.length();
//            if (map.containsKey(len)){
//                List<String> list = map.get(len);
//                list.add(word);
//            } else {
//                List<String> list = new LinkedList<>();
//                list.add(word);
//                map.put(len, list);
//            }
            List<String> list = map.getOrDefault(len, new LinkedList<>());
            list.add(word);
            if (!map.containsKey(len)){
                map.put(len, list);
            }
        }
        System.out.println(map);
    }
}
