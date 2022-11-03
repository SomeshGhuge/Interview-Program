package SingletonePatternSerializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class SingletonSerializedTest implements Serializable {
	private static final long serialVersionUID = 1L;
	public static void main(String[] args) {
// here by serialization and deserialization our 
//purpose is not  fullfill we get two hashcode for that 
// we have readResolve() method to achive our target using this method
// in singleton we write this method then we get our solution
 
		try {
			Singleton instance1 = Singleton.getSingletonObject();
			ObjectOutput out = new ObjectOutputStream(new FileOutputStream("F:\\SOMESH\\Information Technology\\Softaware Course\\Java\\Velocity\\Java Backend Developer\\Practise\\AA.txt"));
			out.writeObject(instance1);
			out.close();
			ObjectInput in = new ObjectInputStream(new FileInputStream("F:\\SOMESH\\Information Technology\\Softaware Course\\Java\\Velocity\\Java Backend Developer\\Practise\\AA.txt"));
			Singleton instance2 = (Singleton) in.readObject();
			in.close();
			System.out.println("instance 1>>" + instance1.hashCode());
			System.out.println("instance 2>>" + instance2.hashCode());
		} catch (Exception e) {
			e.printStackTrace(); 
			
			
		}
		}
	}
