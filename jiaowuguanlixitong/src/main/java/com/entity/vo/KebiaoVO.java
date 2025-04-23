package com.entity.vo;

import com.entity.KebiaoEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 课表
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("kebiao")
public class KebiaoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 课程
     */

    @TableField(value = "kecheng_id")
    private Integer kechengId;


    /**
     * 星期
     */

    @TableField(value = "xingqi_types")
    private Integer xingqiTypes;


    /**
     * 第几节
     */

    @TableField(value = "jie_types")
    private Integer jieTypes;


    /**
     * 上课时间
     */

    @TableField(value = "kebiao_shijian")
    private String kebiaoShijian;


    /**
     * 课表备注
     */

    @TableField(value = "kebiao_content")
    private String kebiaoContent;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：星期
	 */
    public Integer getXingqiTypes() {
        return xingqiTypes;
    }


    /**
	 * 获取：星期
	 */

    public void setXingqiTypes(Integer xingqiTypes) {
        this.xingqiTypes = xingqiTypes;
    }
    /**
	 * 设置：第几节
	 */
    public Integer getJieTypes() {
        return jieTypes;
    }


    /**
	 * 获取：第几节
	 */

    public void setJieTypes(Integer jieTypes) {
        this.jieTypes = jieTypes;
    }
    /**
	 * 设置：上课时间
	 */
    public String getKebiaoShijian() {
        return kebiaoShijian;
    }


    /**
	 * 获取：上课时间
	 */

    public void setKebiaoShijian(String kebiaoShijian) {
        this.kebiaoShijian = kebiaoShijian;
    }
    /**
	 * 设置：课表备注
	 */
    public String getKebiaoContent() {
        return kebiaoContent;
    }


    /**
	 * 获取：课表备注
	 */

    public void setKebiaoContent(String kebiaoContent) {
        this.kebiaoContent = kebiaoContent;
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

}
