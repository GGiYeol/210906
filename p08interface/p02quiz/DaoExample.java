package p08interface.p02quiz;

public class DaoExample {

	public static void dbWork(DataAccessObject dao) {
		dao.insert();
		dao.select();
		dao.update();
		dao.delete();
	}
	public static void main(String[] args) {
		
		dbWork(new OracleDao());
		dbWork(new MysqlDao());
	}
}
