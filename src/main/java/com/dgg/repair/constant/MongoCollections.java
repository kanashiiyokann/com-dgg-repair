package com.dgg.repair.constant;

import com.dgg.repair.entity.VoucherAux;
import com.dgg.repair.entity.VoucherDetail;

public enum MongoCollections {
    voucher_aux("凭证辅助核算",DbType.ELASTIC_SEARCH, VoucherAux.class,Prefix.INDEX_VOUCHER_AUX,Prefix.TYPE_VOUCHER_AUX),
    voucher_detail("凭证明细",DbType.ELASTIC_SEARCH, VoucherDetail.class,Prefix.INDEX_VOUCHER_DETAIL,Prefix.TYPE_VOUCHER_DETAIL),
    assets("资产"),
    subject("科目"),
    bill_info_template("票据模板"),
    bill("票据");
    private String text;
    private int dbType=DbType.MONGO_DB;
    private Class clazz;
    private String prefix;
    private String type;

    MongoCollections(String text){
        this.text=text;
    }
    MongoCollections(String text,int dbType,Class clazz,String indexPrefix,String type){
        this.text=text;
        this.dbType=dbType;
        this.clazz=clazz;
        this.prefix=indexPrefix;
        this.type=type;
    }

    public int getDbType() {
        return dbType;
    }
    public Class getClazz(){
        return this.clazz;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getType() {
        return type;
    }
}
