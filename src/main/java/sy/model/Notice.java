package sy.model;

public class Notice {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notice.id
     *
     * @mbggenerated Wed Mar 30 09:24:21 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notice.title
     *
     * @mbggenerated Wed Mar 30 09:24:21 CST 2016
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notice.savetime
     *
     * @mbggenerated Wed Mar 30 09:24:21 CST 2016
     */
    private String savetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notice.type
     *
     * @mbggenerated Wed Mar 30 09:24:21 CST 2016
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notice.content
     *
     * @mbggenerated Wed Mar 30 09:24:21 CST 2016
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notice.id
     *
     * @return the value of notice.id
     *
     * @mbggenerated Wed Mar 30 09:24:21 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notice.id
     *
     * @param id the value for notice.id
     *
     * @mbggenerated Wed Mar 30 09:24:21 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notice.title
     *
     * @return the value of notice.title
     *
     * @mbggenerated Wed Mar 30 09:24:21 CST 2016
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notice.title
     *
     * @param title the value for notice.title
     *
     * @mbggenerated Wed Mar 30 09:24:21 CST 2016
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notice.savetime
     *
     * @return the value of notice.savetime
     *
     * @mbggenerated Wed Mar 30 09:24:21 CST 2016
     */
    public String getSavetime() {
        return savetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notice.savetime
     *
     * @param savetime the value for notice.savetime
     *
     * @mbggenerated Wed Mar 30 09:24:21 CST 2016
     */
    public void setSavetime(String savetime) {
        this.savetime = savetime == null ? null : savetime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notice.type
     *
     * @return the value of notice.type
     *
     * @mbggenerated Wed Mar 30 09:24:21 CST 2016
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notice.type
     *
     * @param type the value for notice.type
     *
     * @mbggenerated Wed Mar 30 09:24:21 CST 2016
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notice.content
     *
     * @return the value of notice.content
     *
     * @mbggenerated Wed Mar 30 09:24:21 CST 2016
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notice.content
     *
     * @param content the value for notice.content
     *
     * @mbggenerated Wed Mar 30 09:24:21 CST 2016
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}