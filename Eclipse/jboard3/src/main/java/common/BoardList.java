package common;

import java.util.List;
import java.util.Map;


public class BoardList {
	
	
	public List<Map> selectBoard() {
		JdbcUtil jdbcUtil = new JdbcUtil();

		String sql = """
				select * from board;	
			""";
        List<Map> lst = jdbcUtil.selectBySql(sql);
        return lst;
    }
}