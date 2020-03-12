public class employeeInfo
{
	public DataSet GetAllEmployeeBsIDWise(employee obj)
	{
	 DataSet ds=new DataSet();
	 ds=objdt.getdata_dtIDWise(obj);
	 return ds;
	}

}