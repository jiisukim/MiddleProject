package vo;

public class ConstVO {
	//-----------예시---------------
	public static final String Y = "Y";
	public static final String N = "N";
	public static final String YES = "yes";	
	
	public static String getYes() {
		return YES;
	}
	public static final String VIEW_PAGE_ROOT = "/WEB-INF/views";
	public static final String VIEW_TYPE_LIST = "LIST";
	//----------------------------
	// TYPE LIST, DETAIL, CREATE, MODIFY, DELETE 등등
	
	public static final String VIEW_HOST_JOINFORM = "/WEB-INF/views/client/host_join.jsp";
	public static final String VIEW_HOST_OVERLAPCHECK = "/WEB-INF/views/client/overlap_check.jsp";
	public static final String VIEW_HOST_INSERTCHECK = "/WEB-INF/views/client/insert_check.jsp";
	public static final String VIEW_CLIENT_JOINFORM = "/WEB-INF/views/client/client_join.jsp";
	public static final String VIEW_FAQ_LIST = "/WEB-INF/views/common/faq.jsp";
	public static final String VIEW_CLIENT_BOOKING ="/WEB-INF/views/client/client_booking.jsp";
	public static final String VIEW_CLIENT_RECEIPT ="/WEB-INF/views/client/receipt.jsp";
	
	public static final String VIEW_MAIN_PAGE = "/index.jsp";
	
	//---DOTORI-----------------------------------------------------
	public static final String VIEW_LOGIN = "/login.jsp";
	public static final String CHECK_VERIFY = "/WEB-INF/views/common/loginVerify.jsp";
	
	
	
	public static final String LOGIN_TYPE = "LOG_TYPE";
	public static final String LOGIN_TYPE_USER = "U";
	public static final String LOGIN_TYPE_HOST = "H";
	public static final String LOGIN_TYPE_ADMIN = "A";
	
	
	//SQL에서 쓸때는  extends해서 메소드 쓸수있게끔 만들고 membervo.getyes()
	// #n# => 자동으로 getn 찾게됨
	
}
