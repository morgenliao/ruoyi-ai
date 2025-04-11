package org.ruoyi.knowledge.chain.vectorstore;

import cn.hutool.core.util.StrUtil;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.ruoyi.knowledge.domain.vo.KnowledgeInfoVo;
import org.ruoyi.knowledge.mapper.KnowledgeInfoMapper;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class VectorStoreFactory {

    private final WeaviateVectorStore weaviateVectorStore;

    private final MilvusVectorStore milvusVectorStore;

    @Resource
    private KnowledgeInfoMapper knowledgeInfoMapper;

    public VectorStoreFactory(WeaviateVectorStore weaviateVectorStore, MilvusVectorStore milvusVectorStore) {
        this.weaviateVectorStore = weaviateVectorStore;
        this.milvusVectorStore = milvusVectorStore;
    }

    public VectorStore getVectorStore(String kid){
        String vectorModel = "weaviate";
        if (StrUtil.isNotEmpty(kid)) {
            KnowledgeInfoVo knowledgeInfoVo = knowledgeInfoMapper.selectVoById(Long.valueOf(kid));
            if (knowledgeInfoVo != null && StrUtil.isNotEmpty(knowledgeInfoVo.getVector())) {
                vectorModel = knowledgeInfoVo.getVector();
            }
        }
        if ("weaviate".equals(vectorModel)){
            return weaviateVectorStore;
        }else if ("milvus".equals(vectorModel)){
            return milvusVectorStore;
        }
        return null;
    }
}
