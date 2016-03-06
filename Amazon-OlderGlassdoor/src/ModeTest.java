
public class ModeTest {
	public static void main(String[] args) {
        ModeStack<Integer> s = new ModeStack<>();
        s.push(1);
        System.out.println(s.mode());
        s.push(2);
        s.push(2);
        s.push(3);
        s.push(3);
        s.push(3);
        System.out.println(s.mode());
        s.pop();
        System.out.println(s.mode());
    }

}
