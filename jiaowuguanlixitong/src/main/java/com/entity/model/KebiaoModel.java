package com.entity.model;

import com.entity.KebiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 课表
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class KebiaoModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 课程
     */
    private Integer kechengId;


    /**
     * 星期
     */
    private Integer xingqiTypes;


    /**
     * 第几节
     */
    private Integer jieTypes;


    /**
     * 上课时间
     */
    private String kebiaoShijian;


    /**
     * 课表备注
     */
    private String kebiaoContent;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：课程
	 */
    public Integer getKechengId() {
        return kechengId;
    }


    /**
	 * 设置：课程
	 */
    public void setKechengId(Integer kechengId) {
        this.kechengId = kechengId;
    }
    /**
	 * 获取：星期
	 */
    public Integer getXingqiTypes() {
        return xingqiTypes;
    }


    /**
	 * 设置：星期
	 */
    public void setXingqiTypes(Integer xingqiTypes) {
        this.xingqiTypes = xingqiTypes;
    }
    /**
	 * 获取：第几节
	 */
    public Integer getJieTypes() {
        return jieTypes;
    }


    /**
	 * 设置：第几节
	 */
    public void setJieTypes(Integer jieTypes) {
        this.jieTypes = jieTypes;
    }
    /**
	 * 获取：上课时间
	 */
    public String getKebiaoShijian() {
        return kebiaoShijian;
    }


    /**
	 * 设置：上课时间
	 */
    public void setKebiaoShijian(String kebiaoShijian) {
        this.kebiaoShijian = kebiaoShijian;
    }
    /**
	 * 获取：课表备注
	 */
    public String getKebiaoContent() {
        return kebiaoContent;
    }


    /**
	 * 设置：课表备注
	 */
    public void setKebiaoContent(String kebiaoContent) {
        this.kebiaoContent = kebiaoContent;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：录入时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
