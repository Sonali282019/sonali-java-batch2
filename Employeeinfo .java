public class EmployeeVal 
{
	String eno;
	String ename;
	String edesignation;
	
	public String getEno() {
		return eno;
	}
	public void setEno(String eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEdesignation() {
		return edesignation;
	}
	public void setEdesignation(String edesignation) {
		this.edesignation = edesignation;
	}
	
	@Override
	public String toString() 
	{
		return "EmployeeVal [eno=" + eno + ", ename=" + ename + ", edesignation=" + edesignation + "]";
	}
	
}