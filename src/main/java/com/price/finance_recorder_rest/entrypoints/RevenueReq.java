package com.price.finance_recorder_rest.entrypoints;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RevenueReq 
{
	String datasetFolderpath;

	public String getDatasetFolderpath()
	{
		return datasetFolderpath;
	}

	public void setDatasetFolderpath(String datasetFolderpath)
	{
		this.datasetFolderpath = datasetFolderpath;
	}
}