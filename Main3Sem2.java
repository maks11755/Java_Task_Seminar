// Напишите метод, который принимает на вход строку (String) и
// определяет является ли строка палиндромом (возвращает
// boolean значение).
public class Main3Sem2 {
        public static void main(String[] args) {
            System.out.println(polindromV2("Рђ СЂРѕР·Р° СѓРїР°Р»Р° РЅР° Р»Р°РїСѓ РђР·РѕСЂР°"));
        }
    
        public static boolean polindrom(String str) {
            str = str.toLowerCase();
            str = str.replace(" ", "");
            for (int i = 0; i < str.length() / 2; i++) {
                if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                    return false;
                }
            }
            return true;
        }
    
        public static boolean polindromV2(String str){
            str = str.toLowerCase();
            str = str.replace(" ", "");
            StringBuilder stringBuilder = new StringBuilder(str);
            stringBuilder.reverse();
            return stringBuilder.toString().equals(str);
        }
    }

