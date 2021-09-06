package p08interface.p02quiz;

public class OracleDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("db에서 검색");
	}

	@Override
	public void insert() {
		System.out.println("db에서 삽입");
	}

	@Override
	public void update() {
		System.out.println("db에서 업데이트");
	}

	@Override
	public void delete() {
		System.out.println("db에서 삭제");
	}

}
