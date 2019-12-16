package core.util;

public class Msg {
	private Integer code;
	private String msg;
	private Object data;

	public static Msg success() {
		Msg result = new Msg();
		result.setCode(100);
		result.setMsg("处理成功");
		return result;
	}

	public static Msg success(Object data) {
		Msg result = new Msg();
		result.setCode(100);
		result.setMsg("处理成功");
		result.setData(data);
		return result;
	}
	
	public static Msg fail() {
		Msg result = new Msg();
		result.setCode(0);
		result.setMsg("请求失败");
		return result;
	}
	
	public static Msg fail(String errorMsg) {
		Msg result = new Msg();
		result.setCode(0);
		result.setMsg("请求失败");
		return result;
	}

	public static Msg fail(Object data) {
		Msg result = new Msg();
		result.setCode(0);
		result.setMsg("请求失败");
		result.setData(data);
		return result;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
