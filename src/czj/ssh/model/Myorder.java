package czj.ssh.model;

import java.util.Date;
import java.util.ArrayList;

import java.util.List;

public class Myorder implements java.io.Serializable{
	private int orderId;//����id
//	������ַ
	private String oaddress;
	
	public String getOaddress() {
		return oaddress;
	}
	public void setOaddress(String oaddress) {
		this.oaddress = oaddress;
	}
//	ͼ��idlist������list������list���۸�list
	private List bookpicture=new ArrayList<>();
	private List bookname=new ArrayList<>();
	private List booknum=new ArrayList<>();
	private List bookprice=new ArrayList<>();
	public List getOrderdetailid() {
		return orderdetailid;
	}
	public void setOrderdetailid(List orderdetailid) {
		this.orderdetailid = orderdetailid;
	}
//	���������idlist
	private List orderdetailid=new ArrayList<>();
//	����״̬
	private String orderstate;
//	�µ�ʱ��
	private Date time;
//	�����ܼ۸�
	private float Totalprice;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public List getBookpicture() {
		return bookpicture;
	}
	public void setBookpicture(List bookpicture) {
		this.bookpicture = bookpicture;
	}
	public List getBookname() {
		return bookname;
	}
	public void setBookname(List bookname) {
		this.bookname = bookname;
	}
	public List getBooknum() {
		return booknum;
	}
	public void setBooknum(List booknum) {
		this.booknum = booknum;
	}
	public List getBookprice() {
		return bookprice;
	}
	public void setBookprice(List bookprice) {
		this.bookprice = bookprice;
	}
	public float getTotalprice() {
		return Totalprice;
	}
	public void setTotalprice(float totalprice) {
		Totalprice = totalprice;
	}
	public String getOrderstate() {
		return orderstate;
	}
	public void setOrderstate(String orderstate) {
		this.orderstate = orderstate;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}	
}