package ssm.pojo;

/**
 * @ClassName Department
 * @author 肥宅快乐码
 * @date 2019/2/23
 */
public class Department {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_DEPT.DEPT_ID
     *
     * @mbg.generated Thu Feb 21 22:16:53 CST 2019
     */
    private Integer deptId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_DEPT.DEPT_NAME
     *
     * @mbg.generated Thu Feb 21 22:16:53 CST 2019
     */
    private String deptName;

    public Department() {
    }

    public Department(Integer deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_DEPT.DEPT_ID
     *
     * @return the value of TBL_DEPT.DEPT_ID
     *
     * @mbg.generated Thu Feb 21 22:16:53 CST 2019
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_DEPT.DEPT_ID
     *
     * @param deptId the value for TBL_DEPT.DEPT_ID
     *
     * @mbg.generated Thu Feb 21 22:16:53 CST 2019
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_DEPT.DEPT_NAME
     *
     * @return the value of TBL_DEPT.DEPT_NAME
     *
     * @mbg.generated Thu Feb 21 22:16:53 CST 2019
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_DEPT.DEPT_NAME
     *
     * @param deptName the value for TBL_DEPT.DEPT_NAME
     *
     * @mbg.generated Thu Feb 21 22:16:53 CST 2019
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }
}