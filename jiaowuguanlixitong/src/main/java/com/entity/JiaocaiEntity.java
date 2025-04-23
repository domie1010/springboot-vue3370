package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 教材
 *
 * @author 
 * @email
 */
@TableName("jiaocai")
public class JiaocaiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiaocaiEntity() {

	}

	public JiaocaiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 课程
     */
    @TableField(value = "kecheng_id")

    private Integer kechengId;


    /**
     * 教材编号
     */
    @TableField(value = "jiaocai_uuid_number")

    private String jiaocaiUuidNumber;


    /**
     * 教材名称
     */
    @TableField(value = "jiaocai_name")

    private String jiaocaiName;


    /**
     * 教材类型
     */
    @TableField(value = "jiaocai_types")

    private Integer jiaocaiTypes;


    /**
     * 教材数量
     */
    @TableField(value = "jiaocai_shuliang")

    private Integer jiaocaiShuliang;


    /**
     * 教材详情
     */
    @TableField(value = "jiaocai_content")

    private String jiaocaiContent;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：课程
	 */
    public Integer getKechengId() {
        return kechengId;
    }
    /**
	 * 获取：课程
	 */

    public void setKechengId(Integer kechengId) {
        this.kechengId = kechengId;
    }
    /**
	 * 设置：教材编号
	 */
    public String getJiaocaiUuidNumber() {
        return jiaocaiUuidNumber;
    }
    /**
	 * 获取：教材编号
	 */

    public void setJiaocaiUuidNumber(String jiaocaiUuidNumber) {
        this.jiaocaiUuidNumber = jiaocaiUuidNumber;
    }
    /**
	 * 设置：教材名称
	 */
    public String getJiaocaiName() {
        return jiaocaiName;
    }
    /**
	 * 获取：教材名称
	 */

    public void setJiaocaiName(String jiaocaiName) {
        this.jiaocaiName = jiaocaiName;
    }
    /**
	 * 设置：教材类型
	 */
    public Integer getJiaocaiTypes() {
        return jiaocaiTypes;
    }
    /**
	 * 获取：教材类型
	 */

    public void setJiaocaiTypes(Integer jiaocaiTypes) {
        this.jiaocaiTypes = jiaocaiTypes;
    }
    /**
	 * 设置：教材数量
	 */
    public Integer getJiaocaiShuliang() {
        return jiaocaiShuliang;
    }
    /**
	 * 获取：教材数量
	 */

    public void setJiaocaiShuliang(Integer jiaocaiShuliang) {
        this.jiaocaiShuliang = jiaocaiShuliang;
    }
    /**
	 * 设置：教材详情
	 */
    public String getJiaocaiContent() {
        return jiaocaiContent;
    }
    /**
	 * 获取：教材详情
	 */

    public void setJiaocaiContent(String jiaocaiContent) {
        this.jiaocaiContent = jiaocaiContent;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Jiaocai{" +
            "id=" + id +
            ", kechengId=" + kechengId +
            ", jiaocaiUuidNumber=" + jiaocaiUuidNumber +
            ", jiaocaiName=" + jiaocaiName +
            ", jiaocaiTypes=" + jiaocaiTypes +
            ", jiaocaiShuliang=" + jiaocaiShuliang +
            ", jiaocaiContent=" + jiaocaiContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
