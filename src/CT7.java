
public class CT7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convertTo7(-7));
	}

	public static String convertTo7(int num) {
        StringBuilder r = new StringBuilder();
        if (num < 0) {
        	r.insert(0, '-');
            num = -num;
        }
        while (num != 0) {
            r.insert(0, num % 7);
            num /= 7;
        }
        return r.toString();
    }
}
