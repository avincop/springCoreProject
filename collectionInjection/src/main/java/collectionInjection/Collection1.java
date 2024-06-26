package collectionInjection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Collection1 {
	
	private List addressList;
	private Set addressSet;
	private Map addressMap;
	private Properties userDetail;
	public Properties getUserDetail() {
		return userDetail;
	}
	public void setUserDetail(Properties userDetail) {
		this.userDetail = userDetail;
	}
	public List getAddressList() {
		return addressList;
	}
	public void setAddressList(List addressList) {
		this.addressList = addressList;
	}
	public Set getAddressSet() {
		return addressSet;
	}
	public void setAddressSet(Set addressSet) {
		this.addressSet = addressSet;
	}
	public Map getAddressMap() {
		return addressMap;
	}
	public void setAddressMap(Map addressMap) {
		this.addressMap = addressMap;
	}

}
