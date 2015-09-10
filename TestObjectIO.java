import java.io.*;
class  T implements Serializable
{
	int a = 1;
	transient int b = 2;
	double c = 5.9;
}

public class TestObjectIO
{

	public static void main(String[] args)
	throws Exception
	{
		T t = new T();
		t.b = 10;
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e:\\javawebcode\\3.dat"));
		oos.writeObject(t);
		oos.flush();
		oos.close();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e:\\javawebcode\\3.dat"));
		T tRead = (T)ois.readObject();
		System.out.println(tRead.a + " " + tRead.b + " " +tRead.c);
		ois.close();

	}
}