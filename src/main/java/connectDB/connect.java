package connectDB;

public class connect {
	public String name="root";
	public String pass="1411";

	/*String sql = String.format(
    "jdbc:mysql://google/%s?cloudSqlInstance=%s&"
        + "socketFactory=com.google.cloud.sql.mysql.SocketFactory", "ckedittor","hello-161108:asia-northeast1:dtdm-nhom10");
*/
	String sql ="jdbc:mysql://localhost/ckedittor";
public String getSQL()
{
	return sql;
}
public String getName()
{
	return name;
}
public String getPass()
{
	return pass;
}

}
