 package ValueComponentInJava;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("#{address}")
	
	private Address address;
	@Value("#{subject}")
	
	private Subject subject;
	@Override
	public String toString() {
		return "Student [address=" + address + ", subject=" + subject + "]";
	}
}
