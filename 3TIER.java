private void DataGrid1_SelectedIndexChanged(object sender, System.EventArgs e)
{
employee objproperty=new employee();

employeeInfo objbs=new employeeInfo();

DataSet ds=new DataSet();

objproperty.id=int.Parse(DataGridl.SelectedItem.Cells[1].Text.ToString());

ds=objbs.GetAllEmployeeBsIDWise(objproperty);

txtId.Text=ds.Tables[0].Rows[0][0].ToString();
txtFname.Text=ds.Tables[0].Rows[0][1].ToString();
txtAddress.Text=ds.Tables[0].Rows[0][2].ToString();
txtemail.Text=ds.Tables[0].Rows[0][3].ToString();

public class employeeInfo
{
	public DataSet GetAllEmployeeBsIDWise(employee obj)
	{
	 DataSet ds=new DataSet();
	 ds=objdt.getdata_dtIDWise(obj);
	 return ds;
	}

}


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