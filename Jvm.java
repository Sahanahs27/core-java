class Jvm{
	private String purpose;
	private String version;
	private String platform;
	private String heapSize;
	private String vendor;
	
	public Jvm(){
		
	}
	public void setPurpose(String purpose){
		this.purpose=purpose;
	}
	public void setVersion(String version){
		this.version=version;
	}
	public void setPlatform(String platform){
		this.platform=platform;
	}
	public String getPurpose(){
		return purpose;
	}
	public String getVersion(){
		return version;
	}
	public String getPlatform(){
		return platform;
	}
	public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getVendor() {
        return vendor;
    }
	 public void setHeapSize(String heapSize) {
        this.heapSize = heapSize;
    }

    public String getHeapSize() {
        return heapSize;
    }
}
