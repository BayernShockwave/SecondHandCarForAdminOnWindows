package JunitDemo;

import static org.junit.Assert.assertEquals;
import java.sql.ResultSet;
import org.junit.Test;
import Entity.Man;
import dButil.SqlHelper;

public class NameDemo {
	@Test
	public void test() {
		Man man = null;
		String sql="select * from man where mid='001'"; 
		ResultSet rs = SqlHelper.executeQuery(sql);
		try {
			while(rs.next()) {
				man = new Man();
				man.setId(rs.getString(1));
				man.setName(rs.getString(2));
				man.setPwd(rs.getString(3));
			}
			SqlHelper.closeConnect();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		System.out.println(man.getName());
		assertEquals("³Â¾¸Çï",man.getName());
	}
}