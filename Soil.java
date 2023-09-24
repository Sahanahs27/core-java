class Soil {
    private String soilName;
    private String moistur;
    private String minerals;
	private double phLevel;
    private String texture;

    public Soil() {

    }

    public void setSoilName(String soilName) {
        this.soilName = soilName;
    }

    public void setMoistur(String moisturizer) {
        this.moistur = moisturizer;
    }

    public void setMinerals(String minerals) {
        this.minerals = minerals;
    }

    public String getSoilName() {
        return soilName;
    }

    public String getMoistur() {
        return moistur;
    }

    public String getMinerals() {
        return minerals;
    }
	
	public void setPhLevel(double phLevel) {
        this.phLevel = phLevel;
    }

    public double getPhLevel() {
        return phLevel;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public String getTexture() {
        return texture;
    }

}
