package com.fanshe;

import org.junit.Test;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class TestSpringObjList {

	@Test
	public void test() {
		String arr="\"/software/servers/druid/mart_mobile/spark/bin/spark-submit\", \"--driver-memory\", \"20G\", \"--num-executors\", 32, \"--executor-cores\", 8, \"--executor-memory\", \"10G\", \"--queue\", \"bdp_jmart_mobile_union.bdp_jmart_mobile_core\", \"--class\", \"com.jd.moonshot.ml.evaluation.SparkModelPredictionBrick\", \"/data0/bdp_client/online_08/bdp_agent_data/algor.bdp.jd.com/lab_7460_90810/SparkPredictionModelBrick/brick-spark-1.0-SNAPSHOT-jar-with-dependencies.jar\", \"--input_type\", \"data\", \"--input_path\", \"hdfs://ns7/user/mart_mobile/mart_mobile/.moonshot/7455_10752_559_1510744143027\", \"--input_format\", \"libsvm\", \"--model_type\", \"model\", \"--model_path\", \"hdfs://ns7/user/mart_mobile/mart_mobile/product/7131_10316_1374_1510044563022\", \"--model_format\", \"sparkmodel\", \"--output_type\", \"data\", \"--output_path\", \"hdfs://ns7/user/mart_mobile/mart_mobile/.moonshot/7460_10752_1572_1510744323026\", \"--output_format\", \"avro\", \"--containLabel\", \"false\", \"--id\", \"Spark\\xe6\\xa8\\xa1\\xe5\\x9e\\x8b\\xe9\\xa2\\x84\\xe6\\xb5\\x8b\", \"--featureCols\", \"feature\", \"--labelCols\", \"label\", \"--name\", \"Spark\\xe6\\xa8\\xa1\\xe5\\x9e\\x8b\\xe9\\xa2\\x84\\xe6\\xb5\\x8b\"";
		Object[] obj = new Object[2];
		ExpressionParser parser = new SpelExpressionParser();
		Expression exp = parser.parseExpression("new Object[]{"+arr+"}");
		// obj[0] = "aaaa";
		// obj[1] = new Integer(11);
		obj = exp.getValue(Object[].class);
		System.out.println(obj.length);
	}

}
