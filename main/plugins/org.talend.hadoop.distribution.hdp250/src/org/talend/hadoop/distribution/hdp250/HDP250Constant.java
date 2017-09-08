// ============================================================================
//
// Copyright (C) 2006-2017 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.hadoop.distribution.hdp250;

public enum HDP250Constant {
    HDFS_MODULE_GROUP("HDFS-LIB-HDP_2_5"), //$NON-NLS-1$
    MAPREDUCE_MODULE_GROUP("MAPREDUCE-LIB-HDP_2_5"), //$NON-NLS-1$
    PIG_MODULE_GROUP("PIG-LIB-HDP_2_5"), //$NON-NLS-1$
    HBASE_MODULE_GROUP("HBASE-LIB-HDP_2_5"), //$NON-NLS-1$
    HIVE_MODULE_GROUP("HIVE-LIB-HDP_2_5"), //$NON-NLS-1$
    SQOOP_MODULE_GROUP("SQOOP-LIB-HDP_2_5"), //$NON-NLS-1$
    SPARK_MODULE_GROUP("SPARK-LIB-HDP_2_5"), //$NON-NLS-1$

    SPARK_AZURE_MRREQUIRED_MODULE_GROUP("SPARK-AZURE-LIB-MRREQUIRED-HDP_2_5"), //$NON-NLS-1$
    HIVE_HBASE_MODULE_GROUP("HIVE-HBASE-LIB-HDP_2_5"), //$NON-NLS-1$
    MAPREDUCE_PARQUET_MODULE_GROUP("MAPREDUCE-PARQUET-LIB-HDP_2_5"), //$NON-NLS-1$
    MAPREDUCE_PARQUET_MRREQUIRED_MODULE_GROUP("MAPREDUCE-PARQUET-LIB-MRREQUIRED-HDP_2_5"), //$NON-NLS-1$
    PIG_AVRO_MODULE_GROUP("PIG-AVRO-LIB-HDP_2_5"), //$NON-NLS-1$
    PIG_HBASE_MODULE_GROUP("PIG-HBASE-LIB-HDP_2_5"), //$NON-NLS-1$
    PIG_HCATALOG_MODULE_GROUP("PIG-HCATALOG-LIB-HDP_2_5"), //$NON-NLS-1$
    PIG_PARQUET_MODULE_GROUP("PIG-PARQUET-LIB-HDP_2_5"), //$NON-NLS-1$
    PIG_RCFILE_MODULE_GROUP("PIG-RCFILE-LIB-HDP_2_5"), //$NON-NLS-1$
    PIG_SEQUENCEFILE_MODULE_GROUP("PIG-SEQUENCEFILE-LIB-HDP_2_5"), //$NON-NLS-1$
    SPARK_MRREQUIRED_MODULE_GROUP("SPARK-LIB-MRREQUIRED-HDP_2_5"), //$NON-NLS-1$
    SPARK_PARQUET_MRREQUIRED_MODULE_GROUP("SPARK-PARQUET-LIB-MRREQUIRED-HDP_2_5"), //$NON-NLS-1$
    SPARK_KINESIS_MRREQUIRED_MODULE_GROUP("SPARK-KINESIS-LIB-MRREQUIRED-HDP_2_5"), //$NON-NLS-1$
    SPARK_KAFKA_ASSEMBLY_MRREQUIRED_MODULE_GROUP("SPARK-KAFKA-ASSEMBLY-LIB-MRREQUIRED-HDP_2_5"), //$NON-NLS-1$
    SPARK_KAFKA_AVRO_MRREQUIRED_MODULE_GROUP("SPARK-KAFKA-AVRO-LIB-MRREQUIRED-HDP_2_5"), //$NON-NLS-1$
    SPARK_KAFKA_CLIENT_MRREQUIRED_MODULE_GROUP("SPARK-KAFKA-CLIENT-LIB-MRREQUIRED-HDP_2_5"), //$NON-NLS-1$
    SPARK_S3_MRREQUIRED_MODULE_GROUP("SPARK-S3-LIB-MRREQUIRED-HDP_2_5"), //$NON-NLS-1$
    PIG_S3_MODULE_GROUP("PIG-S3-LIB-HDP_2_5"), //$NON-NLS-1$
    GRAPHFRAMES_MRREQUIRED_MODULE_GROUP("SPARK-GRAPHFRAMES-LIB-MRREQUIRED-HDP_2_5"), //$NON-NLS-1$
    SPARK_HIVE_MRREQUIRED_MODULE_GROUP("SPARK-HIVE-LIB-MRREQUIRED-HDP_2_5"), //$NON-NLS-1$
    TEZ_MODULE_GROUP("TEZ-LIB-HDP_2_5"), //$NON-NLS-1$
    TEZ_SERVER_MODULE_GROUP("TEZ-SERVER-LIB-HDP_2_5"), //$NON-NLS-1$
    SPARK_FLUME_MRREQUIRED_MODULE_GROUP("SPARK-FLUME-LIB-MRREQUIRED-HDP_2_5"), //$NON-NLS-1$
    ATLAS_HDP_2_5("ATLAS_HDP_2_5"), //$NON-NLS-1$
    SQOOP_PARQUET_MODULE_GROUP("SQOOP-PARQUET-LIB-HDP_2_5"); //$NON-NLS-1$

    private String mModuleName;

    HDP250Constant(String moduleName) {
        this.mModuleName = moduleName;
    }

    public String getModuleName() {
        return this.mModuleName;
    }
}
