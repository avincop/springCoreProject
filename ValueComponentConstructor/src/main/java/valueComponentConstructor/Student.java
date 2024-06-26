package valueComponentConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	private Address address;
	private Subject subject;
	public Student(@Value("#{address}") Address address,@Value("#{subject}") Subject subject) {
		super();
		this.address = address;
		this.subject = subject;
	}

	
	@Override
	public String toString() {
		return "Student [address=" + address + ", subject=" + subject + "]";
	}
}
