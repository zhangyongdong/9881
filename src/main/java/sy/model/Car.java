package sy.model;

public class Car {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column car.id
     *
     * @mbggenerated Wed Mar 30 09:24:21 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column car.productid
     *
     * @mbggenerated Wed Mar 30 09:24:21 CST 2016
     */
    private String productid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column car.num
     *
     * @mbggenerated Wed Mar 30 09:24:21 CST 2016
     */
    private String num;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column car.memberid
     *
     * @mbggenerated Wed Mar 30 09:24:21 CST 2016
     */
    private String memberid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car.id
     *
     * @return the value of car.id
     *
     * @mbggenerated Wed Mar 30 09:24:21 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car.id
     *
     * @param id the value for car.id
     *
     * @mbggenerated Wed Mar 30 09:24:21 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car.productid
     *
     * @return the value of car.productid
     *
     * @mbggenerated Wed Mar 30 09:24:21 CST 2016
     */
    public String getProductid() {
        return productid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car.productid
     *
     * @param productid the value for car.productid
     *
     * @mbggenerated Wed Mar 30 09:24:21 CST 2016
     */
    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car.num
     *
     * @return the value of car.num
     *
     * @mbggenerated Wed Mar 30 09:24:21 CST 2016
     */
    public String getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car.num
     *
     * @param num the value for car.num
     *
     * @mbggenerated Wed Mar 30 09:24:21 CST 2016
     */
    public void setNum(String num) {
        this.num = num == null ? null : num.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car.memberid
     *
     * @return the value of car.memberid
     *
     * @mbggenerated Wed Mar 30 09:24:21 CST 2016
     */
    public String getMemberid() {
        return memberid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car.memberid
     *
     * @param memberid the value for car.memberid
     *
     * @mbggenerated Wed Mar 30 09:24:21 CST 2016
     */
    public void setMemberid(String memberid) {
        this.memberid = memberid == null ? null : memberid.trim();
    }
}