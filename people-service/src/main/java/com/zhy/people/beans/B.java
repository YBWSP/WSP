package com.zhy.people.beans;

public class B {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b.val
     *
     * @mbg.generated
     */
    private Integer val;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b.id
     *
     * @return the value of b.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b.id
     *
     * @param id the value for b.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b.title
     *
     * @return the value of b.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b.title
     *
     * @param title the value for b.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b.val
     *
     * @return the value of b.val
     *
     * @mbg.generated
     */
    public Integer getVal() {
        return val;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b.val
     *
     * @param val the value for b.val
     *
     * @mbg.generated
     */
    public void setVal(Integer val) {
        this.val = val;
    }
}