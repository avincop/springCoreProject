package autowiringByXmlConstructor;

public class Department {
    private int DeptId;

	public int getDeptId() {
		return DeptId;
	}

	public void setDeptId(int deptId) {
		DeptId = deptId;
	}

	@Override
	public String toString() {
		return "Department [DeptId=" + DeptId + "]";
	}
}
