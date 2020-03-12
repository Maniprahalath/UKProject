public class employeeData  
{
	
	public DataSet getdata_dtIDUise(employee obj)
	{
	 DataSet ds;
	 string sql;
	 sql="select * from employee where employeeld=" +obj.id+ "order by employeeld;
	 ds=new DataSet();
		ds=objdt.ExecuteSql(sql); 
		return ds;
	}
}