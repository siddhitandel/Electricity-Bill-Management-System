package minipro;

public class Adminn {
	private int AdminnId;
	private String AdminnName;
	private String password;
	private int boardId;
	public int getAdminnId() {
		return AdminnId;
	}
	public void setAdminnId(int adminnId) {
		AdminnId = adminnId;
	}
	public String getAdminnName() {
		return AdminnName;
	}
	public void setAdminnName(String adminnName) {
		AdminnName = adminnName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getBoardId() {
		return boardId;
	}
	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}
	public Adminn(int adminnId, String adminnName, String password, int boardId) {
		super();
		AdminnId = adminnId;
		AdminnName = adminnName;
		this.password = password;
		this.boardId = boardId;
	}
	public Adminn(String adminnName, String password, int boardId) {
		super();
		AdminnName = adminnName;
		this.password = password;
		this.boardId = boardId;
	}
	public String toString() {
		return "Adminn [AdminnId=" + AdminnId + ", AdminnName=" + AdminnName + ", password=" + password + ", boardId="
				+ boardId + "]";
	}
	public Adminn() {
		super();
		// TODO Auto-generated constructor stub
	}
}
