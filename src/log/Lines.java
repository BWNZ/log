package log;

import java.util.Date;

public class Lines  {

	private String HostIp="";
	private String HostName="";
	private Date date;
	private String req;
	private int http;
	private int reply;
	
	public void lineToString(){
		System.out.println("----------------------------");
		System.out.println("Host: "  + getHostName() + getHostIp());
		System.out.println("Time: " + getDate());
		System.out.println("Request: " + getReq());
		System.out.println("Http reply code: " + getHttp());
		System.out.println("Bytes in reply: " + getReply());
			}		
	
	public String getHostIp() {
		return HostIp;
	}
	public void setHostIp(String hostIp) {
		HostIp = hostIp;
	}
	public String getHostName() {
		return HostName;
	}
	public void setHostName(String hostName) {
		HostName = hostName;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getReq() {
		return req;
	}
	public void setReq(String req) {
		this.req = req;
	}
	public int getHttp() {
		return http;
	}
	public void setHttp(int http) {
		this.http = http;
	}
	public int getReply() {
		return reply;
	}
	public void setReply(int replay) {
		this.reply = replay;
	}
	
	
	
}
