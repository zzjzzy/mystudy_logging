package com.itcast.logging;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Demo01 {
	private static Logger logger = Logger.getLogger(Demo01.class);  
    public static void main(String[] args) { 
    	//采用默认的基本配置
//    	BasicConfigurator.configure();
    	//采用读取properties文件的方式。
//    	PropertyConfigurator.configure("log4j.properties");
        // 记录debug级别的信息 
        logger.debug("This is debug message.");  
        // 记录info级别的信息  
        logger.info("This is info message.");  
        // 记录error级别的信息  
        logger.error("This is error message.");  
    }  
}
