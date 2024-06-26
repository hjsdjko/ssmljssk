package com.entity.view;

import com.entity.ChuruguidingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 出入规定
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-11 18:17:26
 */
@TableName("churuguiding")
public class ChuruguidingView  extends ChuruguidingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChuruguidingView(){
	}
 
 	public ChuruguidingView(ChuruguidingEntity churuguidingEntity){
 	try {
			BeanUtils.copyProperties(this, churuguidingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
