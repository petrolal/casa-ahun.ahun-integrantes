package com.petrolal.ahun.integrantes.model;

import java.util.Objects;

public class CustomMessageErrorDto {
	private boolean success;
	private int code;
	private long timestamp;
	private String message;

	public CustomMessageErrorDto(boolean success, int code, long timestamp, String message) {
		super();
		this.success = success;
		this.code = code;
		this.timestamp = timestamp;
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public int hashCode() {
		return Objects.hash(code, message, success, timestamp);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomMessageErrorDto other = (CustomMessageErrorDto) obj;
		return code == other.code && Objects.equals(message, other.message) && success == other.success
				&& timestamp == other.timestamp;
	}

	@Override
	public String toString() {
		return "CustomMessageErrorDto [success=" + success + ", code=" + code + ", timestamp=" + timestamp
				+ ", message=" + message + "]";
	}

}
