package Exercise11_04;

public class F {
	protected int i = 0;
public void go(){ i++; }

public String toString(){ return String.valueOf(i); }
}
class G extends F{
	public void go() {i+=2;}
	
}

