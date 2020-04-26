package com.yxzapp.po;

/**
 * @author youngyanjun
 * @date 2020-04-23 18:14
 */
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author youngyanjun
 * @date 2019-11-15 16:25
 */
@Data
public class BaseTreeNode {

    /**
     * 子Id
     */
    private String id;
    /**
     * 父ID
     */
    private String parentId;

    private List<BaseTreeNode> child;

    public void addChild(BaseTreeNode baseTreeNode) {
        if (this.child == null) {
            this.setChild(new ArrayList());
        }

        this.getChild().add(baseTreeNode);}
}
