package uzziel.cervantes.demo.model.dto;

public class Response {
	
	private int status;
	private String message;
	private Object data;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	public static class Builder{
		private int status;
		private Object data;
		private String message;
		
		public Builder(int status, Object data, String message) {
			super();
			this.status = status;
			this.data = data;
			this.message = message;
		}

		public final Response build() {
			Response response = new Response();
			response.setMessage(message);
			response.setStatus(status);
			response.setData(data);
			
			return response;
		}
	}
	
	public static final Builder ok(Object data, String message) {
		return new Builder(200, data, message);
	}
	
	public static final Builder error(int status, String message) {
		return new Builder(status, null, message);
	}
}
