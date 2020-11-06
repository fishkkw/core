package core.entity;

import java.util.Date;

public class AccountMap {
    /**
     * 银行流水
     */
    private String id;

    /**
     * 流程ID
     */
    private Integer flowid;

    /**
     * 企业ID
     */
    private Long companyid;

    /**
     * 余额
     */
    private Long amount;

    /**
     * 状态,默认1支出，2收入
     */
    private Byte status;

    /**
     * 系统-创建时间
     */
    private Date sysCtime;

    /**
     * 系统-修改时间
     */
    private Date sysUtime;

    /**
     * 系统-有效状态
     */
    private Byte sysValid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getFlowid() {
        return flowid;
    }

    public void setFlowid(Integer flowid) {
        this.flowid = flowid;
    }

    public Long getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Long companyid) {
        this.companyid = companyid;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getSysCtime() {
        return sysCtime;
    }

    public void setSysCtime(Date sysCtime) {
        this.sysCtime = sysCtime;
    }

    public Date getSysUtime() {
        return sysUtime;
    }

    public void setSysUtime(Date sysUtime) {
        this.sysUtime = sysUtime;
    }

    public Byte getSysValid() {
        return sysValid;
    }

    public void setSysValid(Byte sysValid) {
        this.sysValid = sysValid;
    }
}