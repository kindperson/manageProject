package org.manage.project.common.base;

public class BaseParam {

    /**
     * 分页页数,从1开始
     */
    private Integer page;

    /**
     * 分页条数
     */
    private Integer pageSize;

    /**
     * 分页起始点
     */
    private Integer offset;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getOffset() {
        if(page!=null&&pageSize!=null){
            return (page-1)*pageSize;
        }
        return null;
    }
}
