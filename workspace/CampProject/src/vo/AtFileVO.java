package vo;

public class AtFileVO {
	
	private long fileId = -1;
	private int fileNo = 1;
	private String fileOrigin;
	private String fileStrname;
	private String fileCon;
	private long fileSize = 0;
	private String filePath;
	private String fileExp;
	
	public long getFileId() {
		return fileId;
	}
	public void setFileId(long fileId) {
		this.fileId = fileId;
	}
	public int getFileNo() {
		return fileNo;
	}
	public void setFileNo(int fileNo) {
		this.fileNo = fileNo;
	}
	public String getFileOrigin() {
		return fileOrigin;
	}
	public void setFileOrigin(String fileOrigin) {
		this.fileOrigin = fileOrigin;
	}
	public String getFileStrname() {
		return fileStrname;
	}
	public void setFileStrname(String fileStrname) {
		this.fileStrname = fileStrname;
	}
	public String getFileCon() {
		return fileCon;
	}
	public void setFileCon(String fileCon) {
		this.fileCon = fileCon;
	}
	public long getFileSize() {
		return fileSize;
	}
	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getFileExp() {
		return fileExp;
	}
	public void setFileExp(String fileExp) {
		this.fileExp = fileExp;
	}
	
	

}
