public class MainTest {
    public static void main(String[] args) {
        System.out.println(task02("aaaabbccd"));
    }


    public static String task02(String s)
    {
        StringBuilder result = new StringBuilder();
        char ch;
        int count = 0;
        ch = s.charAt(0);
        char[] arr = s.toCharArray();
        for(char temp : arr)
        {
            if (temp != ch){
                result.append(ch);
                result.append(count);
                ch = temp;
                count = 1;
            }
            else{
                count++;
            }
        }
        result.append(ch);
        result.append(count);

        return result.toString();
    }
}
