package com.dgg.repair.service;

import com.alibaba.fastjson.JSON;
import com.dgg.repair.constant.DbType;
import com.dgg.repair.constant.MongoCollections;
import com.dgg.repair.util.HttpUtil;
import org.elasticsearch.action.bulk.BulkRequestBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.DeleteQuery;
import org.springframework.data.mongodb.core.BulkOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RepairService {
    @Value("${service.host}")
    private String serviceHost;
    @Autowired
    private MongoTemplate mongoTemplate;
    @Autowired
    private ElasticsearchTemplate esTemplate;


    private List<Map> getMapList(String companyId, MongoCollections collection) {

        String json = HttpUtil.sendPost(serviceHost + "/getdata.do", "companyId=".concat(companyId).concat("&collection=").concat(collection.name()));
        List<Map> retList = JSON.parseArray(json, Map.class);
        return retList;
    }

    private void insert(List<Map> dataList, MongoCollections collection,String index) {

        if(DbType.MONGO_DB==collection.getDbType()) {

            BulkOperations operations = mongoTemplate.bulkOps(BulkOperations.BulkMode.UNORDERED, collection.name());
            dataList.forEach(operations::insert);
            operations.execute();
        }else if(index!=null){

            //todo  es操作
            BulkRequestBuilder bulkRequest= esTemplate.getClient().prepareBulk();
          //  bulkRequest.
        }
    }


    public void deleteHistory(Long companyId,MongoCollections collection,String index){

        if(DbType.MONGO_DB==collection.getDbType()) {
            Query query = new Query(Criteria.where("companyId").is(companyId));
            mongoTemplate.remove(query, collection.name());
        }
        else{

            DeleteQuery deleteQuery=new DeleteQuery();
            deleteQuery.setIndex(collection.getPrefix().concat(index));
            deleteQuery.setType(collection.getType());
            deleteQuery.setQuery(QueryBuilders.boolQuery().must(QueryBuilders.termQuery("companyId.keyword",companyId)));
            esTemplate.delete(deleteQuery,collection.getClazz());
        }

    }
}
