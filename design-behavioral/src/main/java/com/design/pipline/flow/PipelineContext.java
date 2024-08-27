package com.design.pipline.flow;

import java.util.*;

/**
 * 流水线上下文，在流水线不同阶段流转
 *
 * @author yangjunwei
 * @date 2024/8/27
 */
public class PipelineContext<T> {

    /**
     * 上下文对象，供pipline的node获取前面阶段的结果值
     */
    private Map<String, Object> data = new HashMap<>();

    /**
     * 标志流程是否结束
     */
    private boolean processFinish = false;

    public void put(String key, Object value) {
        data.put(key, value);
    }

    public Object get(String key) {
        return data.get(key);
    }

    public Object getOrDefault(String key,Object defaultValue) {
        return data.getOrDefault(key,defaultValue);
    }

    public boolean isProcessFinish() {
        return processFinish;
    }

    /**
     * 标志pipline结束
     */
    public void setPiplineFinish() {
        this.processFinish = true;
    }


}
