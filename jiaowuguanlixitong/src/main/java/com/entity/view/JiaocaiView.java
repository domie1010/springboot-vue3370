package com.entity.view;

import com.entity.JiaocaiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 教材
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("jiaocai")
public class JiaocaiView extends JiaocaiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 教材类型的值
		*/
		private String jiaocaiValue;



		//级联表 kecheng
			/**
			* 课程 的 老师
			*/
			private Integer kechengLaoshiId;
			/**
			* 课程编号
			*/
			private String kechengUuidNumber;
			/**
			* 课程名称
			*/
			private String kechengName;
			/**
			* 课程类型
			*/
			private Integer kechengTypes;
				/**
				* 课程类型的值
				*/
				private String kechengValue;
			/**
			* 最大报名人数
			*/
			private Integer kechengRenshu;
			/**
			* 开课时间
			*/
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			private Date kaikeTime;
			/**
			* 课程学分
			*/
			private Integer kechengXuefen;
			/**
			* 课程详情
			*/
			private String kechengContent;

	public JiaocaiView() {

	}

	public JiaocaiView(JiaocaiEntity jiaocaiEntity) {
		try {
			BeanUtils.copyProperties(this, jiaocaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 教材类型的值
			*/
			public String getJiaocaiValue() {
				return jiaocaiValue;
			}
			/**
			* 设置： 教材类型的值
			*/
			public void setJiaocaiValue(String jiaocaiValue) {
				this.jiaocaiValue = jiaocaiValue;
			}














				//级联表的get和set kecheng

					/**
					* 获取：课程 的 老师
					*/
					public Integer getKechengLaoshiId() {
						return kechengLaoshiId;
					}
					/**
					* 设置：课程 的 老师
					*/
					public void setKechengLaoshiId(Integer kechengLaoshiId) {
						this.kechengLaoshiId = kechengLaoshiId;
					}


					/**
					* 获取： 课程编号
					*/
					public String getKechengUuidNumber() {
						return kechengUuidNumber;
					}
					/**
					* 设置： 课程编号
					*/
					public void setKechengUuidNumber(String kechengUuidNumber) {
						this.kechengUuidNumber = kechengUuidNumber;
					}

					/**
					* 获取： 课程名称
					*/
					public String getKechengName() {
						return kechengName;
					}
					/**
					* 设置： 课程名称
					*/
					public void setKechengName(String kechengName) {
						this.kechengName = kechengName;
					}

					/**
					* 获取： 课程类型
					*/
					public Integer getKechengTypes() {
						return kechengTypes;
					}
					/**
					* 设置： 课程类型
					*/
					public void setKechengTypes(Integer kechengTypes) {
						this.kechengTypes = kechengTypes;
					}


						/**
						* 获取： 课程类型的值
						*/
						public String getKechengValue() {
							return kechengValue;
						}
						/**
						* 设置： 课程类型的值
						*/
						public void setKechengValue(String kechengValue) {
							this.kechengValue = kechengValue;
						}

					/**
					* 获取： 最大报名人数
					*/
					public Integer getKechengRenshu() {
						return kechengRenshu;
					}
					/**
					* 设置： 最大报名人数
					*/
					public void setKechengRenshu(Integer kechengRenshu) {
						this.kechengRenshu = kechengRenshu;
					}

					/**
					* 获取： 开课时间
					*/
					public Date getKaikeTime() {
						return kaikeTime;
					}
					/**
					* 设置： 开课时间
					*/
					public void setKaikeTime(Date kaikeTime) {
						this.kaikeTime = kaikeTime;
					}

					/**
					* 获取： 课程学分
					*/
					public Integer getKechengXuefen() {
						return kechengXuefen;
					}
					/**
					* 设置： 课程学分
					*/
					public void setKechengXuefen(Integer kechengXuefen) {
						this.kechengXuefen = kechengXuefen;
					}

					/**
					* 获取： 课程详情
					*/
					public String getKechengContent() {
						return kechengContent;
					}
					/**
					* 设置： 课程详情
					*/
					public void setKechengContent(String kechengContent) {
						this.kechengContent = kechengContent;
					}








}
