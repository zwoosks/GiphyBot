package giphy.entity.giphy;

import com.google.gson.annotations.SerializedName;

public class GiphyImage {

	@SerializedName("url")
    private String url;

    @SerializedName("width")
    private String width;

    @SerializedName("height")
    private String height;

    @SerializedName("size")
    private String size;

    @SerializedName("mp4")
    private String mp4;

    @SerializedName("mp4_size")
    private String mp4Size;

    @SerializedName("webp")
    private String webp;

    @SerializedName("webp_size")
    private String webpSize;

    /**
     * Returns the URL.
     * 
     * @return the URL
     */
    public String getUrl() {
	return url;
    }

    /**
     * Sets the URL.
     * 
     * @param url
     *            the URL
     */
    public void setUrl(String url) {
	this.url = url;
    }

    /**
     * Returns the width.
     * 
     * @return the width of the image
     */
    public String getWidth() {
	return width;
    }

    /**
     * Sets the width.
     * 
     * @param width
     *            the width
     */
    public void setWidth(String width) {
	this.width = width;
    }

    /**
     * Returns the height.
     * 
     * @return the height of the image
     */
    public String getHeight() {
	return height;
    }

    /**
     * Sets the height.
     * 
     * @param height
     *            the height
     */
    public void setHeight(String height) {
	this.height = height;
    }

    /**
     * Returns the size.
     * 
     * @return the size
     */
    public String getSize() {
	return size;
    }

    /**
     * Sets the size.
     * 
     * @param size
     *            the size
     */
    public void setSize(String size) {
	this.size = size;
    }

    /**
     * Returns the mp4 URL.
     * 
     * @return the mp4 URL
     */
    public String getMp4() {
	return mp4;
    }

    /**
     * Sets the mp4 URL.
     * 
     * @param mp4
     *            the mp4 URL
     */
    public void setMp4(String mp4) {
	this.mp4 = mp4;
    }

    /**
     * Returns the mp4 size.
     * 
     * @return the mp4 size
     */
    public String getMp4Size() {
	return mp4Size;
    }

    /**
     * Sets the mp4 size.
     * 
     * @param mp4Size
     *            the mp4 size
     */
    public void setMp4Size(String mp4Size) {
	this.mp4Size = mp4Size;
    }

    public String getWebp() {
	return webp;
    }

    /**
     * Sets the webp URL.
     * 
     * @param webp
     *            the webp URL
     */
    public void setWebp(String webp) {
	this.webp = webp;
    }

    public String getWebpSize() {
	return webpSize;
    }

    /**
     * Sets the webp size.
     * 
     * @param webpSize
     *            the webp size
     */
    public void setWebpSize(String webpSize) {
	this.webpSize = webpSize;
    }

    @Override
    public String toString() {
	String outputString = "";
	outputString += "\n      url = " + url;
	outputString += "\n      width = " + width;
	outputString += "\n      height = " + height;
	outputString += "\n      size = " + size;
	outputString += "\n      mp4 = " + mp4;
	outputString += "\n      mp4Size = " + mp4Size;
	outputString += "\n      webp = " + webp;
	outputString += "\n      webpSize = " + webpSize;
	return outputString;
    }
	
}