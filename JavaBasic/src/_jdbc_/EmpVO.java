package _jdbc_;

public class EmpVO {

	private int employee_id;
	private String last_name;
	private int salary;
	private DeptVO deptVO;

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public DeptVO getDeptVO() {
		return deptVO;
	}

	public void setDeptVO(DeptVO deptVO) {
		this.deptVO = deptVO;
	}

	@Override
	public String toString() {
		return employee_id + "\t" + last_name + "\t" + salary + "\t" + deptVO;
	}

}
