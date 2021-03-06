package com.price.finance_recorder_rest.entrypoints;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class OptionPutCallRatioGetRsp 
{
	private Date tradeDate; // 日期
	private long putTradeVolume; // 賣權成交量
	private long callTradeVolume; // 買權成交量
	private float putCallRatio; // 買賣權成交量比率
	private long putOITradeVolume; // 賣權未平倉量
	private long callOITradeVolume; // 買權未平倉量
	private float putCallOIRatio; // 買賣權未平倉量比率

	public Date getTradeDate() {
		return tradeDate;
	}
	public void setTradeDate(Date tradeDate) {
		this.tradeDate = tradeDate;
	}
	public long getPutTradeVolume() {
		return putTradeVolume;
	}
	public void setPutTradeVolume(long putTradeVolume) {
		this.putTradeVolume = putTradeVolume;
	}
	public long getCallTradeVolume() {
		return callTradeVolume;
	}
	public void setCallTradeVolume(long callTradeVolume) {
		this.callTradeVolume = callTradeVolume;
	}
	public float getPutCallRatio() {
		return putCallRatio;
	}
	public void setPutCallRatio(float putCallRatio) {
		this.putCallRatio = putCallRatio;
	}
	public long getPutOITradeVolume() {
		return putOITradeVolume;
	}
	public void setPutOITradeVolume(long putOITradeVolume) {
		this.putOITradeVolume = putOITradeVolume;
	}
	public long getCallOITradeVolume() {
		return callOITradeVolume;
	}
	public void setCallOITradeVolume(long callOITradeVolume) {
		this.callOITradeVolume = callOITradeVolume;
	}
	public float getPutCallOIRatio() {
		return putCallOIRatio;
	}
	public void setPutCallOIRatio(float putCallOIRatio) {
		this.putCallOIRatio = putCallOIRatio;
	}
}
